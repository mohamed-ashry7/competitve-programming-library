package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1244_Pens_and_Pencils {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		while (tests-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			double c = Integer.parseInt(stt.nextToken());
			double d = Integer.parseInt(stt.nextToken());
			int k = Integer.parseInt(stt.nextToken());
			int pens = (int) Math.ceil(a / c);
			int pencils = (int) Math.ceil(b / d);
			if (pens +pencils  > k) {
				System.out.println(-1);
			} else {
				System.out.printf("%d %d\n", pens, pencils);
			}

		}
	}

}
