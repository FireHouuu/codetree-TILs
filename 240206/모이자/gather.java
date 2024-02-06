import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();

        int min_val = Integer.MAX_VALUE;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                tmp = tmp + Math.abs(i-j) * list[j];
            min_val = Math.min(tmp, min_val);
            tmp = 0;
        }
        System.out.print(min_val);
    }
}