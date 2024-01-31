import java.util.Scanner;

public class Main {
    public static final int offset = 100;
    public static int[][] plane = new int[2*offset+1][2*offset+1];
    public static int n, area;

    public static void fill (int x, int y) {
        for (int i = x; i < x + 8; i++)
            for (int j = y; j < y + 8; j++)
                plane[i][j]++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
            fill(sc.nextInt()+offset, sc.nextInt()+offset);
        
        area = 0;
        for (int i = 0; i <= 2*offset; i++)
            for (int j = 0; j <= 2*offset; j++)
                if (plane[i][j] != 0)
                    area++; 
        System.out.print(area);
    }   
}