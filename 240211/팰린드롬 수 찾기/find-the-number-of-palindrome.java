import java.util.Scanner;

public class Main {
    public static int x, y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt(); y = sc.nextInt();
        int pal_count = 0;
        for (int i = x; i <= y; i++) {
            int tmp = i;
            int count = 0;
            boolean pal = true;
            int[] numbers = new int[7];
            for (int j = 0; j < 7; j++) {
                numbers[j] = tmp % 10;
                tmp /= 10;
                count++;
                if (tmp == 0) break;
            }
            for (int j = 0; j <= count / 2; j++) {
                if (numbers[j] != numbers[count - j - 1]) {
                    pal = false;
                    break;
                }
            }
            if (pal) pal_count++;
        }
        System.out.print(pal_count);
    }
}