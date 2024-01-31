import java.util.*;

public class EIUGIFTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long[] gift = new long[n];
        int i = 0;
        int j = n - 1;
        long maxdif = 0;
        long mindif = 0;
        long result = 0;
        while (i < j) {
            maxdif = gift[i] + gift[j];
            mindif = Math.abs(gift[i] - gift[j]);
            if (maxdif <= t && (Math.abs(gift[i] - gift[j]) <= mindif)) {
                result = maxdif;
            } else {

            }
            if (gift[i] <= gift[j]) {
                i++;
            } else if (gift[i] > gift[j])
                j--;            
        }
        System.out.println(result + " " + mindif);
    }
}
