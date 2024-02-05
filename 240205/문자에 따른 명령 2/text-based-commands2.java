import java.util.Scanner;

public class Main {
    public static int x, y;
    public static int[] dx = new int[] {0, 1, 0, -1};
    public static int[] dy = new int[] {1, 0, -1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();
        int dir = 0; // 초기 방향
        x = 0; y = 0;
        for (int i = 0; i < order.length(); i++) {
            char command = order.charAt(i); // 문자열에서 i번째 문자에 접근
            if (command == 'L') 
                dir = (dir - 1 + 4) % 4;
            else if (command == 'R') 
                dir = (dir + 1) % 4;
            else if (command == 'F') {
                x = x + dx[dir];
                y = y + dy[dir];
            }
        }
        System.out.print(x + " " + y);
    }
}