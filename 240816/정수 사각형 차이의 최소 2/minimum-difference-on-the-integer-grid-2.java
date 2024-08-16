import java.util.Scanner;

class Minmax {
    int min, max;

    public Minmax(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

public class Main {
    public static int n;
    public static final int MAX_N = 100;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static Minmax[][] dp = new Minmax[MAX_N][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                dp[i][j] = new Minmax(grid[i][j], grid[i][j]);
            }
        }

        // 첫 번째 행 초기화
        for (int j = 1; j < n; j++) {
            dp[0][j].min = Math.min(dp[0][j-1].min, grid[0][j]);
            dp[0][j].max = Math.max(dp[0][j-1].max, grid[0][j]);
        }

        // 첫 번째 열 초기화
        for (int i = 1; i < n; i++) {
            dp[i][0].min = Math.min(dp[i-1][0].min, grid[i][0]);
            dp[i][0].max = Math.max(dp[i-1][0].max, grid[i][0]);
        }

        // DP 갱신
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int minLeft = Math.min(dp[i][j-1].min, grid[i][j]);
                int maxLeft = Math.max(dp[i][j-1].max, grid[i][j]);
                int leftDiff = maxLeft - minLeft;

                int minUp = Math.min(dp[i-1][j].min, grid[i][j]);
                int maxUp = Math.max(dp[i-1][j].max, grid[i][j]);
                int upDiff = maxUp - minUp;

                if (leftDiff < upDiff) {
                    dp[i][j].min = minLeft;
                    dp[i][j].max = maxLeft;
                } else {
                    dp[i][j].min = minUp;
                    dp[i][j].max = maxUp;
                }
            }
        }

        int ans = dp[n-1][n-1].max - dp[n-1][n-1].min;
        System.out.println(ans);
    }
}