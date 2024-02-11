import java.util.Scanner;

public class Main {
    public static int a, b, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        int mx = 0;
        for (int i = 0; i <= c / a + 1; i++) {
            for (int j = 0; j <= c / b + 1; j++) {
                int tmp = a * i + b * j;
                if (tmp <= c) mx = Math.max(mx, tmp);
            }
        }
        System.out.print(mx);
    }
}