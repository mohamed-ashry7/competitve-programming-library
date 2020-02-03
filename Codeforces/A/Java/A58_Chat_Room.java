package Codeforces;

import java.util.Scanner;

public class A58_Chat_Room {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String x = ss.next();
		String he = "hello";
		String c = "";
		int v = 0;
		for (int i = 0; i < x.length() && v < he.length(); i++) {
			if (x.charAt(i) == he.charAt(v)) {
				v++;
				c += x.charAt(i);
				if (c.equals(he))
					break;
			}
		}
		if (c.equals(he))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
