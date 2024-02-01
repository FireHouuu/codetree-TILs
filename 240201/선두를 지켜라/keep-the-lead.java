import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] nrace = new int[1001 * 1000]; // 최대 n * t 시간까지 고려
    public static int[] mrace = new int[1001 * 1000]; // 최대 m * t 시간까지 고려
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int change = 0;

        int nv = 0, nt = 0, mv = 0, mt = 0;
        int ntime = 1, mtime = 1;
        for (int i = 0; i < n; i++) {
            nv = sc.nextInt(); nt = sc.nextInt();
            for (int j = 0; j < nt; j++) {
                nrace[ntime] = nrace[ntime-1] + nv;
                ntime++;
            }
        }

        for (int i = 0; i < m; i++) {
            mv = sc.nextInt(); mt = sc.nextInt();
            for (int j = 0; j < mt; j++) {
                mrace[mtime] = mrace[mtime-1] + mv;
                mtime++;
            }
        }

        boolean past_n_first = true, cur_n_first = true;
        int maxTime = Math.max(ntime, mtime); // 더 긴 시간을 최종 시간으로 설정
        for (int i = 1; i < maxTime; i++) {
            if (nrace[i] > mrace[i]) cur_n_first = true;
            else if (nrace[i] < mrace[i]) cur_n_first = false;
            if (i != 1 && past_n_first != cur_n_first) {
                change++;
            }
            past_n_first = cur_n_first;
        }
        System.out.print(change);
    }
}