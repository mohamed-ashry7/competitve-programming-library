package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1251_Binary_Palindromes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());

		while (q-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] ones = new int[n];
			int[] zeroes = new int[n];

			for (int i = 0; i < n; ++i) {
				String str = br.readLine();
				for (int j = 0; j < str.length(); ++j) {
					if (str.charAt(j) == '0') {
						zeroes[i]++;
					} else {
						ones[i]++;
					}
				}

			}
			int pal = 0;


			for (int i = 0; i < n; ++i) {
				if ((ones[i] + zeroes[i]) % 2 == 0) {
					if (ones[i] % 2 == 0 && zeroes[i] % 2 == 0) {
						pal++;

					} else {
						for (int j = i + 1; j < n; ++j) {
							if (ones[j] > 0) {
								ones[j]--;
								ones[i]++;
								zeroes[i]--;
								zeroes[j]++;
								pal++ ; 
								break;
							}
							if (zeroes[j] > 0) {
								ones[j]++;
								ones[i]--;
								zeroes[i]++;
								zeroes[j]--;
								pal++;
								break;
							}
						}
					}
				} else {

					pal++;
		

				}
			}
			System.out.println(pal);
		}
	}

}
