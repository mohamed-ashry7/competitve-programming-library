package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class C1213_Book_Reading {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			long n = Long.parseLong(stt.nextToken());
			long m = Long.parseLong(stt.nextToken());
			ArrayList<Integer> theOnes = new ArrayList<>();
			int sum = 0;
			if (n < m) {
				System.out.println(0);
			} else {
				for (long i = m; i <= n; i+=m) {
					int one = (int) (i % 10);
					if (theOnes.contains(one)) {
						break;
					} else {
						sum += one;
						theOnes.add(one);
					}
				}
				long howMany = n / m;
				long mulSum = howMany / theOnes.size();
				long added = howMany % theOnes.size();
				long wan = mulSum * sum;
				for (int i = 0; i < added; ++i) {
					wan += theOnes.get(i);
				}
				System.out.println(wan);

			}
		}
	}

}
