import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] nrace = new int[1000^2];
    public static int[] mrace = new int[1000^2];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int change = 0;

        int nv = 0, nt = 0, mv = 0, mt = 0;
        int ntime = 1, mtime = 1;
        for (int i = 0; i < n; i++) {
            nv = sc.nextInt(); nt = sc.nextInt();
            while (nt-- > 0) {
                nrace[ntime] = nrace[ntime-1] + nv;
                ntime++;
            }
        }

        for (int i = 0; i < m; i++) {
            mv = sc.nextInt(); mt = sc.nextInt();
            while (mt-- > 0) {
                mrace[mtime] = mrace[mtime-1] + mv;
                mtime++;
            }
        }
        boolean past_n_first = true, cur_n_first = true;
        for (int i = 1; i < 1000*1000; i++) {
            if (nrace[i] > mrace[i]) cur_n_first = true;
            else if (nrace[i] < mrace[i]) cur_n_first = false;
            if (i != 1 && past_n_first != cur_n_first) {
                change++;
            }
            past_n_first = cur_n_first;
            if (nrace[i] == 0 || mrace[i] == 0) break;
        }
        System.out.print(change);
    }
}