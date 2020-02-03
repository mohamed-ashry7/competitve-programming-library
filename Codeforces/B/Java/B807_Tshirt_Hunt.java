package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B807_Tshirt_Hunt {

	public static boolean is(int score, int p) {

		int i = (score / 50) % 475;
		int x = 25;
		while (x-- > 0) {
			i = (i * 96 + 42) % 475;
			if (i + 26 == p) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(stt.nextToken());
		int score = Integer.parseInt(stt.nextToken());
		int limit = Integer.parseInt(stt.nextToken());
		if (is(score, p)) {
			System.out.println(0);
		} else {
			int diff = score - limit;
			int start = 0;
			if (diff % 50 == 0) {
				start = limit;
			} else {
				int rem = diff % 50;
				start = limit + rem ;
				if (start<0)
					start = 50 ; 
			}
			while (true) {
				if (is(start, p)) {
					if (score >= start) {
						System.out.println(0);
					} else {
						diff = start - score;
						if (diff % 100 == 50) {
							diff += 50;
						}
						System.out.println(diff / 100);
					}
					break;
				}
				start+=50 ; 

			}
		}

	}

}
