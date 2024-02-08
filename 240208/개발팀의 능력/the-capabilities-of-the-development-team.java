import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextInt();
            sum += list[i];
        }
        
        int min_dif = Integer.MAX_VALUE;
        boolean flag = false;

        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int f = k+1; f < 5; f++) {
                        if (k == i || f == j || k == j || f == i) continue;
                        int first = list[i] + list[j];
                        int second = list[k] + list[f];
                        int third = sum - first - second;
                        
                        if (first != second && second != third && first != third) {
                            flag = true;
                            int dif = Math.max(Math.abs(first-second), Math.abs(second-third));
                            dif = Math.max(dif, Math.abs(first-third));
                            min_dif = Math.min(min_dif, dif);
                        }
                    }
                }
            }
        }
        if (flag)System.out.print(min_dif);
        else System.out.print(-1);

    }
}