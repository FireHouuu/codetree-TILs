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
        
        Arrays.sort(list, new Comparator<int[]>() { //치즈를 먹은 기록을 시간순으로 정렬
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[2], o2[2]);
            }
        });

        int[][] sick = new int[s][2];
        for (int i = 0; i < s; i++)
            for (int j = 0; j < 2; j++)
                sick[i][j] = sc.nextInt();
        
        Arrays.sort(sick, new Comparator<int[]>() { //아픈 기록을 시간순으로 정렬
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int max_count = 0;
        for (int i = 0; i < s; i++) {
            int time = sick[i][1];
            for (int j = 0; j < d; j++) { 
                if (list[j][2] < time && list[j][0] == sick[i][0]) { //그 시간 이전에 동일한 사람이 먹은 치즈를 확인하기 위함
                    int[] sick_person = new int[n+1];
                    int count = 1;
                    int tmp = list[j][0];
                    sick_person[tmp] = 1;
                    for (int k = 0; k < d; k++) {
                        int tmp2 = list[k][0];
                        if (list[k][1] == list[j][1] && sick_person[tmp2] == 0){ //같은 치즈를 먹은 사람 & 이미 아픈 사람 list에 포함되어있는지 확인
                            count++;
                            sick_person[tmp2] = 1;
                        }
                    }
                    max_count = Math.max(max_count, count);
                }
            }
        }
        System.out.print(max_count);
    }
}