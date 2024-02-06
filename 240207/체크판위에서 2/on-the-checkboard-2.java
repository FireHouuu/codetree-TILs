import java.util.Scanner;

public class Main {
    public static int r, c;
    public static int count = 0;
    public static void find(int x, int y, int[][] plane, int jumps) {
        if (x == r - 1 && y == c - 1 && jumps == 3) {
            //System.out.print("OOOO");
            count++;
            return;
        }
        if (jumps > 3) return;
        for (int i = x + 1; i < r; i++) {
            for (int j = y + 1; j < c; j++) {
                if (plane[x][y] != plane[i][j]) {
                    //System.out.print("[" + x + ", " + y + "] -> " + "[" + i + ", " + j + "]");
                    //System.out.println();
                    find(i, j, plane, jumps + 1);
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt(); c = sc.nextInt();
        sc.nextLine();
        int[][] plane = new int[r][c];
        String og_line, line;
        for (int i = 0; i < r; i++) {
            og_line = sc.nextLine();
            line = og_line.replaceAll("\\s+", "");
            for (int j = 0; j < c; j++) {
                if(line.charAt(j) == 'W') plane[i][j] = 0;
                else plane[i][j] = 1;
            }
        }

        int x = 0; int y = 0;
        find(x, y, plane, 0);
        System.out.print(count);
    }
}