public class Solution3 {
    public int solution(int a) {
        int answer = 0;

        for (int i = 2; i <= a; i++) {
            if (isPrime(i)) {
                answer += i;
            }
        }

        return answer;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
