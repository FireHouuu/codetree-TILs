import java.util.Scanner;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {
        int thisDistance = Math.abs(this.x) + Math.abs(this.y);
        int pDistance = Math.abs(p.x) + Math.abs(p.y);

        if (thisDistance != pDistance) {
            return Integer.compare(thisDistance, pDistance);
        } else if (this.x != p.x) {
            return Integer.compare(this.x, p.x);
        } else {
            return Integer.compare(this.y, p.y);
        }
    }
}
public class Main {
    public static int n, m;
    public static PriorityQueue<Pair> q = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Pair tmp = new Pair(x, y);
            q.add(tmp);
        }

        for (int i = 0; i < m; i++) {
            Pair tmp2 = q.poll();
            tmp2.x += 2;
            tmp2.y += 2;
            q.add(tmp2);
        }

        System.out.println(q.peek().x + " " + q.peek().y);
    }
}