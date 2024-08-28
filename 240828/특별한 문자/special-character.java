import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        char[] arr = ch.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();
        HashMap<Character, Integer> order = new HashMap<>();
        int orderNum = 1;
        int cal = 100000;
        char ans = 'a';

        for (char c : arr) {
            if (!count.containsKey(c)) {
                count.put(c, 1);
                order.put(c, orderNum);
                orderNum++;
            }
            else {
                order.remove(c);
            }
        }
        
        if (order.isEmpty()) {
            System.out.println("None");
        }
        else {
            for (char c : order.keySet()) {
                if (cal > order.get(c)) {
                    ans = c;
                    cal = order.get(c);
                }
            }
            System.out.println(ans);
        }
        
    }
}