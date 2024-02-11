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
            int check1 = 0;
            int check0 = 0;
            while (tmp > 0) {
                numbers[tmp % 10]++;
                tmp /= 10;
            }
            for (int j = 0; j < 10; j++) {
                if (numbers[j] == 1) check1++;
                else if(numbers[j] == 0) check0++;
            }
            if (check0 == 8 && check1 == 1) count++;
        }
        System.out.print(count);
    }
}