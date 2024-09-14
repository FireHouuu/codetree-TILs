import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {        
    public static int t;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            PriorityQueue<Integer> q1 = new PriorityQueue<>();
            PriorityQueue<Integer> q2 = new PriorityQueue<>();
            for (int j = 1; j <= m; j++) {
                if (j % 2 == 1) {
                    q1.add(-sc.nextInt());
                    if (j > 2 && -q1.peek() > q2.peek()) {
                        int tmp1 = q2.poll();
                        int tmp2 = -q1.poll();
                        q1.add(-tmp1);
                        q2.add(tmp2);
                    }
                    //System.out.println(q1);
                    System.out.print(-q1.peek() + " ");
                }
                else {
                    q2.add(sc.nextInt());
                    if (j >= 2 && -q1.peek() > q2.peek()) {
                        int tmp1 = q2.poll();
                        int tmp2 = -q1.poll();
                        q1.add(-tmp1);
                        q2.add(tmp2);
                    }
                }
            }
            System.out.println();
        }
    }
}