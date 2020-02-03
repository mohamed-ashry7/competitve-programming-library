import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p10313_Pay_the_Price {

	static final int NINF = Integer.MIN_VALUE;
	static int UPPER_LIMIT;
	static int LOWER_LIMIT;
	static long memo[][][];
	static boolean memoBoolean[][][];

	static int N;

	// adjust the boundaries ;
	static long howManyWays(int index, int value, int coins) {

		if (value == 0 && coins == 0)
			return 1;

		if (value < 0 || index == N || coins == 0)
			return 0;

		if (memoBoolean[index][value][coins]) {
			return memo[index][value][coins];
		}
		memoBoolean[index][value][coins] = true;
		return memo[index][value][coins] = howManyWays(index, value - index, coins - 1)
				+ howManyWays(index + 1, value, coins);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		memo = new long[301][301][301];
		memoBoolean = new boolean[301][301][301];
		while (true) {
			String readLine = br.readLine();
			if (readLine == null || readLine.length() == 0) {
				break;
			}
			StringTokenizer stt = new StringTokenizer(readLine);
			int n = Integer.parseInt(stt.nextToken());
			N = n + 1;
			UPPER_LIMIT = 300;
			LOWER_LIMIT = 0;

			 if (stt.countTokens() == 1) {
				UPPER_LIMIT = Integer.parseInt(stt.nextToken());

			} else if (stt.countTokens() == 2) {
				LOWER_LIMIT = Integer.parseInt(stt.nextToken());
				UPPER_LIMIT = Integer.parseInt(stt.nextToken());

			}
			if (LOWER_LIMIT > 300) {
				LOWER_LIMIT = 300;
			}
			if (UPPER_LIMIT > 300) {
				UPPER_LIMIT = 300;
			}
			long ans = 0;
			for (int i = LOWER_LIMIT; i <= UPPER_LIMIT; ++i) {
				ans += howManyWays(1, n, i);
			}
			out.println(ans);

		}
		out.flush();
		out.close();

	}

}
