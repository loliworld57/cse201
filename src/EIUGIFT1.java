import java.util.*;

public class EIUGIFT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> gift = new ArrayList<>();
        ArrayList<Integer> wrap = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            gift.add(a);
        }
        Collections.sort(gift);
        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            wrap.add(b);
        }
        Collections.sort(wrap);
        boolean flag = true;
        int i = 0;
        int j = 0;
        while (flag) {

            if (j >= gift.size() || i >= wrap.size()) {
                break;
            }
            double com = (double) wrap.get(i) / gift.get(j);

            if (com >= 2 && com <= 3) {
                count++;
                i++;
                j++;
            } 
            if (com<2)
                i++;
            if (com>3)
                j++;
        }
        System.out.println(count);
    }
}
