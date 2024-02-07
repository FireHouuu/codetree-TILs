import java.util.Scanner;

public class Main {
    public static int n;
    
    public static boolean isCarry (int a, int b, int c) {
        int[] a_c = new int[5];
        int[] b_c = new int[5];
        int[] c_c = new int[5];
        for (int i = 4; i >= 0; i--) {
            a_c[i] = a % 10;
            a = a / 10;
        }
        for (int i = 4; i >= 0; i--) {
            b_c[i] = b % 10;
            b = b / 10;
        }
        for (int i = 4; i >= 0; i--) {
            c_c[i] = c % 10;
            c = c / 10;
        }
        
        for (int i = 4; i >= 0; i--) 
            if (a_c[i] + b_c[i] + c_c[i] >= 10) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) 
            list[i] = sc.nextInt();
        
        int max_sum = -1;
        int tmp = -1;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(!isCarry(list[i], list[j], list[k])) {
                        tmp = list[i] + list[j] + list[k];
                    }
                    max_sum = Math.max(max_sum, tmp);
                }
            }
        }

        System.out.print(max_sum);
    }
}