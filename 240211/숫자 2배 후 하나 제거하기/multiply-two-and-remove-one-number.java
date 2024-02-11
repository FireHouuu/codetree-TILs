import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = sc.nextInt();

        int min_result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int og = list[i];
            list[i] *= 2;
            for (int j = 0; j < n; j++) {
                int subsum = 0;
                for (int k = 0; k < n - 1; k++) {
                    if(j == k) continue;
                    else if (j == k + 1 && k + 2 < n) subsum += Math.abs(list[k+2] - list[k]);
                    else subsum += Math.abs(list[k+1] - list[k]);
                    //System.out.print(list[k+1] + " - " + list[k]);
                    //System.out.println();
                }
                min_result = Math.min(min_result, subsum);
            }
            list[i] = og;
        }
        System.out.print(min_result);
    }
}