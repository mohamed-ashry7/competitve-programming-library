package Codeforces;

import java.util.Scanner;

public class A236_Boy_or_Girl {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String g = ss.next();
		String st = "";
		int c = 0;
		for (int i = 0; i < g.length(); i++) {
			if (st.indexOf(g.charAt(i)) == -1) {
				c++;
			}
			st = st + g.charAt(i);

		}
		if (c % 2 == 0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");

	}
}
