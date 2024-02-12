import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }
        int min = list[0][1] / 2;
        for (int i = 1; i <= list[0][1] / 2; i++) {
            int tmp = i;
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (tmp * Math.pow(2, j + 1) >= list[j][0] && tmp * Math.pow(2, j) <= list[j][1]) flag = true;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag) min = Math.min(min, i);
        }
        System.out.print(min);
    }
}