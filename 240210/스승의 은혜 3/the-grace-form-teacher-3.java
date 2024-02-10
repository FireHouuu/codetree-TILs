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
        int[][] ps_copy = new int[n][2];
        ps_copy = ps;
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            ps_copy[i][0] /= 2;
            Arrays.sort(ps_copy, (o1, o2) -> Integer.compare(o1[0] + o1[1], o2[0] + o2[1]));
            int count = 0;
            int budget = b;
            for (int j = 0; j < n; j++) {
                budget -= (ps_copy[j][0] + ps_copy[j][1]);
                if (budget >= 0) count++;
                else break;
            }
            max_count = Math.max(max_count, count);
            ps_copy = ps;
        }
        System.out.print(max_count);
    }
}