import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.equals("add")) {
                int key = sc.nextInt();
                int val = sc.nextInt();

                m.put(key, val);
            }
            else if (command.equals("find")) {
                int key = sc.nextInt();
                if (m.containsKey(key)) {
                    System.out.println(m.get(key));
                }
                else {
                    System.out.println("None");
                }
            }
            else {
                int key = sc.nextInt();
                if (m.containsKey(key)) {
                    m.remove(key);
                }
            }
        }
    }
}