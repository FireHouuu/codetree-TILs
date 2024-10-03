import java.util.*;

public class Main {
    public static int n;
    public static int[] dp = new int[1000];
    public static int[] list = new int[1000];
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void initialize() {
        // 최댓값을 구하는 문제이므로
        // 초기값은 전부 INT_MIN으로 넣어줍니다.
        for(int i = 0; i < n; i++)
            dp[i] = INT_MIN;
        
        // 시작 위치에서는
        // 가능한 최대 점프 횟수가 0이므로
        // dp[0] = 0이 초기조건이 됩니다.
        dp[0] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) 
            list[i] = sc.nextInt();
        initialize();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (list[j] == INT_MIN) continue;
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