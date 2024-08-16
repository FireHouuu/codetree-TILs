import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX = 100;
    public static int[][] grid = new int[MAX][MAX];
    public static int[][] dp = new int[MAX][MAX];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        dp[0][n-1] = grid[0][n-1];

        for (int i = 1; i < n; i++) {
            dp[0][n - 1 - i] = dp[0][n - i] + grid[0][n - 1 - i];
            dp[i][n-1] = dp[i - 1][n-1] + grid[i][n - 1];
        }

        for (int i = 1; i < n; i++) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = Math.min(dp[i][j+1], dp[i-1][j]) + grid[i][j];
            }
        }

        System.out.println(dp[n-1][0]);
    }
}