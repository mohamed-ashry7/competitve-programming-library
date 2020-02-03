import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p11368_Nested_Dolls {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt;
		int tests = Integer.parseInt(br.readLine());
		while (tests-- > 0) {
			int m = Integer.parseInt(br.readLine());
			PriorityQueue<Doll> dolls = new PriorityQueue<>();
			stt = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; ++i) {

				if (stt.countTokens() == 0) {
					stt = new StringTokenizer(br.readLine());
				}
				dolls.add(new Doll(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken())));
			}
			int[] memo = new int[m];
			memo[0] = 1;
			Doll[] con = new Doll[m];
			con[0] = dolls.poll();
			for (int i = 1; i < m; ++i) {
				Doll a = dolls.poll();
				memo[i] = 1;
				con[i] = a;
				for (int j = i - 1; j >= 0; --j) {
					if (a.getHeight() > con[j].getHeight() && a.getWidth() > con[j].getWidth()) {
						memo[i] = Math.max(memo[i], memo[j] + 1);
					}
				}
			}
			//handle the freq ; 
//			int[] freq = new int[memo[m - 1] + 1];
//			for (int i = 0; i < m; ++i) {
//				freq[memo[i]]++;
//			}
//			System.out.println(Arrays.toString(memo));
//			int sets = 0;
//			int cum = 0;
//			for (int i = freq.length - 1; i > 0; --i) {
//
//				if (cum + freq[i] >= 0) {
//					cum -= freq[i];
//					sets += 1;
//				}
//			}
//			System.out.println(sets);
		}
	}

	static class Doll implements Comparable<Doll> {
		int width;
		int height;

		public Doll(int w, int h) {
			this.width = w;
			this.height = h;
		}

		int getWidth() {
			return width;
		}

		int getHeight() {
			return height;
		}

		int getArea() {
			return width * height;
		}

		@Override
		public int compareTo(Doll d) {
			return this.getArea() - d.getArea();
		}
	}
}
