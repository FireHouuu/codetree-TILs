import java.util.*;

public class Main {
    public static int n, m;
    public static int[][] grid = new int[50][50];
    public static boolean[][] visited = new boolean[50][50];
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void refresh() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = false;
            }
        }
    }

    public static boolean init(int x, int y) {
        return x < n && x >= 0 && y < m && y >= 0;
    }

    public static void DFS (int curx, int cury, int k) {
        boolean isEnd = true;
        visited[curx][cury] = true;
        for (int i = 0; i < 4; i++) {
            int tmpx = curx + dx[i];
            int tmpy = cury + dy[i];
            if (init(tmpx, tmpy) && !visited[tmpx][tmpy] && grid[tmpx][tmpy] > k) {
                visited[tmpx][tmpy] = true;
                DFS(tmpx, tmpy, k);
                isEnd = false;
            }
        }
        if (isEnd) return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int max_h = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                max_h = Math.max(max_h, grid[i][j]);
            }
        }
        int ans = 0;
        int ans_k = 1;

        for (int k = 1; k <= max_h; k++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && grid[i][j] > k) {
                        count++;
                        DFS(i, j, k);
                    }
                }
            }
            if (ans < count) {
                ans = count;
                ans_k = k;
            }
            refresh();
        }
        System.out.print(ans_k + " " + ans);
    }
}