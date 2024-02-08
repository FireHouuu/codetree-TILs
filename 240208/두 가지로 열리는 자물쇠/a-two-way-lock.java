import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] first = new int[3];
    public static int[] second = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < 3; i++)
            first[i] = sc.nextInt();
        for (int i = 0; i < 3; i++)
            second[i] = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if ((checkCyclicDiff(i, first[0], n) && checkCyclicDiff(j, first[1], n) && checkCyclicDiff(k, first[2], n)) ||
                        (checkCyclicDiff(i, second[0], n) && checkCyclicDiff(j, second[1], n) && checkCyclicDiff(k, second[2], n))) {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
    
    private static boolean checkCyclicDiff(int x, int y, int n) {
        int directDiff = Math.abs(x - y);
        int cyclicDiff = Math.min(directDiff, n - directDiff);
        return cyclicDiff <= 2;
    }
}