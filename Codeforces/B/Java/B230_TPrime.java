package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B230_TPrime {

	static boolean is(long num) {
		int c = 0;
		if (num != 2 && num != 3 && num != 7 && num != 13 && num != 5 && num > 100000)
			if (num % 2 == 0 || num % 3 == 0 || num % 7 == 0 || num % 13 == 0 || num % 5 == 0)
				return false;
		int pow = (int) Math.ceil(Math.pow(num, 0.5));
		for (int i = 2; i <= pow && i < num; ++i) {
			if (num % i == 0)
				c++;
			if (c > 1)
				return false;
		}
		return c == 1;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer stt = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			long b = Long.parseLong(stt.nextToken());
			System.out.println(is(b) ? "YES" : "NO");
		}
	}

}
