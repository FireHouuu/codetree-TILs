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

        int max_time = Math.max(atime, btime);

        // 로봇이 멈춘 위치를 계속 유지하도록 처리
        // 이 부분에서 수정된 것은 for 루프의 범위입니다.
        // atime - 1과 btime - 1까지만 유효한 인덱스입니다.
        for (int i = atime; i < max_time; i++) 
            afield[i] = afield[atime - 1];
        for (int i = btime; i < max_time; i++) 
            bfield[i] = bfield[btime - 1];

        boolean fold = false;  // 초기값을 false로 설정
        // fold의 초기값을 false로 설정하여
        // 첫 번째 시간 단계에서 로봇이 같은 위치에 있을 때 이를 감지할 수 있게 함
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