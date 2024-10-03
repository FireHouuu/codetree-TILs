import java.util.*;

public class Main {
    public static int n;
    public static final int MAX_N = 1000;
    public static int[] list1 = new int[MAX_N + 1];
    public static int[] list2 = new int[MAX_N + 1];
    public static int[] db1 = new int[MAX_N + 1];
    public static int[] db2 = new int[MAX_N + 1];

    public static void init() {
        for (int i = 1; i <= n; i++) {
            db1[i] = Integer.MIN_VALUE;
            db2[i] = Integer.MIN_VALUE;
        }
        db1[0] = 0;
        db2[0] = 0;
        list1[0] = 0;
        list2[0] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            list1[i] = tmp;
            list2[n - 1 - i] = tmp;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (db1[j] == Integer.MIN_VALUE) continue;
                if (list1[j] < list1[i])
                    db1[i] = Math.max(db1[i], db1[j] + 1);
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (db2[j] == Integer.MIN_VALUE) continue;
                if (list2[j] < list2[i])
                    db2[i] = Math.max(db2[i], db2[j] + 1);
            }
        }

        int[] sum = new int[n];

        for (int i = 0; i < n; i++) 
            sum[i] = db1[i] + db2[n-1-i];
        
        int ans = 0;
        for (int i = 0; i < n; i++)
            ans = Math.max(sum[i], ans);

        System.out.println(ans + 1);
    }
}