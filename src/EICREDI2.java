import java.io.*;
import java.util.*;

public class EICREDI2 {
    static InputReader sc = new InputReader(System.in);

    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            int b = sc.nextInt();
            int count = 0;
            List<Integer> pList = new ArrayList<>();
            for (int j = 0; j < b; j++) {
                int p = sc.nextInt();
                if (p >= 50) {
                    pList.add(p);
                }
            }
            Student student = new Student(a, pList);
            sList.add(student);
        }
        StringBuilder sb = new StringBuilder();
        for (Student s : sList) {

            sb.append(s.name).append(" ");
            for (int i = 0; i < s.p.size(); i++) {
                sb.append(s.p.get(i)).append(" ");
            }
            sb.append(s.avgScore(s.p)).append("\n");
        }
        System.out.println(sb);
    }

    public static class Student {
        String name;
        List<Integer> p = new ArrayList<>();

        public Student(String name, List<Integer> p) {
            this.name = name;
            for (int i = 0; i < p.size(); i++) {
                this.p.add(p.get(i));
            }
        }

        public static int avgScore(List<Integer> p) {
            int avg = 0;
            int total = 0;
            if (p.size() > 0) {
                for (int i = 0; i < p.size(); i++) {
                    total += p.get(i);
                }
                avg = (int) total / p.size();
            }
            return avg;
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
