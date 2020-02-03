package Codeforces;

import java.util.Scanner;

public class A486_Calculating_Function {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		long n = ss.nextLong();
		long e = (long) 0;
		long o = (long) 0;
		if (n % 2 == 0) {
			e = n * (2 + n);
			o = n * (n);
			e = (long) (e - o) / 4;

		} else {
			e = n * (2 + n);
			o = (n + 4) * (n);
			e = (long) (e - o) / 4 - 1;
		}
		System.out.println(e);
	}
}
