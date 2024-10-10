import java.util.Scanner;

public class Main {
    static int N;
    static long totalArea = 0;
    static int[] x1, y1, x2, y2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        x1 = new int[N];
        y1 = new int[N];
        x2 = new int[N];
        y2 = new int[N];

        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }

        int subsets = 1 << N; // 부분 집합의 수
        for (int mask = 1; mask < subsets; mask++) {
            int x_left = -100000;
            int y_top = 100000;
            int x_right = 100000;
            int y_bottom = -100000;
            int bits = Integer.bitCount(mask);

            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0) {
                    x_left = Math.max(x_left, x1[i]);
                    y_top = Math.min(y_top, y1[i]);
                    x_right = Math.min(x_right, x2[i]);
                    y_bottom = Math.max(y_bottom, y2[i]);
                }
            }

            if (x_left < x_right && y_bottom < y_top) {
                long area = (long)(x_right - x_left) * (y_top - y_bottom);
                if (bits % 2 == 1) {
                    totalArea += area;
                } else {
                    totalArea -= area;
                }
            }
        }

        System.out.println(totalArea);
    }
}