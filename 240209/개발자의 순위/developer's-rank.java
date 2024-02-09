import java.util.Scanner;

public class Main {
    public static int k, n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt(); n = sc.nextInt();
        int[][] list = new int[n+1][n+1];
        
        for (int i = 0; i < k; i++) {
            int[] output = new int[n];
            for (int j = 0; j < n; j++)
                output[j] = sc.nextInt();
            
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++){ 
                    int first = output[j];
                    int second = output[k];
                    list[first][second] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++) 
            for (int j = 1; j < i; j++) 
                if ((list[i][j] == 1 && list[j][i] == 0) || (list[i][j] == 0 && list[j][i] == 1)) count++;
        System.out.print(count);
    }
}