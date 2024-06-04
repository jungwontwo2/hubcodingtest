public class Solution7 {
    public int Function(int n) {
        // O(1)
        int a = 1;
        int b = 2;

        // O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        // O(log n)
        int i = n;
        while (i > 1) {
            i /= 2;
            System.out.println(i);
        }

        // O(n log n)
        for (int k = 0; k < n; k++) {
            i = k;
            while (i > 1) {
                i /= 2;
                System.out.println(k + " " + i);
            }
        }

        return a + b;
    }
}