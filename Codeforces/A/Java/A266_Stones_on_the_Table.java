package Codeforces;

import java.util.Scanner;

public class A266_Stones_on_the_Table {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		String x = ss.next();
		int c = 0;
		int i = 0;

		for (; i < x.length() - 1; i++) {
			if (x.charAt(i) == x.charAt(i + 1)) {
				c++;

			}
		}

		System.out.println(c);
	}
}
