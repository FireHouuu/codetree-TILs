import java.util.Scanner;

public class Main {
    public static final int MAX_n = 1000;
    public static int[] list = new int[MAX_n];
    public static int n, length;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        
        length = 0;
        int max_len = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || list[i-1] < list[i]) {
                length++;
                if (length > max_len) max_len = length;
            }
            else length = 1;
        }

        System.out.print(max_len);
    }
}