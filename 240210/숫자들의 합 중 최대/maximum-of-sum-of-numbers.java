import java.util.Scanner;

public class Main {
    public static int x, y;

    public static int cal(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt(); y = sc.nextInt();
        int max_sum = 0;
        for (int i = x; i <= y; i++) 
            max_sum = Math.max(max_sum, cal(i));
        System.out.print(max_sum);
    }
}