import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            list[i] = sc.nextInt();
            sum += list[i];
        }
        
        int min_dif = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (k == i || k == j) continue;
                    for (int f = 0; f < 6; f++) {
                        if (f == i || f == j || f == k) continue;
                        int first = list[i] + list[j];
                        int second = list[k] + list[f];
                        int third = sum - first - second;
                        int dif = Math.max(Math.abs(first-second), Math.abs(second-third));
                        dif = Math.max(dif, Math.abs(first-third));
                        min_dif = Math.min(min_dif, dif);
                    }
                    
                }
            }
        }
        System.out.print(min_dif);
    }
}