import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p11661_Burger_Time {

	public static void main(String[] args) throws IOException {

		Scanner ss = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);

		int line;
		while ((line = ss.nextInt()) != 0) {
			String x = ss.next() ; 
			int d = -1;
			int r = -1;
			int diff = (int) 1e9;
			for (int i = 0; i < line; i++) {
				if (x.charAt(i) == 'Z') {
					diff = 0;
					break;
				} else if (x.charAt(i) == 'D') {
					d = i;

					if (r != -1) {
						diff = (d - r) > diff ? diff : (d - r);
					}
				} else if (x.charAt(i) == 'R') {
					r = i;

					if (d != -1) {
						diff = (r - d) > diff ? diff : (r - d);

					}
				}
				
			}

			w.println(diff);
		}
		w.close();
	}

//	static class Scanner {
//
//		BufferedReader br;
//		StringTokenizer st;
//
//		public Scanner(InputStream s) {
//			br = new BufferedReader(new InputStreamReader(s));
//		}
//
//		public String next() throws IOException {
//			while (st == null || !st.hasMoreTokens())
//				st = new StringTokenizer(br.readLine());
//			return st.nextToken();
//
//		}
//
//		public int nextInt() throws IOException {
//
//			return Integer.parseInt(next());
//		}
//
//		public long nextLong() throws IOException {
//			return Long.parseLong(next());
//		}
//
//		public String nextLine() throws IOException {
//			return br.readLine();
//		}
//
//	}
	static class Scanner {

		BufferedReader br;
		StringTokenizer st;
		
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}

}
