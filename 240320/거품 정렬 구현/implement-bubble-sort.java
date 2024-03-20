import java.util.Scanner;

public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        
        boolean sorted = true;

        do {
            sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (list[i] > list[i+1]) {
                    sorted = false;
                    int tmp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = tmp;
                }
            }
        } while (sorted == false);

        for (int i = 0; i < n; i ++) 
            System.out.print(list[i] + " ");
        
    }
}