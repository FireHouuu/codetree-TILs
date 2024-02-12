import java.util.Scanner;

public class Main {
    public static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int[] list = new int[n+1];
        for (int i = 1; i <= n; i++) list[i] = sc.nextInt();
        int max_sum = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int current = i;
            int bouns = m;
            while (bouns-- > 0) {
                current = list[current];
                sum += current;
            }
            max_sum = Math.max(max_sum, sum);
        }
        System.out.print(max_sum);
    }
}