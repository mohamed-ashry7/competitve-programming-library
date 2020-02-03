import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10130_SuperSale {

	static int P[];
	static int W[];
	static int memo[][];

	static int calc(int n, int remW) {
		if (n == W.length || remW == 0) {
			return 0;
		} else if (memo[n][remW] != -1)
			return memo[n][remW];
		else if (remW < W[n]) {
			return memo[n][remW] = calc(n + 1, remW);
		} else {
			return memo[n][remW] = Math.max(calc(n + 1, remW), P[n] + calc(n + 1, remW - W[n]));
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {
			int n = Integer.parseInt(br.readLine());
			P = new int[n];
			W = new int[n];
			memo = new int[n][31];
			for (int i = 0; i < memo.length; ++i) {
				for (int j = 0; j < memo[i].length; ++j) {
					memo[i][j] = -1;
				}
			}
			for (int i = 0; i < n; ++i) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				P[i] = Integer.parseInt(stt.nextToken());
				W[i] = Integer.parseInt(stt.nextToken());
			}
			int persons = Integer.parseInt(br.readLine());
			int all = 0;
			while (persons-- > 0) {
				all += calc(0, Integer.parseInt(br.readLine()));
			}
			System.out.println(all);
		}

	}

}
