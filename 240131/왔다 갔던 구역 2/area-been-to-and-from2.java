import java.util.Scanner;

public class Main {
    public static final int MAX_n = 100;
    public static int[] a = new int[MAX_n];
    public static int[] blocks = new int[2000];
    public static int n, range;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int tmp_int = 0;
        char tmp_char;
        for (int i = 1; i <= n; i++) {
            tmp_int = sc.nextInt();
            tmp_char = sc.next().charAt(0);
            if (tmp_char == 'L')
                tmp_int = 0 - tmp_int;
            a[i] = tmp_int;
        }

        int itter = 1000;
        int plus = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                for (int j = itter + a[i] + 1; j <= itter; j++) 
                blocks[j]++;
            }
            else { 
                for (int j = itter; j < itter + a[i]; j++) 
                blocks[j]++;
            }
        }
        range = 0;
        for (int i = 0; i < 2000; i++) 
            if (blocks[i] >= 2)
                range++;
        System.out.print(range);
    }
}