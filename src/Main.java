import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {12, 18, 27, 36, 45};

        Solution3 solution = new Solution3();

        // Test Case 1: a = 5
        int result1 = solution.solution(5);
        System.out.println("a : 5 → " + result1); // Output: 10

        // Test Case 2: a = 10
        int result2 = solution.solution(10);
        System.out.println("a : 10 → " + result2); // Output: 17

        // Test Case 3: a = 30
        int result3 = solution.solution(30);
        System.out.println("a : 30 → " + result3); // Output: 129
    }
}