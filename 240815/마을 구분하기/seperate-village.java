import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static int n;
    public static final int MAX_NUM = 25;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM];
    public static ArrayList<Integer> peopleNums = new ArrayList<>();
    public static int peopleNum;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static boolean canGo(int x, int y) {
        if (!inRange(x, y)) return false;
        if (visited[x][y] || grid[x][y] == 0) return false;
        return true;
    }

    public static void DFS(int x, int y) {
        int[] dx = new int[]{1, 0};
        int[] dy = new int[]{0, 1};

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (canGo(nx, ny)) {
                visited[nx][ny] = true;
                peopleNum++;
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

       for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
               if(canGo(i, j)) {
                visited[i][j] = true;
                peopleNum = 1;
                DFS(i, j);
                peopleNums.add(peopleNum);
               }
            }
        }
        Collections.sort(peopleNums);
        System.out.println((int) peopleNums.size());
        for(int i = 0; i < (int) peopleNums.size(); i++)
            System.out.println(peopleNums.get(i));
    }
}