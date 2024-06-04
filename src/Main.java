import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {12, 18, 27, 36, 45};

        Solution2 solution = new Solution2();

        System.out.println("Test Case 1: " + solution.solution(arr1)); // Output: 11
        System.out.println("Test Case 2: " + solution.solution(arr2)); // Output: 126
    }
}