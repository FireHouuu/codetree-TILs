import java.util.Scanner;

public class Main {
    public static int n, x, y, time, count;
    public static int[][] plane = new int[1001][1001];
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static int dir(char d) {
        if (d == 'E') return 0;
        else if (d == 'S') return 1;
        else if (d == 'W') return 2;
        else return 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = 0; y = 0;
        int tmp = 0;
        int dirnum = 0;
        time = 1;
        count = -1;
        boolean isDone = false;
        while (n-- > 0) {
            dirnum = dir(sc.next().charAt(0));
            tmp = sc.nextInt();
            while (tmp-- > 0) {
                x = x + dx[dirnum]; y = y + dy[dirnum];
                if (x == 0 && y == 0) {
                    count = time;
                    isDone = true;
                    break;
                }
                time++;
            }
            if (isDone) break;
        }

        System.out.print(count);
    }
}