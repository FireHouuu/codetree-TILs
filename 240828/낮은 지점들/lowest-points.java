import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        HashMap<Long, Long> map = new HashMap<>();
        long ans = 0;
        
        for (int i = 0; i < n; i++) {
            long x = sc.nextInt(); long y = sc.nextInt();
            if (!map.containsKey(x)) {
                map.put(x, y);
            }
            else if (map.get(x) > y) {
                map.put(x, y);
            }
        }

        for (long i : map.keySet()) {
            ans += map.get(i);
        }

        System.out.println(ans);
    }
}