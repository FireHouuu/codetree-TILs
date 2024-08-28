import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Main {
    public static int n, g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); g = sc.nextInt();
        HashSet<Integer>[] set = new HashSet[g];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < g; i++) {
            int num = sc.nextInt();
            set[i] = new HashSet<Integer>();
            for (int j = 0; j < num; j++) 
                set[i].add(sc.nextInt());
        }
        queue.add(1);
        int ans = 1;
        while(!queue.isEmpty()) {
            int check = queue.poll();
            for (int i = 0; i < g; i++) {
                if (set[i].contains(check)) {
                    set[i].remove(check);
                    if (set[i].size() == 1) {
                        Iterator<Integer> iterator = set[i].iterator();
                        int element = iterator.next();
                        queue.add(element);
                        set[i].remove(element);
                        ans++;
                    }
                } 
            }
        }
        
        System.out.println(ans);
    }
}