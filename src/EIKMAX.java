import java.util.*;
import java.io.*;

public class EIKMAX {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> nList = new ArrayList<>();
        for(int i = 0;i<n;i++) {
            int a = sc.nextInt();
            nList.add(a);
        }
        Collections.sort(nList);
        for(int i = 0,j=nList.size()-1;i<k;i++,j--){
            sb.append(nList.get(j) + " ");
        }
        sb.append("\r");
        System.out.println(sb);
    }

}
