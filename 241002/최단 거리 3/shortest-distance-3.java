import java.util.*;

public class Main {
    public static int n, m;
    public static final int MAX_N = 1000;
    public static int[][] grid = new int[MAX_N + 1][MAX_N + 1];
    public static int[] dist = new int[MAX_N + 1];
    public static boolean[] visited = new boolean[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int v = sc.nextInt();
            
            if (grid[a][b] == 0) {
                grid[a][b] = v;
                grid[b][a] = v;
            } else {
                grid[a][b] = Math.min(grid[a][b], v);
                grid[b][a] = Math.min(grid[b][a], v);
            }
        }
        int start = sc.nextInt();
        int target = sc.nextInt();

        for (int i = 1; i <= n; i++) 
            dist[i] = (int)1e9;
        dist[start] = 0;

        for (int i = 1; i <= n; i++) {
            int minIndex = -1;
            for (int j = 1; j <= n; j++) {
                if (visited[j]) continue;
                if (minIndex == -1 || dist[minIndex] > dist[j])
                    minIndex = j;
            }

            visited[minIndex] = true;
            for (int j = 1; j <= n; j++) {
                if(grid[minIndex][j] == 0) continue;
                dist[j] = Math.min(dist[j], dist[minIndex] + grid[minIndex][j]);
            }
        }
        System.out.print(dist[target]);
    }
}