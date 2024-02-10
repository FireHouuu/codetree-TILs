import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int n, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); b = sc.nextInt();
        int[][] ps = new int[n][2]; 
        for (int i = 0; i < n; i++) {
            ps[i][0] = sc.nextInt();
            ps[i][1] = sc.nextInt();
        }
        Arrays.sort(ps, (o1, o2) -> Integer.compare(o1[0] + o1[1], o2[0] + o2[1]));

        int max_count = 0;
        for (int i = 0; i < n; i++) {
            int tmp = ps[i][0] / 2;
            int count = 1;
            int budget = b - tmp - ps[i][1];
            for (int j = 0; j < n; j++) {
                if (i == j || budget <= 0) continue;
                budget -= (ps[j][0] + ps[j][1]);
                if (budget >= 0) 
                    count++;
                else break;
            }
            max_count = Math.max(max_count, count);
        }
        System.out.print(max_count);
    }
}