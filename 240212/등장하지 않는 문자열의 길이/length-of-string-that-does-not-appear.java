import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int length = 0;
        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int j = 0; j <= n - i; j++) {
                String tmp = str.substring(j, j + i);
                for (int k = j + 1; k <= n - i; k++) {
                    if (tmp.equals(str.substring(k, k + i))) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }
            if (flag) {
                length = i;
                break;
            }
        }
        System.out.print(length);
    }
}