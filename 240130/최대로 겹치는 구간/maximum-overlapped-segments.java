import java.util.Scanner;

public class Main {
    public static final int adjust = 100;
    public static final int MAX_n = 100;
    public static int[] a = new int[MAX_n];
    public static int[] b = new int[MAX_n];
    public static int[] block = new int[201];
    public static int n;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            a[i] = sc.nextInt() + adjust;
            b[i] = sc.nextInt() + adjust - 1;
        }

        for (int i=1;i<=n;i++) {
            for (int j=a[i];j<=b[i];j++) {
                block[j]++;
            }
        }

        int max = 0;
        for(int i=1;i<=200;i++) {
            if(block[i] > max) {
                max = block[i];
            }
        }
        System.out.print(max);
    }
}