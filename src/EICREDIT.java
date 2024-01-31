import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.*;

public class EICREDIT {
    static InputReader sc = new InputReader(System.in);

    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            int b = sc.nextInt();
            int count = 0;
            for (int j = 0; j < b; j++) {
                int p = sc.nextInt();
                if (p >= 50) {
                    count += 4;
                }
            }
            Student student = new Student(a, count);
            sList.add(student);
        }
        StringBuilder sb = new StringBuilder();
        for(Student s : sList) {
            sb.append(s.name).append(" ").append(s.count).append("\n");
        }
        System.out.println(sb);

    }

    public static class Student {
        String name;
        int count;

        public Student(String name, int count) {
            this.name = name;
            this.count = count;
        }
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
