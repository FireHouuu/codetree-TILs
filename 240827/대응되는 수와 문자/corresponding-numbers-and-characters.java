import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static int n, m;

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();

        HashMap<String, Integer> s_i = new HashMap<>();
        HashMap<Integer, String> i_s = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String st = sc.next();
            s_i.put(st, i);
            i_s.put(i, st);
        }

        for (int i = 0; i < m; i++) {
            String tmp = sc.next();
            if (isInteger(tmp)) {
                
                System.out.println(i_s.get(Integer.parseInt(tmp)));
            }
            else {
                System.out.println(s_i.get(tmp));
            }
        }

    }
}