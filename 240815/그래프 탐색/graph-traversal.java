import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;
    public static int count;
    public static int[][] grid;
    public static boolean[] visited;

    public static void visit(int curr) {
        for (int i = 0; i < N; i++) {
            if (!visited[i] && grid[curr][i] == 1) {
                visited[i] = true;
                count++;
                visit(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        count = 0;
        grid = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            int temp_x = sc.nextInt();
            int temp_y = sc.nextInt();
            grid[temp_x - 1][temp_y - 1] = 1;
            grid[temp_y - 1][temp_x - 1] = 1;
        }

        visited[0] = true;
        visit(0);
        System.out.println(count);
    }
}