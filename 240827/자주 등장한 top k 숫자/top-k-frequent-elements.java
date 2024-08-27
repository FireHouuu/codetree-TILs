import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    static class Pair {
        public Integer first;
        public Integer second;

        public Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }
    }
    public static int n, k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Pair> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            hash.put(tmp, hash.getOrDefault(tmp, 0) + 1);
        }

        for (int key : hash.keySet()) {
            nums.add(new Pair(key, hash.get(key)));
        }
        Collections.sort(nums, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                // 두 번째 원소 기준 내림차순
                if (!p1.second.equals(p2.second)) {
                    return p2.second.compareTo(p1.second);
                }
                // 첫 번째 원소 기준 내림차순 (두 번째 원소가 동일할 때)
                return p2.first.compareTo(p1.first);
            }
        });

        for (int i = 0; i < k; i++) {
            System.out.print(nums.get(i).first + " ");
        }

    }
}