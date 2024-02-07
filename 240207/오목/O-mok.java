import java.util.Scanner;

public class Main {
    public static int x, y, result;
    public static int[][] plane = new int[19][19];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 19; i++) 
            for (int j = 0; j < 19; j++) 
                plane[i][j] = sc.nextInt();

        for (int i = 0; i < 19; i++) {
            boolean flag = false;
            for (int j = 0; j < 15; j++) {
                int five = 0; 
                int color = plane[i][j];
                for (int k = 0; k < 5; k++) {
                    if (plane[i][j+k] != 0) {
                        five++;
                        if (color != plane[i][j+k]) break;
                    }
                }
                if (five == 5) {
                    flag = true;
                    result = color;
                    //System.out.print(i + " " + j + " / ");
                    x = i + 1; y = j + 3;
                    break;
                }
            }
            if (flag) break;
        }
        if (result != 0) {
            for (int i = 0; i < 15; i++) {
                boolean flag = false;
                for (int j = 0; j < 19; j++) {
                    int five = 0; 
                    int color = plane[i][j];
                    for (int k = 0; k < 5; k++) {
                        if (plane[i+k][j] != 0) {
                            five++;
                            if (color != plane[i+k][j]) break;
                        }
                        else break;
                    }
                    if (five == 5) {
                        flag = true;
                        result = color;
                        x = i + 3; y = j + 1;
                        //System.out.print("2");
                        break;
                    }
                }
                if (flag) break;
            }
        }
        if (result != 0) {
            for (int i = 0; i < 15; i++) {
                boolean flag = false;
                for (int j = 0; j < 15; j++) {
                    int five = 0; 
                    int color = plane[i][j];
                    for (int k = 0; k < 5; k++) {
                        if (plane[i+k][j+k] != 0) {
                            five++;
                            if (color != plane[i+k][j+k]) break;
                        }
                        else break;
                    }
                    if (five == 5) {
                        result = color;
                        flag = true;
                        //System.out.print("3");
                        x = i + 3; y = j + 3;
                        break;
                    }
                }
                if (flag) break;
            }
        }
        if (result != 0) {
            for (int i = 4; i < 19; i++) {
                boolean flag = false;
                for (int j = 0; j < 15; j++) {
                    int five = 0; 
                    int color = plane[i][j];
                    for (int k = 0; k < 5; k++) {
                        if (plane[i-k][j+k] != 0) {
                            five++;
                            if (color != plane[i-k][j+k]) break;
                        }
                        else break;
                    }
                    if (five == 5) {
                        flag = true;
                        result = color;
                        //System.out.print("4");
                        x = i - 1; y = j + 3;
                        break;
                    }
                }
                if (flag) break;
            }
        }
        System.out.print(result);
        if (result != 0) {
            System.out.println();
            System.out.print(x + " " + y);
        }

    }
}