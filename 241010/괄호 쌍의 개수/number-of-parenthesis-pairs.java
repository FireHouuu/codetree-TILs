import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        scanner.close();

        System.out.println(countValidChanges(A));
    }

    public static int countValidChanges(String A) {
        if (isValid(A)) {
            return 0;  // 이미 올바른 괄호 문자열이면 0 반환
        }

        int count = 0;
        char[] chars = A.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (chars[i] == '(') ? ')' : '(';  // 괄호 방향 변경
            if (isValid(new String(chars))) {
                count++;
            }
            chars[i] = (chars[i] == '(') ? ')' : '(';  // 원래대로 복구
        }

        return count;
    }

    public static boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
}