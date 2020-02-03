package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A330_Cakeminator {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(stt.nextToken());
		int c = Integer.parseInt(stt.nextToken());
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		for (int i = 0; i < r; i++) {
			String row = br.readLine();
			for (int j = 0; j < c; j++) {
				char ch = row.charAt(j);
				if (ch == 'S') {
					if (!x.contains(i)) {
						x.add(i);
					}
					if (!y.contains(j)) {
						y.add(j);
					}
				}
			}
		}
		System.out.println(c*r - x.size()*y.size());

	}

}
