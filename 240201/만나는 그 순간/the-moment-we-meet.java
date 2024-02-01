import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int time = 1000;
    public static int[] nline = new int[time+1];
    public static int[] mline = new int[time+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int tmp = 0;
        nline[0] = 0;
        mline[0] = 0;
        char direction;

        int ntime = 0; // A의 현재 시간
        int npos = 0; // A의 현재 위치
        for (int i = 1; i <= n; i++) {
            direction = sc.next().charAt(0);
            tmp = sc.nextInt();
            int move = (direction == 'L') ? -tmp : tmp;
            for (int j = 0; j < tmp; j++) {
                npos += (direction == 'L') ? -1 : 1;
                nline[ntime++] = npos;
            }
        }

        int mtime = 0; // B의 현재 시간
        int mpos = 0; // B의 현재 위치
        for (int i = 1; i <= m; i++) {
            direction = sc.next().charAt(0);
            tmp = sc.nextInt();
            int move = (direction == 'L') ? -tmp : tmp;
            for (int j = 0; j < tmp; j++) {
                mpos += (direction == 'L') ? -1 : 1;
                mline[mtime++] = mpos;
            }
        }

        // 두 사람이 만나는 시간 찾기
        int meet = -1;
        for (int i = 0; i < Math.min(ntime, mtime); i++) {
            if (nline[i] == mline[i]) {
                meet = i + 1; // 시간은 1부터 시작하므로 1을 더합니다.
                break;
            }
        }

        System.out.print(meet);
    }
}