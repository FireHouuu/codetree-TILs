import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        System.out.println(s.size());
    }
}