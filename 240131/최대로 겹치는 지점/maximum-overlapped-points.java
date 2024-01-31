import java.util.Scanner;

public class Main {
    public static final int MAX_n = 100;
    public static int[] a = new int[MAX_n];
    public static int[] b = new int[MAX_n];
    public static int[] blocks = new int[101];
    public static int n, max;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) 
            for (int j = a[i]; j <= b[i]; j++) 
                blocks[j]++;

        max = 0;
        for (int i = 1; i <= 100; i++) 
            if (max < blocks[i])
                max = blocks[i];
        System.out.print(max);
    }
}