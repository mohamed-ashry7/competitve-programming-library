package Codeforces;

import java.util.Scanner;

public class A339_Helpful_Maths {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String x = ss.next();
		StringBuilder y = new StringBuilder(x);
		int one = 0;
		int two = 0;
		int three = 0;

		for (int i = 0; i < x.length(); i = i + 2) {

			if (x.charAt(i) == '1')
				one++;
			else if (x.charAt(i) == '2')
				two++;
			else if (x.charAt(i) == '3')
				three++;

		}
		for (int i = 0; i < x.length(); i = i + 2) {

			if (one > 0) {
				y.setCharAt(i, '1');
				one--;
			} else if (two > 0) {
				y.setCharAt(i, '2');
				two--;
			} else if (three > 0) {
				y.setCharAt(i, '3');
				three--;
			}

		}
		System.out.println(y);
	}
}
