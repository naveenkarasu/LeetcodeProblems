import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide a JSON input file as an argument.");
            return;
        }

        String inputFile = args[0];
        JSONObject inputData = readJsonFromFile(inputFile);
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(arrayToListNode(inputData.getJSONArray("l1").getIntArray()), arrayToListNode(inputData.getJSONArray("l2").getIntArray()));
        System.out.println(jsonify(result));
    }

    private static JSONObject readJsonFromFile(String inputFile) throws IOException {
        StringBuilder jsonBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
            }
        }
        return new JSONObject(jsonBuilder.toString());
    }

    private static ListNode arrayToListNode(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static int[] listNodeToArray(ListNode node) {
        if (node == null) {
            return new int[0];
        }
        int[] arr = new int[getLength(node)];
        int i = 0;
        while (node != null) {
            arr[i++] = node.val;
            node = node.next;
        }
        return arr;
    }

    private static int getLength(ListNode node) {
        if (node == null) {
            return 0;
        }
        int length = 1;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    private static String jsonify(ListNode node) {
        StringBuilder sb = new StringBuilder("[");
        while (node != null) {
            sb.append(node.val);
            if (node.next != null) {
                sb.append(",");
            }
            node = node.next;
        }
        sb.append("]");
        return "{\"result\": " + sb.toString() + "}";
    }

    public static class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l3, l4 = l3 = null;
            ListNode a, b;
            a = l1;
            b = l2;
            int carry = 0;
            for (; a != null || b != null; ) {
                // if(carry==0)
                // {
                int sum = carry;
                if (a != null) {
                    sum += a.val;
                    a = a.next;
                }
                if (b != null) {
                    sum += b.val;
                    b = b.next;
                }
                int temp = sum % 10;
                ListNode t1 = new ListNode(temp);
                if (l3 == null) {
                    l4 = l3 = t1;
                } else {
                    l3.next = t1;
                    l3 = l3.next;
                }
                carry = sum / 10;

            }
            if (carry != 0) {
                ListNode t1 = new ListNode(carry);
                l3.next = t1;
            }
            return l4;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
