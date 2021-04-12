package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class C701_They_Are_Everywhere {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String apar = br.readLine();
		TreeSet<Character> set = new TreeSet<>();
		for (int i = 0; i < apar.length(); i++) {
			char c = apar.charAt(i);
			set.add(c);
		}
		int dis = set.size();

		int start = 0;
		int c = 0;
		int min = len + 1;
		;
		int[] freq = new int[52];
		for (int i = 0; i < apar.length(); i++) {
			char cha = apar.charAt(i);
			int theChar = (cha >= 'a' && cha <= 'z') ? (cha - 'a') : (cha - 'A' + 26);
			if (freq[theChar]++ == 0) {
				c++;

				if (c == dis) {

					while (true) {

						cha = apar.charAt(start);
						theChar = (cha >= 'a' && cha <= 'z') ? (cha - 'a') : (cha - 'A' + 26);

						if (freq[theChar] == 1) {
							int diff = i - start + 1;
							min = min < diff ? min : diff;
							c--;
							freq[theChar]--;
							start++;
							break;
						}
						freq[theChar]--;

						start++;

					}

				}
			}
		}
		System.out.println(min);
	}

}
