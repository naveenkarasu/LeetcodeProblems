import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide a JSON file as an argument.");
            return;
        }

        String jsonStr = readJsonFile(args[0]);
        JSONObject jsonObject = new JSONObject(jsonStr);
        int[] nums = convertArray(jsonObject.getJSONArray("nums"));
        int target = jsonObject.getInt("target");

        Solution solution = new Solution();
        int[] result = solution.solve(nums, target);

        System.out.println("{\"result\": [" + result[0] + ", " + result[1] + "]}");
    }

    private static String readJsonFile(String filePath) throws IOException {
        StringBuilder jsonStrBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonStrBuilder.append(line).append("\n");
            }
        }
        return jsonStrBuilder.toString().trim();
    }

    private static int[] convertArray(JSONObject arrayObject) {
        int[] result = new int[arrayObject.length()];
        for (int i = 0; i < arrayObject.length(); i++) {
            result[i] = arrayObject.getInt(i);
        }
        return result;
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int ar[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if ((nums[i] + nums[j]) == target) {
                    ar[0] = i;
                    ar[1] = j;
                }
        }
        return ar;
    }

    public static int[] solve(int[] nums, int target) {
        return new Solution().twoSum(nums, target);
    }
}
