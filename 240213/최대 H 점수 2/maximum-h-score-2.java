import java.util.Scanner;

public class Main {
    public static int n, l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); l = sc.nextInt();
        int[] list = new int[n];
        int max = 0;
        int min = 100;
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
            max = Math.max(max, list[i]);
            min = Math.min(min, list[i]);
        }
        int h_point = 0;
        for (int i = max; i >= min; i--) {
            if (i > n) {
                continue;
            }
            int tmp_L = l;
            boolean flag = true;
            int tmp_point = 0;
            for (int j = 0; j < n; j++) {
                if (list[j] >= i - 1) {
                    if (list[j] < i){
                        if (tmp_L > 0) {
                            tmp_L--;
                            tmp_point++;
                        }
                    }
                    else {
                        tmp_point++;
                    }
                }
            }
            if (tmp_point >= i) {
                h_point = i;
                break;
            }
        }
        System.out.print(h_point);
    }
}