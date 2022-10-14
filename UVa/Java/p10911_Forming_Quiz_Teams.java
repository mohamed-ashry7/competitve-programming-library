package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p10911_Forming_Quiz_Teams {

	public static Pair[] POS;
	public static int N;

	static HashMap<Integer, Double> memo;

	public static double dp(int bitmask) {

		
		if ((1<<POS.length)-1 == bitmask ) {
			return 0 ; 
		}
		if (memo.get(bitmask) != null) {
			return memo.get(bitmask);
		}

		double minDis = Integer.MAX_VALUE;
		int p1 = -1;
		for (int i = 0; i < POS.length; i++) {
			if (((1 << i) & bitmask) == 0) {
				if (p1 < 0) {
					p1 = i;
					break ; 
				} 
			}
		}
		for (int i = p1 +1 ; i<POS.length ; i ++ ) {
			if (((1 << i) & bitmask) == 0) {
				double disPoints = POS[i].calculateEuc(POS[p1]);
				double d = dp(bitmask | 1 << i | 1 << p1);
				minDis = Math.min(minDis, d + disPoints);

			}
		}
		memo.put(bitmask, minDis);
		return minDis;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int c = 0;
		while ((N = Integer.parseInt(br.readLine())) != 0) {
			POS = new Pair[2 * N];
			memo = new HashMap<>();
			for (int i = 0; i < N * 2; i++) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				stt.nextToken();
				POS[i] = new Pair(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()));

			}

			pw.println(String.format("Case %d: %.02f", ++c, dp(0)));
		}
		pw.flush();

	}

	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;

		}

		public double calculateEuc(Pair p) {
			return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
		}
	}
}
