import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] A = br.readLine().toCharArray();
        int N = A.length;

        int[] preSum = new int[N];
        int[] minPrefixSumLeft = new int[N];
        int[] minPrefixSumRight = new int[N];

        // Compute prefix sums
        preSum[0] = (A[0] == '(') ? 1 : -1;
        for (int i = 1; i < N; i++) {
            preSum[i] = preSum[i - 1] + ((A[i] == '(') ? 1 : -1);
        }

        int totalBalance = preSum[N - 1];

        // Compute minimum prefix sums from left
        minPrefixSumLeft[0] = preSum[0];
        for (int i = 1; i < N; i++) {
            minPrefixSumLeft[i] = Math.min(minPrefixSumLeft[i - 1], preSum[i]);
        }

        // Compute minimum prefix sums from right
        minPrefixSumRight[N - 1] = preSum[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            minPrefixSumRight[i] = Math.min(preSum[i], minPrefixSumRight[i + 1]);
        }

        int answer = 0;

        for (int i = 0; i < N; i++) {
            int delta = (A[i] == '(') ? -2 : 2;
            int totalBalanceAfterChange = totalBalance + delta;

            // Check if total balance after change is zero
            if (totalBalanceAfterChange != 0) continue;

            // Check prefix sums before position i
            if (i > 0 && minPrefixSumLeft[i - 1] < 0) continue;

            // Check prefix sums from position i onwards
            if (minPrefixSumRight[i] + delta < 0) continue;

            answer++;
        }

        System.out.println(answer);
    }
}