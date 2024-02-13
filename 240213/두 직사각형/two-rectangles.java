import java.util.Scanner;

public class Main {
    public static int[] squre1 = new int[4];
    public static int[] squre2 = new int[4];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) squre1[i] = sc.nextInt();
        for (int i = 0; i < 4; i++) squre2[i] = sc.nextInt();
        boolean overlapping = true;
        if ((squre1[2] < squre2[0]) || (squre2[2] < squre1[0]) || (squre1[3] < squre2[1]) || (squre2[3] < squre1[1]))
            overlapping = false;
        if (overlapping) System.out.print("overlapping");
        else System.out.print("nonoverlapping");
    }
}