import java.util.Scanner;

public class Main {
    public static int n, m, count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int[] A = new int[n]; int[] B = new int[m];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            B[i] = sc.nextInt();

        count = 0;
        for(int i = 0; i <= n - m; i++) {
            int[] tmp = new int[m];
            int tmp_count = 0;
            for (int j = i; j < i + m; j++) 
                tmp[j-i] = A[j];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    if (tmp[k] != 0 && tmp[k] == B[j]) {
                        tmp[k] = 0;
                        tmp_count++;
                    }
                }
            }
            if (tmp_count == m) {
                count++;
            }
        }
        System.out.print(count);
    }
}