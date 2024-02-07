import java.util.Scanner;

public class Main {
    public static int x, y, result, win;
    public static int[][] plane = new int[19][19];
    public static int[] dx = new int[]{0, 1, 1, -1};
    public static int[] dy = new int[]{1, 0, 1, 1};

    public static boolean inRange(int x, int y) {
        return (0 <= x && 0 <= y && x < 19 && y < 19);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 19; i++) 
            for (int j = 0; j < 19; j++) 
                plane[i][j] = sc.nextInt();
        
        boolean flag = false;
        int dir = 0;
        for (int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++) {
                int color = plane[i][j];
                if (color == 0) continue;
                for(int d = 0; d < 4; d++) {
                    int five = 0;
                    for (int k = 0; k < 5; k++) {
                        int tx = i + k * dx[d]; int ty = j + k * dy[d];
                        if (inRange(tx, ty) && color == plane[tx][ty]) five++; 
                    }
                    if (five == 5) {
                        flag = true;
                        dir = d; x = i + 1; y = j + 1;
                        win = color;
                        break;
                    }
                }
                if (flag) break;
            }
            if (flag) break;
        }
        x = x + 2 * dx[dir]; y = y + 2 * dy[dir];
        System.out.print(win);
        if (win != 0) {
            System.out.println();
            System.out.print(x + " " + y);
        }
    }
}