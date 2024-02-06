import java.util.Scanner;

public class Main {
    public static int n, count, d, x, y;
    public static int[] dx = new int[]{0, -1, 0, 1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static boolean inRange(int x, int y) {
        return(0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count = 1;
        int[][] plane = new int[n][n];
        x = n / 2; y = n / 2; d = 0;
        int tx, ty;
        for (int i = 0; i < n * n; i++) {
            plane[x][y] = count;
            tx = x + dx[d]; ty = y + dy[d];
            if (!inRange(tx, ty) || plane[tx][ty] != 0) {
                d = (d + 1) % 4;
                tx = x + dx[d]; ty = y + dy[d];
            }
            x = tx; y = ty;
            count++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(plane[i][j] + " ");
            }
            System.out.println();
        }
    }
}