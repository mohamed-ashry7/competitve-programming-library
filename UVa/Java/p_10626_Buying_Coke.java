package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_10626_Buying_Coke {

	static int INF = (int) 1e6;
	static int memo[];
//	static int dpp(int c1, int c5, int c10, int cur) {
//		if (cur >= 8) {
//			return 0;
//		}
//		int d1 = INF;
//		int d5 = INF;
//		int d10 = INF;
//		if (c1 > 0) {
//			d1 = dp(c1 - 1, c5, c10, cur + 1);
//		}
//		if (c5 > 0) {
//			d5 = dp(c1, c5 - 1, c10, cur + 5);
//
//		}	
//		if (c10 > 0) {
//			d10 = dp(c1, c5, c10 - 1, cur + 10);
//
//		}
//		return 1 + Math.min(d1, Math.min(d5, d10));
//	}

	static int hash(int c1, int c5, int c10, int n) {
		return n + c5 * 313  + c10 * 313 * 313 ;
	}

	static int dp(int c1, int c5, int c10, int cur) {
		if (cur == 0) {
			return 0;
		}
		if (memo[hash(c1, c5, c10, cur)]!=-1) {
			return memo[hash(c1, c5, c10, cur)] ; 
		}
		int d1 = INF;
		int d2 = INF;
		int d3 = INF;
		int d4 = INF;
		int d5 = INF;

		if (c1 > 8) {
			d1 = 8 + dp(c1 - 8, c5, c10, cur - 1);
		}
		if (c5 >= 1 && c1 >= 3) {
			d2 = 4 + dp(c1 - 3, c5 - 1, c10, cur - 1);
		}
		if (c10 > 0) {
			d3 = 1 + dp(c1 + 2, c5, c10 - 1, cur - 1);
		}
		if (c5 >= 2) {
			d4 = 2 + dp(c1 + 2, c5 - 2, c10, cur - 1);
		}
		if (c10>=1&&c1>=3) {
			d5 = 4+dp(c1-3,c5+1,c10-1,cur-1);
		}
		return memo[hash(c1, c5, c10, cur)] = Math.min(Math.min(d3, d4), Math.min(d1, Math.min(d2, d5)));

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cases = Integer.parseInt(br.readLine());
		while (cases-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int c1 = Integer.parseInt(st.nextToken());
			int c5 = Integer.parseInt(st.nextToken());
			int c10 = Integer.parseInt(st.nextToken());
			memo = new int[hash(c1+1, c5+1, c10+1, n)];
			Arrays.fill(memo, -1);
			System.out.println(dp(c1, c5, c10, n));
		}

	}

}
