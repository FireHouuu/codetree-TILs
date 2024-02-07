import java.util.Scanner;

public class Main {
    public static int n, s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); s = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        
        int min_dis = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = 0;
                for(int k = 0; k < n; k++) 
                    if (k != i && k != j) sum = sum + list[k];
                int dif = Math.abs(sum - s);
                min_dis = Math.min(min_dis, dif);
            }
        }
        System.out.print(min_dis);
    }
}