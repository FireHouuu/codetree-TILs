import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        int count = 0;
        
        for (int i = 0; i < n - 1; i++) {
            boolean fold = false;
            for (int j = i + 1; j < n; j++) {
                if ((x1[i] < x1[j] && x2[i] > x2[j]) || (x1[i] > x1[j] && x2[i] < x2[j])) {
                    fold = true;
                    //System.out.print(x1[i] + " - " + x2[i]);
                    //System.out.println();
                    break;
                }
            }
            if (!fold) {
                count++;
                //System.out.print(x1[i] + " - " + x2[i]);
                //System.out.println();
            }
        }
        System.out.print(count);
    }
}