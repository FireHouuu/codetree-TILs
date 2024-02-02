import java.util.Scanner;

public class Main {
    public static int n, m, change;
    public static int[] timelineA = new int[1000*1000 + 1];
    public static int[] timelineB = new int[1000*1000 + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int va, ta, vb, tb;
        int timeA = 1, timeB = 1;
        for (int i = 0; i < n; i++) {
            va = sc.nextInt(); ta = sc.nextInt();
            while(ta-- > 0) {
                timelineA[timeA] = timelineA[timeA-1] + va;
                timeA++;
            }
        }

        for (int i = 0; i < m; i++) {
            vb = sc.nextInt(); tb = sc.nextInt();
            while(tb-- > 0) {
                timelineB[timeB] = timelineB[timeB-1] + vb;
                timeB++;
            }
        }

        int state = 0;
        for (int i = 1; i < timeA; i++) {
            if (state != 1 && timelineA[i] < timelineB[i]) {
                change++;
                state = 1;
            }
            else if (state != -1 && timelineA[i] > timelineB[i]) {
                change++;
                state = -1;
            }
            else if (state != 0 && timelineA[i] == timelineB[i]) {
                change++;
                state = 0;
            }
        }

        System.out.print(change);
    }
}