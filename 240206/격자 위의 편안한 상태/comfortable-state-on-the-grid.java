import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && 0 <= y && x < n && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int[][] plane = new int[n][n];
        int tmp_i, tmp_j, count;
        count = 0;
        for (int i = 0; i < m; i++) {
            tmp_i = sc.nextInt() - 1;
            tmp_j = sc.nextInt() - 1;

            for (int j = 0; j < 4; j++) 
                if (inRange(tmp_i+dx[j], tmp_j+dy[j], n) && plane[tmp_i+dx[j]][tmp_j+dy[j]] == 1)
                    count++;
            
            if (count == 3) System.out.print(1);
            else System.out.print(0);
            System.out.println();
            plane[tmp_i][tmp_j] = 1;
            count = 0;
        }
    }
}