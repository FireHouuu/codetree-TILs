import java.util.Scanner;

public class Main {
    public static int t, a, b;
    public static int[] line = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt();
        for (int i = 0; i < t; i++) {
            if(sc.next().charAt(0) == 'S') line[sc.nextInt()] = 1;
            else line[sc.nextInt()] = 2;
        }
        int count = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 0; j <= 1000; j++) {
                if((i - j >= 1 && line[i - j] == 1) || (i + j <= 1000 && line[i + j] == 1)) {
                    count++;
                    break;
                }
                else if((i - j >= 1 && line[i - j] == 2) || (i + j <= 1000 && line[i + j] == 2)) {
                    break;
                }
            }
        }
        System.out.print(count);
    }
}