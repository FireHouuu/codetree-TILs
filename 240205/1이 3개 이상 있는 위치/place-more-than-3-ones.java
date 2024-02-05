import java.util.Scanner;

public class Main {
    public static int n, count;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y, int wide) {
        return (0 <= x && x < wide && 0 <= y && y < wide);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] plane = new int[n][n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                plane[i][j] = sc.nextInt();
        int tmp = 0, tx = 0, ty = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    tx = i + dx[k]; ty = j + dy[k];
                    if (inRange(tx, ty, n) && plane[tx][ty] == 1) tmp++;
                }
                if (tmp >= 3) count++;
                tmp = 0;
            } 
        }
        System.out.print(count);
    }
}