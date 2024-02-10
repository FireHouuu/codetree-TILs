import java.util.Scanner;

public class Main {
    public static int n, c, g, h;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); c = sc.nextInt(); g = sc.nextInt(); h = sc.nextInt();
        int[][] list = new int[n][2];
        int min_tmp = Integer.MAX_VALUE;
        int max_tmp = Integer.MIN_VALUE;
        int Ta, Tb;
        for (int i = 0; i < n; i++) {
            Ta = sc.nextInt(); Tb = sc.nextInt();
            list[i][0] = Ta; list[i][1] = Tb;
            min_tmp = Math.min(min_tmp, Ta);
            max_tmp = Math.max(max_tmp, Tb);
        }
        int max_work = 0;
        for (int i = min_tmp - 1; i < max_tmp + 1; i++) {
            int work = 0;
            for (int j = 0; j < n; j++) {
                if (i < list[j][0]) work += c;
                else if (list[j][0] <= i && i <= list[j][1]) work += g;
                else work += h;
            }
            max_work = Math.max(max_work, work);
        }
        System.out.print(max_work);
    }
}