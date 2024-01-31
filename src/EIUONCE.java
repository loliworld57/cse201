import java.util.*;
import java.io.*;

public class EIUONCE {
    public static void main(String[] args) throws IOException {
        InputReader sc = new InputReader(System.in);

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tloop = 0; tloop < t; tloop++) {
            int n = sc.nextInt();
            ArrayList<Integer> nNum = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                nNum.add(a);
            }
            Collections.sort(nNum);
            if (nNum.size() == 1) {
                sb.append(nNum.get(0));
            } else {
                for (int i = 0; i < nNum.size(); i++) {
                    if (i == 0) {
                        if (!nNum.get(i).equals(nNum.get(i + 1)))
                            sb.append(nNum.get(i) + " ");
                    } else if (i == nNum.size() - 1) {
                        if (!nNum.get(i).equals(nNum.get(i - 1)))
                            sb.append(nNum.get(i) + " ");
                    } else if (i > 0 && i < nNum.size() - 1) {
                        if (!nNum.get(i).equals(nNum.get(i - 1)) && !nNum.get(i).equals(nNum.get(i + 1)))
                            sb.append(nNum.get(i) + " ");
                    }
                }
            }
            sb.append("\n");
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