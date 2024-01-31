import java.util.*;
import java.io.*;

public class EIUPH001 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nList = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int a = sc.nextInt();
            if (!nList.contains(a))
            nList.add(a);
        }
        for(int i = 0;i<nList.size();i++){
            System.out.println(nList.get(i));
        }
    }
}