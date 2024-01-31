import java.util.Scanner;

public class Main {
    public static final int MAX_w = 1000;
    public static final int offset = 1000;
    public static int[][] field = new int[2*MAX_w+1][2*MAX_w+1];
    public static int wide;

    public static void fill (int x1, int y1, int x2, int y2, boolean is_M) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (is_M) field[i][j]--;
                else field[i][j]++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1, ax2, ay1, ay2, bx1, bx2, by1, by2, mx1, mx2, my1, my2;
        ax1 = sc.nextInt()+offset;
        ay1 = sc.nextInt()+offset;
        ax2 = sc.nextInt()+offset;
        ay2 = sc.nextInt()+offset;
        bx1 = sc.nextInt()+offset;
        by1 = sc.nextInt()+offset;
        bx2 = sc.nextInt()+offset;
        by2 = sc.nextInt()+offset;
        mx1 = sc.nextInt()+offset;
        my1 = sc.nextInt()+offset;
        mx2 = sc.nextInt()+offset;
        my2 = sc.nextInt()+offset;
        fill(ax1, ay1, ax2, ay2, false);
        fill(bx1, by1, bx2, by2, false);
        fill(mx1, my1, mx2, my2, true);
        wide = 0;

        for (int i = 0; i <= 2*MAX_w; i++)
            for (int j = 0; j <= 2*MAX_w; j++)
                if (field[i][j] == 1) wide++;
    
        System.out.print(wide);
    }
}