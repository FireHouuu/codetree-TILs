import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static final int MAX = 101;
    public static int[][] grid = new int[MAX][MAX];
    public static boolean[][] visited = new boolean[MAX][MAX];
    public static int ans = 0;

    public static boolean inRange(int x, int y) {
        return 1 <= x && x <= n && 1 <= y && y <= m;
    }

    public static boolean checkGo(int x, int y) {
        if (!inRange(x, y) || grid[x][y] == 0 || visited[x][y]) return false;
        return true;
    }

    public static void DFS(int x, int y) {
        int[] dx = new int[]{1, 0};
        int[] dy = new int[]{0, 1};

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (checkGo(nx, ny)) {
                if(nx == n && ny == m) {
                    ans = 1;
                    return;
                }
                visited[nx][ny] = true;
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        DFS(1, 1);
        System.out.println(ans);
    }
}