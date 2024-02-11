import java.util.Scanner;

public class Main {
    public static int x, y;
    public static int[] numbers = new int[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt(); y = sc.nextInt();
        int count = 0;
        for (int i = x; i <= y; i++) {
            for (int j = 0; j < 10; j++) numbers[j] = 0;
            int tmp = i;
            boolean check = false;
            while (tmp > 0) {
                numbers[tmp % 10]++;
                tmp /= 10;
            }
            for (int j = 0; j < 10; j++) {
                if (numbers[j] == 1) {
                    if (check) {
                        check = false;
                        break;
                    }
                    check = true;
                }
            }
            if (check) count++;
        }
        System.out.print(count);
    }
}