import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        
        int min_len = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) 
                tmp = tmp + (j-i+n) % n * list[j];
            min_len = Math.min(min_len, tmp);
        }
        System.out.print(min_len);
    }
}