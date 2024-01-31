import java.util.Scanner;

public class Main {
    public static final int offset = 100;
    public static int[][] plane = new int[2*offset+1][2*offset+1];
    public static int blue_area, n;

    public static void fill (int x1, int y1, int x2, int y2, boolean is_red) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (is_red) plane[i][j] = 1;
                else plane[i][j] = 2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n/2; i++) {
            fill(sc.nextInt()+offset, sc.nextInt()+offset, sc.nextInt()+offset, sc.nextInt()+offset, true);
            fill(sc.nextInt()+offset, sc.nextInt()+offset, sc.nextInt()+offset, sc.nextInt()+offset, false);
        }
        blue_area = 0;
        for (int i = 0; i <= 2*offset; i++) 
            for (int j = 0; j <= 2*offset; j++)
                if (plane[i][j] == 2) blue_area++;
        
        System.out.print(blue_area);
        
    }
}