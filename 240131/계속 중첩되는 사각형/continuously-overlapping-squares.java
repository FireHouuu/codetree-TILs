import java.util.Scanner;

public class Main {
    public static final int offset = 100;
    public static int[][] plane = new int[2*offset+1][2*offset+1];
    public static int blue_area, n;

    public static void fill (int x1, int y1, int x2, int y2, int is_red) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (is_red % 2 == 1) plane[i][j] = 1;
                else plane[i][j] = 2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int is_red = 1;
        for (int i = 0; i < n; i++) {
            fill(sc.nextInt()+offset, sc.nextInt()+offset, sc.nextInt()+offset, sc.nextInt()+offset, is_red);
            is_red++;
        }
        blue_area = 0;
        for (int i = 0; i <= 2*offset; i++) 
            for (int j = 0; j <= 2*offset; j++)
                if (plane[i][j] == 2) blue_area++;
        
        System.out.print(blue_area);
        
    }
}