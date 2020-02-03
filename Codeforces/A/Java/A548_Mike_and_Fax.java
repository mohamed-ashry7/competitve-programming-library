package Codeforces;

import java.util.Scanner;

public class A548_Mike_and_Fax {
	public static boolean check(String st) {
		String sp = "";
		for (int i = 0; i < st.length(); i++) {
			sp = st.charAt(i) + "" + sp;
		}
		if (sp.equals(st))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String x = ss.next();
		int y = ss.nextInt();
		String st = "";
		boolean h = true;
		if (x.length() % y != 0)
			h = false;
		int f = x.length() / y;
		for (int i = 0; i < y && h; i++) {
			st = x.substring(0, f);
			x = x.substring(f);
			h = check(st);

		}
		if (h)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}
