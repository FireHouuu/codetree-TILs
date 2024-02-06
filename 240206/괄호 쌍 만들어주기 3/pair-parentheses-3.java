import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();
        int count = 0;
        for (int i = 0; i < order.length(); i++) {
            char tmp = order.charAt(i);
            if (tmp == '(') {
                for (int j = i + 1; j < order.length(); j++) 
                    if (order.charAt(j) == ')') count++;
            }
        }
        System.out.print(count);
    }
}