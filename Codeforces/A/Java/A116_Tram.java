package Codeforces;

import java.util.Scanner;

public class A116_Tram {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int max = 0;
		int maw = 0;
		int a;
		int b;
		for (int i = 1; i <= n; i++) {
			a = ss.nextInt();
			b = ss.nextInt();
			maw = b - a + maw;
			if (maw > max)
				max = maw;

		}
		System.out.println(max);
	}
}
