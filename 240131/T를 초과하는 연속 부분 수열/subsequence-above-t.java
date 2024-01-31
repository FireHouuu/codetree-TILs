import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        int[] list = new int[n];
        
        for (int i = 0; i < n; i++) 
            list[i] = sc.nextInt();
        
        int length = 0, max_len = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || list[i-1] > t)
                if (list[i] > t) length++;
            if (length > max_len) max_len = length;
        }

        System.out.print(max_len);
    }
}