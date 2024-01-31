import java.util.Scanner;

public class Main {
    public static final int MAX_n = 1000;
    public static int[] a = new int[MAX_n];
    public static int[] blocks_w = new int[200000];
    public static int[] blocks_b = new int[200000];
    public static int[] blocks_color = new int[200000];
    public static int n, range, white, black, gray;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int tmp_int = 0;
        char tmp_char;
        for (int i = 0; i < n; i++) {
            tmp_int = sc.nextInt();
            tmp_char = sc.next().charAt(0);
            if (tmp_char == 'L')
                tmp_int = -tmp_int;
            a[i] = tmp_int;
        }

        int itter = 100000;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                for (int j = itter; j > itter + a[i]; j--) {
                    if (blocks_color[j] < 3) {
                        blocks_w[j]++;
                        if (blocks_w[j] > 1 && blocks_b[j] > 1)
                            blocks_color[j] = 3;
                        else 
                            blocks_color[j] = 1;
                    }
                }
                itter = itter + a[i] + 1;
            }
            else { 
                for (int j = itter; j < itter + a[i]; j++) {
                    if (blocks_color[j] < 3) {
                        blocks_b[j]++;
                        if (blocks_w[j] > 1 && blocks_b[j] > 1)
                            blocks_color[j] = 3;
                        else 
                            blocks_color[j] = 2;
                    }
                }
                itter = itter + a[i] - 1;
            }
        }
        gray = 0;
        black = 0;
        white = 0;

        for (int i = 0; i < 2000; i++) {
            if (blocks_color[i] == 1) white++;
            else if (blocks_color[i] == 2) black++;
            else if (blocks_color[i] == 3) gray++;
        }
        System.out.print(white + " " + black + " " + gray);
    }
}