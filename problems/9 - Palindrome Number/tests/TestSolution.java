import org.json.JSONObject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String jsonInput = new Scanner(System.in).nextLine();
        JSONObject jsonObject = new JSONObject(jsonInput);
        int x = jsonObject.getInt("x");
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(x);
        System.out.println("{\"result\": " + (result ? 1 : 0) + "}");
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x > 0))
            return false;
        long r = 0;
        for (int temp = x; temp > 0; temp /= 10) {
            r = r * 10 + temp % 10;
        }
        return x == r;
    }
}
```

Note: This code assumes that the JSON input is provided as a command line argument. The `main` method reads the JSON input, parses it into a `JSONObject`, and then calls the `isPalindrome` method on the `Solution` class. The result is printed to the console in the required format.
