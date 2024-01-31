import java.util.Scanner;

public class Main {
    public static final int offset = 100;
    public static final int wide = 100;
    public static int[][] plane = new int[2*wide+1][2*wide+1];
    public static int nubi, n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x1, y1, x2, y2;
        for (int i = 0; i < n; i++) {
            x1 = sc.nextInt() + offset;
            y1 = sc.nextInt() + offset;
            x2 = sc.nextInt() + offset;
            y2 = sc.nextInt() + offset;

            for (int a = x1; a < x2; a++) {
                for (int b = y1; b < y2; b++) 
                    plane[a][b]++;
            }
        }
        nubi = 0;
        for (int a = 0; a <= 2*wide; a++) 
            for (int b = 0; b <= 2*wide; b++)
                if (plane[a][b] != 0)
                    nubi++;
        System.out.print(nubi);
    }
}