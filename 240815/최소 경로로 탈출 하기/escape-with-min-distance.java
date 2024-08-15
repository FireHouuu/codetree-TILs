import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int n, m;
    public static final int max_x = 100, max_y = 100;
    public static int[][] grid = new int[max_x][max_y];
    public static int[][] step = new int[max_x][max_y];
    public static boolean[][] visited = new boolean[max_x][max_y];

    public static Queue<Pair> q = new LinkedList<>();
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static boolean canGo(int x, int y) {
        if (!inRange(x, y)) return false;
        if (visited[x][y] || grid[x][y] == 0) return false;
        return true; 
    }

    public static void push(int x, int y, int s) {
        step[x][y] = s;
        visited[x][y] = true;
        q.add(new Pair(x, y));
    }

    public static void BFS() {
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int x = curr.x; int y = curr.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i]; int ny = y + dy[i];
                if (canGo(nx, ny)) {
                    push(nx, ny, step[x][y] + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        push(0, 0, 0);
        BFS();

        if (step[n-1][m-1] == 0) System.out.println(-1);
        else System.out.println(step[n-1][m-1]);
    }
}