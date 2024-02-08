import java.util.Scanner;

public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                float aver = 0;
                for (int k = i; k <= j; k++) 
                    aver += (float)list[k];
                aver = aver / (j - i + 1);
                for (int k = i; k <= j; k++) {
                    if (aver == list[k]) {
                        count++;
                        break;
                    }
                }
                
            }
        }
        System.out.print(count);
    }
}