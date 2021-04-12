package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class D519_A_and_B_and_Interesting_Substrings {

	static int[] values;
	static int[] prefixSums;

	public static int addTheSums(ArrayList<Integer> a, int c) {
		int co = 0;
		for (int i = 0; i < a.size(); i++) {
			int sum = a.get(i);
			if (sum == 0 ) { 
				co++ ; 
			}
			for (int j = i+1 ; j < a.size(); j++) {
				sum += a.get(j) + c;
				if (sum == 0) {
					co++;
				}
			}
		}
		return co;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		StringTokenizer stt = new StringTokenizer(br.readLine());
		values = new int[26];

		boolean zeros = true; // to check if all values are zeros or not ;
		for (int i = 0; i < 26; i++) {
			int parseInt = Integer.parseInt(stt.nextToken());
			values[i] = parseInt;
			if (parseInt != 0) {
				zeros = false;
			}

		}
		TreeMap<String, Integer> map = new TreeMap<>();
		String str = br.readLine();
		long sum = 0;
		if (zeros) {
			sum = (long) Long.parseLong(str.length() + "") * Long.parseLong(str.length() - 1 + "");
			sum /= 2;
		} else {
			String alpha = "";
			prefixSums = new int[str.length()];
			prefixSums[0] = values[str.charAt(0) - 'a'];
			for (int i = 1; i < str.length(); ++i) {
				prefixSums[i] = prefixSums[i - 1] + values[str.charAt(i) - 'a'];
			}

			for (int i = 0; i < str.length(); i++) {
				int next = str.indexOf(str.charAt(i), i + 1);
				int prev = i;
				ArrayList<Integer> sums = new ArrayList<>();
				if (!alpha.contains(str.charAt(i) + "")) {
					while (next >= 0) {
						sums.add(prefixSums[next - 1] - prefixSums[prev]);
						prev = next;
						next = str.indexOf(str.charAt(i), next + 1);
					}
					alpha += str.charAt(i);
					sum += addTheSums(sums, values[str.charAt(i) - 'a'] );
				}
			}
		}
		out.println(sum);
		out.flush();
		out.close();
	}

}
