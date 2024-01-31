import java.util.Scanner;

public class Main {
    public static final int offset = 1000;
    public static int[][] plane = new int[2*offset+1][2*offset+1];
    
    public static void fill (int x1, int y1, int x2, int y2, boolean is_a) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (is_a) plane[i][j]++;
                else plane[i][j]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt()+offset, ay1= sc.nextInt()+offset, ax2 = sc.nextInt()+offset, ay2 = sc.nextInt()+offset;
        fill(ax1, ay1, ax2, ay2, true);
        fill(sc.nextInt()+offset, sc.nextInt()+offset, sc.nextInt()+offset, sc.nextInt()+offset, false);
         int min_x = Integer.MAX_VALUE, max_x = Integer.MIN_VALUE;
        int min_y = Integer.MAX_VALUE, max_y = Integer.MIN_VALUE;
        
        for (int i = ax1; i < ax2; i++) {
            for (int j = ay1; j < ay2; j++) {
                if (plane[i][j] == 1) {
                    if (i < min_x) min_x = i;
                    if (i > max_x) max_x = i;
                    if (j < min_y) min_y = j;
                    if (j > max_y) max_y = j;
                }
            }
        }
        int area = 0;
        if (min_x <= max_x && min_y <= max_y) {
            area = (max_x - min_x + 1) * (max_y - min_y + 1);
        }
        System.out.println(area);

    }
}