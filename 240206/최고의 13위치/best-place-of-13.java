import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] plane = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                plane[i][j] = sc.nextInt();
        
        int Max_count = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int k = 0; k < 3; k++) {
                    if (plane[i][j+k] == 1) count++;
                }
                Max_count = Math.max(Max_count, count);
                count = 0;
            }
        }
        System.out.print(Max_count);
    }
}