import java.util.Scanner;

public class Main {
    public static int n, k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        int max = 0;
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) 
                sum = sum + list[i + j];
            max = Math.max(sum, max);
        }

        System.out.print(max);
    }
}