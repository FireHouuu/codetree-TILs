import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] cups = new int[4];
    public static boolean game(int[] ord) {
        int a = ord[0];
        int b = ord[1];
        int c = ord[2];
        int tmp = cups[a];
        cups[a] = cups[b];
        cups[b] = tmp;
        return cups[c] == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] order = new int[n][3];
        for (int i = 0; i < n; i++) {
            order[i][0] = sc.nextInt();
            order[i][1] = sc.nextInt();
            order[i][2] = sc.nextInt();
        }
        int max_score = 0;
        for (int i = 1; i <= 3; i++) {
            int score = 0;
            for (int j = 1; j <= 3; j++) cups[j] = 0;
            cups[i] = 1;
            for (int j = 0; j < n; j++) 
                if (game(order[j])) score++;
            max_score = Math.max(max_score, score);
        }
        System.out.print(max_score);
    }
}