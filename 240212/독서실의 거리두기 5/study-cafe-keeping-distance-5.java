import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        sc.nextLine();
        String str = sc.nextLine();
        for(int i = 0; i < n; i++) list[i] = str.charAt(i) - '0';
        int max_dis = 0;
        for (int i = 0; i < n; i++) {
            if (list[i] == 1) continue;
            list[i] = 1;
            int min_dis = 20;
            for (int j = 0; j < n - 1; j++) {
                if (list[j] == 0) {
                    continue;
                }
                int dis = 0;
                for (int k = j + 1; k < n; k++) {
                    if (list[k] == 0) {
                        dis = min_dis;
                        continue;
                    }
                    else {
                        dis = k - j;
                        //System.out.print(i + " / " + j + " - " + k);
                        //System.out.println();
                        break;
                    }
                }
                min_dis = Math.min(min_dis, dis);
            }
            max_dis = Math.max(min_dis, max_dis);
            list[i] = 0;
        }
        System.out.print(max_dis);
    }
}