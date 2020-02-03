package Codeforces;

import java.util.Scanner;

public class A59_Word {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int u = 0;
		int w = 0;
		char c;
		String ex = ss.nextLine();
		for (int i = 0; i < ex.length(); i++) {
			c = ex.charAt(i);
			if (c >= 'a' && c <= 'z') {
				w++;
			} else if (c >= 'A' && c <= 'Z')
				u++;
		}
		if (w >= u)
			System.out.println(ex.toLowerCase());
		else
			System.out.println(ex.toUpperCase());
	}
}
