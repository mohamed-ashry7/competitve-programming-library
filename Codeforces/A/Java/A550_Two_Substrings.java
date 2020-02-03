package Codeforces;

import java.util.Scanner;

public class A550_Two_Substrings {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String s = ss.next();
		boolean f1 = false;
		boolean f2 = false;
		String t = "";
		int c = 0;
		int f = 0;
		int g = 0;
		String s2 = s;
		boolean c1 = s.contains("AB");
		boolean c2 = s.contains("BA");
		if (c1 && c2) {
			f = s.indexOf("A");
			g = s.indexOf("B");
			if (f < g)
				s = s.substring(f);
			else
				s = s.substring(g);
			for (; s.length() >= 3;) {
				t = s.substring(0, 2);
				if (t.equals("AB") || t.equals("BA")) {
					c++;
					s = s.substring(2);
					if (t.equals("AB")) {
						if (s.charAt(0) == 'A')
							s = s.substring(1);
					}
					if (t.equals("BA")) {
						if (s.charAt(0) == 'B')
							s = s.substring(1);
					}
				} else
					s = s.substring(1);
				if (c >= 2)
					break;
			}

		}
		if (s.equals("AB") || s.equals("BA")) {
			c++;
		}
		if (c >= 2)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}
