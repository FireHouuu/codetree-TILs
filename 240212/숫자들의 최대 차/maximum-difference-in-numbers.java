import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int n, k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = sc.nextInt();

        Arrays.sort(list);
        int max_num = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list[j] - list[i] > k) continue;
                max_num = Math.max(max_num, j - i + 1);
            }
        }
        System.out.print(max_num);
    }
}