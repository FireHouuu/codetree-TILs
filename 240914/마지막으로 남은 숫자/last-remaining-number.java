import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static int n;
    public static PriorityQueue<Integer> q = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) 
            q.add(-sc.nextInt());

        while (q.size() > 1) {
            int x = -q.poll();
            int y = -q.poll();
            q.add(-Math.abs(x - y));
        }

        System.out.println(-q.poll());
    }
}