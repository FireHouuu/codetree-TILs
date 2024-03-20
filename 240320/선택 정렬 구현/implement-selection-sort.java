import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int start = 0;
        while (start < n - 1) {
            int min = start;
            for (int i = start + 1; i < n; i++) {
                if (list[i] < list[min]) {
                    min = i;
                }
            }
            // 스왑 작업
            int temp = list[start];
            list[start] = list[min];
            list[min] = temp;
            
            start++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}