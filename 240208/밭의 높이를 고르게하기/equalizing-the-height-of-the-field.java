import java.util.Scanner;

public class Main {
    public static int n, h, t;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); h = sc.nextInt(); t = sc.nextInt(); 
        int[] field = new int[n];
        for(int i = 0; i < n; i++)
            field[i] = sc.nextInt();
        
        int min_cost = Integer.MAX_VALUE;
        for (int i = 0; i <= n - t; i++){
            int tmp_cost = 0;
            for (int j = i; j < i + t; j++) 
                tmp_cost += Math.abs(field[j]-h);
            min_cost = Math.min(tmp_cost, min_cost);
        }
        System.out.print(min_cost);
    }
}