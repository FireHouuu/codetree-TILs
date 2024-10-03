import java.util.*;

public class Main {
    public static int n, m;
    public static final int MAX_N = 50;
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[][] dp = new int[MAX_N][MAX_N];

    public static void init() {
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++)
                dp[i][j] = INT_MIN;
        dp[0][0] = 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        init();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) continue;
                for (int a = 0; a <= i; a++) {
                    for (int b = 0; b <= j; b++) {
                        if ((a == i && b == j) || dp[a][b] == INT_MIN) continue;
                        if (grid[a][b] < grid[i][j]) {
                            dp[i][j] = Math.max(dp[a][b] + 1, dp[i][j]);
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                ans = Math.max(dp[i][j], ans);
        
        System.out.println(ans);
    }
}