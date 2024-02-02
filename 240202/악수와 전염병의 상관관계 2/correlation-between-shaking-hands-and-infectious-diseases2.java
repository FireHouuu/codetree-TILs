import java.util.Scanner;

public class Main {
    public static int n, k, p, t;
    public static int[] timeline1 = new int[251];
    public static int[] timeline2 = new int[251];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt(); p = sc.nextInt(); t = sc.nextInt();
        int[] dev_zombie = new int[n+1];
        int[] dev_point = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
            if (i == p) {
                dev_zombie[i] = 1;
                dev_point[i] = k;
            }
        }
        int time = 0;
        for (int i = 0; i < t; i++) {
            time = sc.nextInt();
            timeline1[time] = sc.nextInt();
            timeline2[time] = sc.nextInt();
        }
        int a, b;
        for (int i = 1; i <= 250; i++) {
            a = timeline1[i]; b = timeline2[i];
            if (a == 0) continue;
            
            if (dev_point[a] != 0) {
                if (dev_zombie[b] == 0) {
                    dev_point[b] = k;
                    dev_zombie[b] = 1;
                    dev_point[a]--;
                }
            }

            if (dev_point[b] != 0) {
                if (dev_zombie[a] == 0) {
                    dev_point[a] = k;
                    dev_zombie[a] = 1;
                    dev_point[b]--;
                }
            }
        }
        for (int i = 1; i <= n; i++)
            System.out.print(dev_zombie[i]);
    }
}