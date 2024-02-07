import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int len = line.length();
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            if (line.charAt(i) == '1') num[i] = 1;
            else num[i] = 0;
        }
        int max = 0;

        for(int i = 0; i < len; i++) {
            int tmp = 0;
            num[i] = (num[i] + 1) % 2;
            for (int j = 0; j < len; j++) 
                tmp = tmp + num[j] * (int)Math.pow(2, len-j-1);
            max = Math.max(max, tmp);
            num[i] = (num[i] + 1) % 2;
        }
        System.out.print(max);
    }
}