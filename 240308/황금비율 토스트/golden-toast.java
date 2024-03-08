import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        String tmp = sc.next();
        LinkedList<Character> bread = new LinkedList<>();
        ListIterator<Character> it;
        for (int i = 0; i < n; i++)
            bread.add(tmp.charAt(i));

        it = bread.listIterator(bread.size());
        for (int i = 0; i < m; i++) {
            String command = sc.next();
            if (command.equals("L") && it.hasPrevious()) 
                it.previous();
            else if (command.equals("R") && it.hasNext()) 
                it.next();
            else if (command.equals("D") && it.hasNext()) {
                it.next();
                it.remove();
            }
            else {
                String input = sc.next();
                it.add(input.charAt(0));
            }
        }
        for (int i = 0; i < bread.size(); i++)
            System.out.print(bread.get(i));
    }
}