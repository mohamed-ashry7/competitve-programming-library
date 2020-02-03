import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10855_Rotated_square {
	static String[] big;

	public static String[] rotate90clk(String[] str) {
		char[][] org = new char[str.length][str.length];
		char[][] rtd = new char[str.length][str.length];
		String[] rotated = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			org[i] = str[i].toCharArray();
			rtd[i] = new char[str.length];
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				rtd[j][str.length - 1 - i] = org[i][j];
			}
		}
		for (int i = 0; i < rtd.length; i++) {
			rotated[i] = new String(rtd[i]);
		}

		return rotated;
	}

	public static int smallMatchesBig(String[] small) {
		int matches = 0;
		for (int i = 0; i < big.length - small.length + 1; i++) {
			int start = big[i].indexOf(small[0], 0);
			while (start >= 0) {
				boolean yes = true;
				int k = 1;

				for (int j = i + 1; k < small.length && j < big.length; j++, k++) {
					int start2 = big[j].indexOf(small[k], start);

					if (start != start2) {
						yes = false;
						break;
					}

				}
				start = big[i].indexOf(small[0], start + 1);
				if (yes && k == small.length) {
					matches++;
				}
			}
		}
		return matches;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(stt.nextToken());
			int n = Integer.parseInt(stt.nextToken());
			if (n + N == 0) {
				break;
			}
			big = new String[N];
			String[] small = new String[n];
			for (int i = 0; i < N; i++) {
				big[i] = br.readLine();
			}
			for (int i = 0; i < n; i++) {
				small[i] = br.readLine();
			}
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < 4; i++) {

				str.append(smallMatchesBig(small) + " ");

				small = rotate90clk(small);
			}
			System.out.println(str.toString().substring(0, str.toString().length() - 1));
		}
	}

}
