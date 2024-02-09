import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static int n, m, d, s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt(); d = sc.nextInt(); s = sc.nextInt(); 
        int[][] list = new int[d][3];
        for (int i = 0; i < d; i++)
            for (int j = 0; j < 3; j++)
                list[i][j] = sc.nextInt();
        
        Arrays.sort(list, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                // 내림차순 정렬을 위해 o2와 o1의 순서를 바꿔 비교
                return Integer.compare(o1[2], o2[2]);
            }
        });

        int[][] sick = new int[s][2];
        for (int i = 0; i < s; i++)
            for (int j = 0; j < 2; j++)
                sick[i][j] = sc.nextInt();
        
        Arrays.sort(sick, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                // 내림차순 정렬을 위해 o2와 o1의 순서를 바꿔 비교
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int max_count = 0;
        for (int i = 0; i < s; i++) {
            int time = sick[i][1];
            for (int j = 0; j < d; j++) {
                if (list[j][2] >= time) break;
                if (list[j][0] != sick[i][0]) continue;
                int count = 1;
                for (int k = 0; k < d; k++) {
                    if (j == k) continue;
                    if (list[k][1] == list[j][1]) count++;
                }
                max_count = Math.max(max_count, count);
            }
        }
        System.out.print(max_count);
    }
}