import java.util.Scanner;

public class Main {
    public static int n, k, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt(); k = sc.nextInt();
        int[] point = new int[n+1];
        int target = -1;
        int cur = 0;
        while (m-- > 0) {
            cur = sc.nextInt();
            point[cur]++;
            if (point[cur] >= k) {
                target = cur;
                break;
            }
        }
        System.out.print(target);
    }
}