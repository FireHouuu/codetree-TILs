import java.util.Scanner;

public class Main {
    public static int a, b, c, d;
    public static boolean is_intersect(int i, int j, int k) {
        return (i >= j && i =< k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt(); d = sc.nextInt();
        boolean flag = true;
        if (is_intersect(a, c, d)) flag = false;
        else if (is_intersect(b, c, d)) flag = false;
        else if (is_intersect(c, a, b)) flag = false;
        else if (is_intersect(d, a, b)) flag = false;

        if (flag) System.out.print("nonintersecting");
        else System.out.print("intersecting");
    }
}