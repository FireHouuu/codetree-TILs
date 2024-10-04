import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class Main {
    public static int n, sum;
    public static int ans = Integer.MAX_VALUE;
    public static int[] a = new int[10];
    public static int[] list = new int[20];

    public static void count (int cur, int len) {
        if (len == n) {
            int tmp = 0;
            for (int i = 0; i < n; i++) 
                tmp += a[i];
            int dif = Math.abs(sum - tmp - tmp);
            ans = Math.min(ans, dif);
            return;
        } 
        a[len] = list[cur];
        if (cur < 2 * n) {
            count(cur + 1, len + 1);
            count(cur + 1, len);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < 2 * n; i++) {
            list[i] = sc.nextInt();
            sum += list[i];
        }
            
        count(0, 0);
        System.out.println(ans);
    }
}