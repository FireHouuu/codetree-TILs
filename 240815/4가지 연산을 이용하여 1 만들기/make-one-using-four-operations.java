import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static int n;
    public static final int MAX_NUM = 1000001;
    public static Queue<Integer> q = new LinkedList<>();
    public static int[] count = new int[MAX_NUM];
    
    public static void BFS() {
        while(!q.isEmpty()) {
            int curr = q.poll();
            if (curr == 1) {
                break;
            }

            if (curr < MAX_NUM && count[curr-1] == 0 && curr-1 != n) {
                q.add(curr-1);
                count[curr-1] = count[curr] + 1;
            }

            if (curr + 1 < MAX_NUM && count[curr+1] == 0 && curr+1 != n) {
                q.add(curr+1);
                count[curr+1] = count[curr] + 1;
            }

            if (curr < MAX_NUM && curr % 2 == 0 && count[curr / 2] == 0 && curr / 2 != n) {
                q.add(curr / 2);
                count[curr / 2] = count[curr] + 1;
            }

            if (curr < MAX_NUM && curr % 3 == 0 && count[curr / 3] == 0 && curr / 3 != n) {
                q.add(curr / 3);
                count[curr / 3] = count[curr] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count[n] = 0;
        q.add(n);
        BFS();

        System.out.println(count[1]);
    }
}