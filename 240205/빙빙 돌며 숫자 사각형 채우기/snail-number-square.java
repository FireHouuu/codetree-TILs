import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static boolean inRange(int x, int y, int n, int m) {
        return (0 <= x && 0 <= y && x < n && y < m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int[][] plane = new int[n][m];
        int count = n * m;
        int start = 1;
        int x, y, tx, ty, dir;
        x = 0; y = 0; tx = 0; ty = 0; dir = 0;
        while (count-- > 0) {
            plane[x][y]= start;
            //System.out.print(start + " / " + x + ", " + y);
            //System.out.println();
            tx = x + dx[dir]; ty = y + dy[dir];
            if (!inRange(tx, ty, n, m) || plane[tx][ty] != 0) {
                dir = (dir + 1) % 4;
                tx = x + dx[dir]; ty = y + dy[dir]; 
            }

            x = tx; 
            y = ty;

            start++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(plane[i][j] + " ");
            }
            System.out.println();
        }
    }
}