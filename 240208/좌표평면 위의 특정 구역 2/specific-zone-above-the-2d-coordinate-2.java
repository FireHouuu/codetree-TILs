import java.util.Scanner;

public class Main {
    public static int n, x_max, x_min, y_max, y_min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int min_range = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            x_max = Integer.MIN_VALUE; y_max = Integer.MIN_VALUE;
            x_min = Integer.MAX_VALUE; y_min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                x_max = Math.max(x_max, x[j]); y_max = Math.max(y_max, y[j]);
                x_min = Math.min(x_min, x[j]); y_min = Math.min(y_min, y[j]);
            }
            min_range = Math.min(min_range, (x_max-x_min) * (y_max-y_min));
        }
        System.out.print(min_range);
    }
}