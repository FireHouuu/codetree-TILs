import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        LinkedList<Integer> LL = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            if (tmp.equals("push_front"))
                LL.addFirst(sc.nextInt());
            else if (tmp.equals("push_back"))
                LL.addLast(sc.nextInt());
            else if (tmp.equals("pop_front"))
                System.out.println(LL.pollFirst());
            else if (tmp.equals("pop_back"))
                System.out.println(LL.pollLast());
            else if (tmp.equals("size"))
                System.out.println(LL.size());
            else if (tmp.equals("empty")) 
                System.out.println(LL.isEmpty() ? 1 : 0);
            else if (tmp.equals("front"))
                System.out.println(LL.peekFirst());
            else
                System.out.println(LL.peekLast());
        }
    }
}