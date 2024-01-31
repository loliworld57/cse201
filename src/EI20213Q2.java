
import java.util.*;
public class EI20213Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        int n = sc.nextInt();
        TreeMap<Integer,Integer> input = new TreeMap<>();
        for(int i = 0; i<n;i++) {
            int a = sc.nextInt();
            input.put(a,input.getOrDefault(a, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> result : input.entrySet()) {
            sb.append(result.getKey() + " " + result.getValue() + "\n\n");
        }
        System.out.println(sb);
    }
}
