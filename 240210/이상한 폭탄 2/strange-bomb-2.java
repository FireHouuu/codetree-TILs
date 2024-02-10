import java.util.Scanner;

public class Main {
    public static int n, k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++)
            bombs[i] = sc.nextInt();

        int max_num = -1;
        for (int i = 0; i < n; i++) {
            boolean explosion = false;
            for (int j = 1; j <= k; j++) {
                if (i + j < n) {
                     if (bombs[i] == bombs[i + j]) {
                        explosion = true;
                        //System.out.print("check2");
                        break;
                    }
                }
                if (i - j >= 0) {
                    if (bombs[i] == bombs[i - j]) {
                        explosion = true;
                       // System.out.print("check2");
                        break;
                    }
                }
            }
            if (explosion) max_num = Math.max(bombs[i], max_num);
        }
        System.out.print(max_num);
    }   
}