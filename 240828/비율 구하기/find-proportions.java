import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        TreeMap<String, Integer> m = new TreeMap<>();
        float all = 0;

        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            m.put(tmp, m.getOrDefault(tmp, 0) + 1);
            all++;
        }

        Iterator<Entry<String, Integer>> it = m.entrySet().iterator();
        while(it.hasNext()) {
            Entry<String, Integer> entry = it.next();
            System.out.printf("%s %.4f%n", entry.getKey(), entry.getValue() / all * 100);
        }
    }
}