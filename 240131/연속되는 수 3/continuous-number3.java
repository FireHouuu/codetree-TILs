import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int cnt = 0, max_cnt = 1;
        boolean was_plus = true;
        int cur = 0;
        for (int i = 1; i <= n; i++) {
            cur = sc.nextInt();

            if (cur > 0) {
                if (i == 0 || was_plus == true) cnt++;
                else cnt = 1;
                was_plus = true;
            }
            else {
                if (i == 0 || was_plus == false) cnt++;
                else cnt = 1;
                was_plus = false;
            }

            if (cnt > max_cnt) max_cnt = cnt;
        }

        System.out.print(max_cnt);
        
    }
}