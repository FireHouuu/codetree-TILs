import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n-1];
        int[] final_og = new int[n+1];
        for (int i = 0; i < n - 1; i++) list[i] = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int[] og = new int[n+1];
            int cnt = 1;
            og[i] = cnt++;
            boolean flag = false;
            int tmp = i;
            for (int j = 0; j < n - 1; j++) {
                int cur_sum = list[j];
                tmp = cur_sum - tmp;
                if (tmp > 0 && tmp <= n && og[tmp] == 0) {
                    og[tmp] = cnt++;
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                final_og = og.clone();
                break;
            }
        }
        for (int i = 1; i <= n; i++)
            for(int j = 1; j <= n; j++) 
                if (final_og[j] == i) System.out.print(j + " ");
    }
}