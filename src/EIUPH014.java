import java.util.*;

public class EIUPH014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        while (n != 0) {
            int count = 0;
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                num[i] = a;
            }
            while (same(num)) {
                count++;
                int[] rNum = new int[n];
                rNum = change(num);
                if (count > 1000)
                    break;
            }
            if (count > 1000) {
                System.out.println(-1);
            } else {
                System.out.println(count);
            }
            n = sc.nextInt();
        }
    }

    public static boolean same(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] != n[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int[] change(int[] n) {
        int t = n[0];
        for (int i = 0; i < n.length - 1; i++) {
            n[i] = Math.abs(n[i] - n[i + 1]);
        }
        n[n.length - 1] = Math.abs(n[n.length - 1] - t);
        return n;
    }
}