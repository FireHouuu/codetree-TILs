import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x_cor = new int[n];
        int[] y_cor = new int[n];
        for (int i = 0; i < n; i++) {
            x_cor[i] = sc.nextInt();
            y_cor[i] = sc.nextInt();
        }
        int min_range = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int tmp = 0;
            for(int j = 0; j < n - 1; j++) {
                if(j == i || j+1 == i) {
                    if (j == i) tmp = tmp + Math.abs(x_cor[j+1] - x_cor[j-1]) + Math.abs(y_cor[j+1] - y_cor[j-1]);
                }
                else tmp = tmp + Math.abs(x_cor[j+1] - x_cor[j]) + Math.abs(y_cor[j+1] - y_cor[j]);
            }
            min_range = Math.min(tmp, min_range);
        }
        System.out.print(min_range);
    }
}