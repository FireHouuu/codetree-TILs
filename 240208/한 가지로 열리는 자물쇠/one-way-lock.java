import java.util.Scanner;

public class Main {
    public static int n, a, b, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.abs(a-i) <= 2 || Math.abs(b-j) <= 2 || Math.abs(c-k) <= 2) count++;
                }
            }
        }
        System.out.print(count);
    }
}