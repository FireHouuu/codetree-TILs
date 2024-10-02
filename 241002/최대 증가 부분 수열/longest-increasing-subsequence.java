import java.util.*;

public class Main {
    public static int n;
    public static int[] dp = new int[1001];
    public static int[] a = new int[1001];

    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void init(int n) {
        for (int i = 1; i <= n; i++)
            dp[i] = -INT_MIN;
        dp[0] = 0;
        a[0] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        
        for (int i = 1; i<= n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) 
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int ans = 0;
        for(int i = 0; i <= n; i++)
            ans = Math.max(ans, dp[i]);
        
        System.out.println(ans);

    }
}