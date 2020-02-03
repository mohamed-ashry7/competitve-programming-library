package Codeforces;

import java.util.Scanner;

public class A131cAPS_lOCK {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String x = ss.next();
		String check = x.toUpperCase();
		String part = x.substring(1);
		String check2 = part.toUpperCase();
		String g = x.charAt(0) + "";
		g = g.toUpperCase();
		if (check.equals(x)) {
			System.out.println(x.toLowerCase());
		} else if (check2.equals(part)) {
			System.out.println(g + part.toLowerCase());
		} else
			System.out.println(x);

	}
}
