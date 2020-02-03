import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p11420_Chest_of_Drawers {

	static BigInteger memo[][][];

	static BigInteger calc(int n, int s, int prev) {
		if (s>n) { 
			return BigInteger.ZERO ; 
		}
		if (n == 0) {
			if (s == 0)
				return BigInteger.ONE;
			else
				return BigInteger.ZERO;
		} else if (s < 0 || n < 0 ) {
			return BigInteger.ZERO;
		} else if (memo[prev][n][s] != null) {
			return memo[prev][n][s];
		} else {
			if (prev == 1) {
				return memo[prev][n][s] = calc(n - 1, s, 0).add(calc(n - 1, s - 1, 1));
			} else {
				return memo[prev][n][s] = calc(n - 1, s, 0).add(calc(n - 1, s, 1));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		memo = new BigInteger[2][67][67];

		while (true) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			int s = Integer.parseInt(stt.nextToken());
			if (n < 0 ) {
				break;
			}
//			try {
			System.out.println(calc(n, s, 1).toString());
//			}
//			catch (Exception e ) { 
//				
//			}
		}

	}

}
