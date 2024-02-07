import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int len = line.length();
        char[] order = new char[len];
        for (int i = 0; i < len; i++) 
            order[i] = line.charAt(i);
        
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (order[i] == '(' && order[i+1] == '(') {
                for (int j = i; j < len - 1; j++) {
                    if (order[j] == ')' && order[j+1] == ')') count++;
                }
            }
        }
        System.out.print(count);
    }
}