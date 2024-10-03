import java.util.*;

public class Main {
    public static int n;
    public static int[] dp = new int[1000];
    public static int[] list = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) 
            list[i] = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((i - j) <= list[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++)   
            ans = Math.max(ans, dp[i]);

        System.out.println(ans);
    }
}