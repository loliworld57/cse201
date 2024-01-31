import java.util.*;
import java.io.*;

public class EIUTRANS {
    static InputReader sc = new InputReader(System.in);

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<String, String> dictionary = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String la = sc.next();
            String lb = sc.next();
            dictionary.put(la, lb);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String lr = sc.next();
            if (dictionary.containsKey(lr)) {
                String bString = dictionary.get(lr);
                if (bString.length() < lr.length() ) {
                    sb.append(bString).append(" ");
                } else {
                    sb.append(lr).append(" ");
                }
            }
        }
        System.out.println(sb);
    }

    static class InputReader {
        StringTokenizer tokenizer;
        BufferedReader reader;
        String token;
        String temp;

        public InputReader(InputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    if (temp != null) {
                        tokenizer = new StringTokenizer(temp);
                        temp = null;
                    } else {
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                } catch (IOException e) {
                }
            }
            return tokenizer.nextToken();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
