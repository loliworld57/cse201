import java.io.*;
import java.util.*;

class EIUGRADE {
    static InputReader sc = new InputReader(System.in);

    public static void main(String[] args) {
        Map<String, Person> bdMap = new HashMap<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            if (d < 10) {
                sb.append("0");
            }
            sb.append(d).append("/");
            if (m < 10) {
                sb.append("0");
            }
            sb.append(m).append("/");
            sb.append(y);
            Person person = bdMap.get(sb.toString());
            if (person == null) {
                person = new Person(d, m, y, sb.toString());
                bdMap.put(sb.toString(), person);
            }
            person.count++;
        }
        List<Person> plist = new ArrayList<>(bdMap.values());

        plist.sort((p1, p2) -> {
            int compare = p1.year - p2.year;
            if (compare == 0) {
                compare = p1.month - p2.month;
                if (compare == 0) {
                    compare = p1.day - p2.day;
                }
            }
            return compare;
        });
        StringBuilder sb = new StringBuilder();
        for (Person p : plist) {
            sb.append(p.dob).append(" ").append(p.count).append("\n");
        }
        System.out.println(sb);
    }

    static class Person {
        int day;
        int month;
        int year;
        String dob;
        int count;

        public Person(int day, int month, int year, String dob) {
            this.day = day;
            this.month = month;
            this.year = year;
            this.dob = dob;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public String getDob() {
            return dob;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
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