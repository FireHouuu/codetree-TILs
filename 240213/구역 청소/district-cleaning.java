import java.util.Scanner;

public class Main {
    public static int a, b, c, d;
    public static int overlap(int i, int j, int k) {
        if (i >= j && i <= k)
            return i - j;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt(); d = sc.nextInt(); 
        int over = 0;
        if (overlap(b, c, d) != 0) over = overlap(b, c, d);
        else if (overlap(d, a, b) != 0) over = overlap(d, a, b);
        else if (overlap(d, a, b) != 0) over = overlap(c, a, b);
        else if (overlap(d, a, b) != 0) over = overlap(a, c, d);
        int range = (b - a) + (d - c) - over;
        System.out.print(range);
    }
}