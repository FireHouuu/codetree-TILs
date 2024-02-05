import java.util.Scanner;

public class Main {
    public static int n, x, y;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        n = sc.nextInt();
        x = 0; y = 0;
        int range = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0); // 방향을 한 번만 읽어서 저장
            range = sc.nextInt(); // 거리를 읽음
            if(direction == 'E') {
                x = x + range*dx[0];
                y = y + range*dy[0];
            }
            else if(direction == 'W') {
                x = x + range*dx[1];
                y = y + range*dy[1];
            }
            else if(direction == 'S') {
                x = x + range*dx[2];
                y = y + range*dy[2];
            }
            else if(direction == 'N') {
                x = x + range*dx[3];
                y = y + range*dy[3];
            }
        }

        System.out.print(x + " " + y);
    }
}