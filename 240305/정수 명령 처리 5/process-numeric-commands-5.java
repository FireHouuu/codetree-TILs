import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        String[] command = new String[n];
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            String[] tm = tmp.split(" ");
            command[i] = tm[0];
            if (tm.length > 1) {
                numbers[i] = Integer.parseInt(tm[1]);
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (command[i].equals("push_back")) {
                al.add(numbers[i]);
            } else if (command[i].equals("pop_back")) {
                if (!al.isEmpty()) al.remove(al.size() - 1);
            } else if (command[i].equals("get")) {
                System.out.println(al.get(numbers[i] - 1));
            } else {
                System.out.println(al.size());
            }
        }
        sc.close();
    }
}