import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p11679_Sub_prime {

	public static void main(String[] args) throws IOException {

		Scanner ss = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int banks;
		int depent;
		while ((banks = ss.nextInt()) != 0 && (depent = ss.nextInt()) != 0) {
			int[] reserves = new int[banks + 1];
			for (int i = 1; i < reserves.length; i++) {
				reserves[i] = ss.nextInt();
			}
			for (int i = 0; i < depent; i++) {
				int deb = ss.nextInt();
				int cre = ss.nextInt();
				int r = ss.nextInt();

				reserves[cre] = reserves[cre] + r;
				reserves[deb] = reserves[deb] - r;

			}
			Arrays.sort(reserves);
			if (reserves[0] >=0) {
				w.println("S");
				;
			} else {
				w.println("N");
			}
		}

		w.flush();
		w.close();

	}

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
