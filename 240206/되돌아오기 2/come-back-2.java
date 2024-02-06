import java.util.Scanner;

public class Main {
    public static int n, d, x, y, time, count;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();
        d = 0; x = 0; y = 0;; time = 1;
        for (int i = 0; i < order.length(); i++) {
            char dir = order.charAt(i);
            if (dir == 'R') d = (d + 1) % 4;
            else if (dir == 'L') d = (d - 1 + 4) % 4;
            else {
                x = x + dx[d]; y = y + dy[d];
                if (x == 0 && y == 0) {
                    count = time;
                    break;
                }
            }
            time++;
        }
        System.out.print(count);
    }
}