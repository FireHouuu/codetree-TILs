import java.util.Scanner;

public class Main {
    public static int n, start, x, y, d, count;
    public static int[] dx = new int[]{0, 0, 1, -1};
    public static int[] dy = new int[]{-1, 1, 0, 0};

    public static int reflect(int dir, int mirror) {
        if (mirror == 0) return (dir + 2) % 4;
        else return (3 - dir);
    }

    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && 0 <= y && x < n && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        int[][] plane = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                if(line.charAt(j) == '/') plane[i][j] = 0;
                else plane[i][j] = 1;
            }
        }
        start = sc.nextInt();
        float first = (float)start / n;
        int second = start % n;
        if (first <= 1) {
            x = 0;
            d = 2;
            if (second == 0) y = n - 1 ;
            else y = second - 1;
        }
        else if (first <= 2) {
            y = n - 1; 
            d = 0;
            if (second == 0) x = n - 1 ;
            else x = second - 1;
        }
        else if (first <= 3) {
            x = n - 1; 
            d = 3;
            if (second == 0) y = 0;
            else y = n - second;
        }
        else {
            y = 0; 
            d = 1;
            if (second == 0) x = 0;
            else x = n - second;
        }
        count = 0;
        while (inRange(x, y, n)) {
            d = reflect(d, plane[x][y]);
            x = x + dx[d]; y = y + dy[d];
            count++;
        }
        System.out.print(count);
    }
}