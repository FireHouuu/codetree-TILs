import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MOD = 10007;
    public static final int MAX = 1000;
    public static int[] dp = new int[MAX+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % MOD;
        }
        System.out.println(dp[n]);
    }
}