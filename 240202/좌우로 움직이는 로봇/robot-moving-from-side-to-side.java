import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] afield = new int[2*1000000+1];
    public static int[] bfield = new int[2*1000000+1];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        
        int arange = 0, brange = 0;
        char adir, bdir;
        int atime = 1, btime = 1;
        for (int i = 0; i < n; i++) {
            arange = sc.nextInt();
            adir = sc.next().charAt(0);
            
            while (arange-- > 0) {
                if (adir == 'R') afield[atime] = afield[atime-1] + 1;
                else afield[atime] = afield[atime-1] - 1;
                atime++;
            }
        }

        for (int i = 0; i < m; i++) {
            brange = sc.nextInt();
            bdir = sc.next().charAt(0);
            
            while (brange-- > 0) {
                if (bdir == 'R') bfield[btime] = bfield[btime-1] + 1;
                else bfield[btime] = bfield[btime-1] - 1;
                btime++;
            }
        }

        int max_time = 0;
        if (atime >= btime) {
            max_time = atime;
            for (int i = btime; i < atime; i++) 
                bfield[i] = bfield[btime-1];
        }
        else {
            max_time = btime;
            for (int i = atime; i < btime; i++) 
                afield[i] = afield[atime-1];
        }

        boolean fold = false;
        int count = 0;

        for (int i = 1; i < max_time; i++) {
            
            if (!fold) {
                if (afield[i] == bfield[i]) {
                    count++;
                    fold = true;
                } 
            } 
            if (afield[i] != bfield[i]) fold = false;
        }

        System.out.print(count);
    }
}