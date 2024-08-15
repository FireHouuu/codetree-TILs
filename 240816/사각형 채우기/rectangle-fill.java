import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_NUM = 1001;
    public static final int MOD = 10007;
    public static int[] dp = new int[MAX_NUM];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }
        System.out.println(dp[n]);
    }
}