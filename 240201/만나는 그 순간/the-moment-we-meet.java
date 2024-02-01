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

        for (int i = 0; i <= time; i++) {
            nline[i] = time + 2;
            mline[i] = time + 3;
        }

        int ntime = 1;
        for (int i = 1; i <= n; i++) {
            direction = sc.next().charAt(0);
            tmp = sc.nextInt();
            int plus = 1;
            if (direction == 'L') plus = -plus;
            for (int j = ntime; j <= ntime + tmp; j++) 
                nline[j] = nline[j-1] + plus; 
            ntime = ntime + tmp;
        }

        int mtime = 1;
        for (int i = 1; i <= m; i++) {
            direction = sc.next().charAt(0);
            tmp = sc.nextInt();
            int plus = 1;
            if (direction == 'L') plus = -plus;
            for (int j = mtime; j <= mtime + tmp; j++) 
                mline[j] = mline[j-1] + plus; 
            mtime = mtime + tmp;
        }

        int meet = -1;
        for (int i = 1; i <= 1000; i++) {
            if (nline[i] == mline[i]) {
                meet = i;
                System.out.print(nline[i] + " " + i + " ");
                break;
            }
        }
        
        System.out.print(meet);
    }
}