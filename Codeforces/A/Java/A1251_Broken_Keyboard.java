package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1251_Broken_Keyboard {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());

		while (q-- > 0) {
			char[] str = br.readLine().toCharArray();
			boolean[] right = new boolean[27];
			if (str.length == 1) {
				right[str[0] - 'a'] = true;
			} else {
				boolean last = false ;
				for (int i = 0 ; i < str.length - 1; ++i) {
					if (i+1 == str.length-1) { 
						last = true ; 
					}

					if (str[i] != str[i + 1]) {
						right[str[i] - 'a'] = true;

					} else {
						++i;
					}
				}
				if (str[str.length - 1] != str[str.length - 2]) {
					right[str[str.length - 1] - 'a'] = true;
				}
				else { 
					if (!last) { 
						right[str[str.length - 1] - 'a'] = true;

					}
				}
				
			}
			String res = "";
			for (int i = 0; i < right.length; ++i) {
				if (right[i]) {
					res = res + (char) (i + 'a');
				}
			}
			System.out.println(res);
		}
	}

}
