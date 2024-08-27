import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int count_solo = 0;
        int count = 0;
        int nums = n;
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if (m % 2 == 0 && key == m / 2) {
                count_solo++;
            }
            else {
                hash.put(key, m - key);
            }
            list.add(key);
        }
        for (int i = 0; i < n; i++) {
            if (hash.containsKey(list.get(i))) {
                int tmp = hash.get(list.get(i));
                if (hash.containsKey(tmp)) {
                    count++;
                }
            }
        }
        count_solo = (count_solo * (count_solo - 1)) / 2;
        System.out.println(count / 2 + count_solo);
    }
}