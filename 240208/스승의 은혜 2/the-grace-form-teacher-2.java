import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static int n, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); b = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        list.sort(null); // 리스트 정렬
        int max_num = 0;
        for (int i = 0; i < n; i++) {
            int num = 0;
            int budget = b - list.get(i) / 2; // 선택한 아이템을 반값으로 구매
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // 선택한 아이템은 이미 반값으로 계산됨
                if (budget - list.get(j) >= 0) {
                    budget -= list.get(j);
                    num++;
                } else {
                    break; // 예산 초과 시 반복 중단
                }
            }
            // 선택한 아이템을 포함하여 계산
            num += 1; // 반값으로 구매한 아이템도 카운트에 포함
            max_num = Math.max(max_num, num); // 최대 구매 가능한 아이템 수 갱신
        }
        System.out.print(max_num);
    }
}