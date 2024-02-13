import java.util.Scanner;

public class Main {
    public static int[] list = new int[11];
    public static int[] change = new int[11];
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) list[i] = -1;
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            int LR = sc.nextInt();
            if (list[number] != LR) {
                if (list[number] != -1) {
                    //System.out.print(number + " / " + list[number] + " / " + LR);
                    //System.out.println();
                    change[number]++;
                }
                list[number] = LR;
            } 
        }
        int cross = 0;
        for (int i = 1; i <= 10; i++) 
            cross += change[i];
        System.out.print(cross);
    }
}