import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        // TreeMap을 사용하여 정렬된 상태 유지
        TreeMap<Long, Integer> changes = new TreeMap<>();

        long currentPosition = 0;
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            long x = Long.parseLong(command[0]);
            String direction = command[1];

            long nextPosition;
            if (direction.equals("R")) {
                nextPosition = currentPosition + x;
            } else { // "L"
                nextPosition = currentPosition - x;
            }

            // 구간의 시작과 끝 표시
            changes.put(Math.min(currentPosition, nextPosition), changes.getOrDefault(Math.min(currentPosition, nextPosition), 0) + 1);
            changes.put(Math.max(currentPosition, nextPosition), changes.getOrDefault(Math.max(currentPosition, nextPosition), 0) - 1);

            currentPosition = nextPosition;
        }

        long result = 0;
        int count = 0;
        long lastPosition = changes.firstKey();

        for (Map.Entry<Long, Integer> entry : changes.entrySet()) {
            if (count >= 2) {
                result += entry.getKey() - lastPosition;
            }
            count += entry.getValue();
            lastPosition = entry.getKey();
        }

        System.out.println(result);
        sc.close();
    }
}