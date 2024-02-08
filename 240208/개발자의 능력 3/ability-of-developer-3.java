import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[6];
        int sum_val = 0;
        for (int i = 0; i < 6; i++) {
            list[i] = sc.nextInt();
            sum_val += list[i];
        }
        
        int min_dif = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 6; k++) {
                    int tmp1 = list[i] + list[j] + list[k];
                    int tmp2 = sum_val - tmp1;
                    int dif = Math.abs(tmp1 - tmp2);
                    min_dif = Math.min(min_dif, dif);
                }
            }
        }
        System.out.print(min_dif);
    }
}