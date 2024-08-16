import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 100;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[][] dp = new int[MAX_N][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }

        System.out.println(dp[n-1][n-1]);
    }
}