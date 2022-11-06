package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p11284_Shopping_Trip {

	static int[][] graph;
	static int[] stores;
	static int INF = (int) 1e7;
	static int[] saves;
	static int[][] memo;
	static int UNCAL = -123456789;
	static int P ; 
	public static int dp(int from, int bitmask) {

		if (bitmask == ((1 << P) - 1)) {
			return 0 - graph[from][0];
		}
		if (memo[from][bitmask] != UNCAL) {

			return memo[from][bitmask];
		}
		int val = -graph[from][0];
		for (int i = 0; i < stores.length; i++) {
			if (((1 << stores[i]) & bitmask) == 0 && stores[i]!=-1) {
				val = Math.max(val, saves[i] - graph[from][i] + dp(i, bitmask | 1 << stores[i]));
			}
		}
		return memo[from][bitmask] = val;

	}

	static int doubleToInt(String x) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < x.length(); i++)
			if (x.charAt(i) >= '0' && x.charAt(i) <= '9')
				sb.append(x.charAt(i));
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cases = Integer.parseInt(st.nextToken());

		while (cases-- > 0) {
			br.readLine();

			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			graph = new int[n + 1][n + 1];
			for (int i = 0; i < n + 1; i++) {
				Arrays.fill(graph[i], INF);
			}
			int m = Integer.parseInt(st.nextToken());

			while (m-- > 0) {
				st = new StringTokenizer(br.readLine());
				int f = Integer.parseInt(st.nextToken());
				int t = Integer.parseInt(st.nextToken());
				int c = (int) (doubleToInt(st.nextToken()));

				if (graph[f][t] != INF) {
					c = Math.min(c, graph[f][t]);
				}
				graph[f][t] = graph[t][f] = c;

			}
//			Floyed-Warshall Algorithm 

			for (int k = 0; k < n + 1; k++) {
				for (int i = 0; i < n + 1; i++) {
					for (int j = 0; j < n + 1; j++) {
						graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
					}
				}
			}

			st = new StringTokenizer(br.readLine());
			P = Integer.parseInt(st.nextToken());
			stores = new int[n + 1];
			saves = new int[n + 1];
			Arrays.fill(stores, -1);
			memo = new int[n + 1][1<<P];
			for (int i = 0; i < n + 1; i++) {
				Arrays.fill(memo[i], UNCAL);
			}

			for (int i = 0; i < P; i++) {
				st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				stores[c] = i;
				saves[c] += (int) (doubleToInt(st.nextToken()));
			}

			double dp = dp(0, 0);
			if (dp > 0) {
				pw.println(String.format("Daniel can save $%.2f",dp / 100.0));
			} else {
				pw.println("Don't leave the house");
			}

		}
		pw.flush();
	}

}
