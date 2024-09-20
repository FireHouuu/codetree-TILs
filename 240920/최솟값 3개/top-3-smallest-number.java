import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim()); // n 입력
        String[] nums = br.readLine().trim().split("\\s+"); // n개의 숫자 입력
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 최소 힙 생성
        StringBuilder sb = new StringBuilder(); // 결과 출력을 위한 StringBuilder

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(nums[i]);
            minHeap.add(num); // 우선순위 큐에 숫자 추가

            if (minHeap.size() < 3) {
                sb.append(-1).append("\n"); // 숫자가 3개 미만이면 -1 출력
            } else {
                // 가장 작은 세 개의 숫자를 꺼냅니다
                int a = minHeap.poll();
                int b = minHeap.poll();
                int c = minHeap.poll();

                long product = (long) a * b * c; // 곱셈 결과가 int 범위를 넘을 수 있으므로 long 타입 사용

                sb.append(product).append("\n"); // 결과 저장

                // 꺼낸 숫자들을 다시 우선순위 큐에 넣습니다
                minHeap.add(a);
                minHeap.add(b);
                minHeap.add(c);
            }
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}