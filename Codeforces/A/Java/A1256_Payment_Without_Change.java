package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1256_Payment_Without_Change {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			int n = Integer.parseInt(stt.nextToken());
			int s = Integer.parseInt(stt.nextToken());
			int div = s / n;
			int rem = s % n;
			if (div > a) {
				rem += (div - a) * n;

			}

			if (rem <= b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
