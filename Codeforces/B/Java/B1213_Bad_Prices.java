package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class B1213_Bad_Prices {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n];
			StringTokenizer stt = new StringTokenizer(br.readLine());
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < n; ++i) {
				a[i] = Integer.parseInt(stt.nextToken());
				if (map.containsKey(a[i])) {
					int c = map.get(a[i]) + 1;
					map.put(a[i], c);
				} else {
					map.put(a[i], 1);
				}
			}

			int badDays = 0;
			for (int i = 0; i < n; i++) {
				int min = map.firstKey();
//				System.out.println(min);
				if (a[i] > min) {
					badDays++;

				}

				if (map.get(a[i]) == 1) {
					map.remove(a[i]);
				} else {
					int c = map.get(a[i]) - 1;
					map.put(a[i], c);
				}

			}
			System.out.println(badDays);
		}

	}

}
