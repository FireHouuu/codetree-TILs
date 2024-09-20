import java.util.Scanner;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int normal, abs;

    public Pair(int normal) {
        this.normal = normal;
        this.abs = Math.abs(normal);
    }

    @Override
    public int compareTo(Pair p) {
        if (this.abs == p.abs) {
            return Integer.compare(this.normal, p.normal);
        } else {
            return Integer.compare(this.abs, p.abs);
        }
    }
}
public class Main {
    public static int n;
    public static PriorityQueue<Pair> q = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 0) {
                if (q.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(q.poll().normal);
                }
            } else {
                Pair tmp_p = new Pair(tmp);
                q.add(tmp_p);
            }
        }
    }
}