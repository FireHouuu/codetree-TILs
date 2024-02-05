import java.util.Scanner;

public class Main {
    public static int n,t;
    public static int[] dy = new int[]{0, -1, 1, 0};
    public static int[] dx = new int[]{-1, 0, 0, 1};

    public static boolean inRange(int x, int y, int n) {
        return (1 <= x && 1 <= y && x <= n && y <= n);
    }

    public static int dir(char input) {
        if (input == 'U') return 0;
        else if (input == 'D') return 3;
        else if (input == 'R') return 1;
        else return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); t = sc.nextInt();
        int[][] plane = new int[n+1][n+1];
        int x, y, ahead;
        x = sc.nextInt(); y = sc.nextInt();
        char d = sc.next().charAt(0);
        ahead = dir(d);

        while (t-- > 0) {
            if (!inRange(x+dx[ahead], y+dy[ahead], n)) {
                ahead = 3 - ahead;
                continue;
            }
            x = x + dx[ahead];
            y = y + dy[ahead];
        }
        System.out.print(x + " " + y);
    }
}