import java.util.Scanner;

public class Main {
    public static final int MAX_n = 1000;
    public static final int MAX_x = 100;
    public static int[] a = new int[MAX_n];
    public static int[] blocks = new int[2 * MAX_n * MAX_x + 1];
    public static int n, white, black;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int cur = MAX_n * MAX_x;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'L') {
                while(x-- > 0) {
                    blocks[cur] = 1;
                    if (x > 0) cur--;
                }
            }
            else {
                while(x-- > 0) {
                    blocks[cur] = 2;
                    if (x > 0) cur++;
                }
            }
        }

        for (int i = 0; i <= 2 * MAX_n * MAX_x; i++) {
            if (blocks[i] == 1) white++;
            else if(blocks[i] == 2) black++;
        }

        System.out.print(white + " " + black);
    }
}