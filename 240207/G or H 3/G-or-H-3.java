import java.util.Scanner;

public class Main {
    public static int n, k;
    public static int[] line = new int[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int location = sc.nextInt();
            char alpha = sc.next().charAt(0);
            if (alpha == 'G') line[location] = 1;
            else line[location] = 2;
        }
        int max = 0;
        for (int i = 0; i <= 10000; i++) {
            int sum = 0;
            for (int j = 0; j <= k; j++) 
                sum = sum + line[i + j];
            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}