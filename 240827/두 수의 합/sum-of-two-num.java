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
            if (hash.containsKey(key)) {
                if (m - key == key) count_solo++;
                hash.remove(key);
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
        System.out.println(count / 2 + count_solo);
    }
}