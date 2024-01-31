import java.util.Scanner;

public class Main {
    public static int n, cnt, max_re;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        cnt = 1;
        max_re = 1;
        int cur = -1, past = -1;
        for (int i = 1; i <= n; i++) {
            cur = sc.nextInt();
            if (cur == past) {
                cnt++;
                if (cnt > max_re) max_re = cnt;
            }
            else 
                cnt = 1;
            past = cur;
        }
        System.out.print(max_re);
    }
}