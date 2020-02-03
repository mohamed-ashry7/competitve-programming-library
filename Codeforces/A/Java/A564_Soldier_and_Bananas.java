package Codeforces;

import java.util.Scanner;

public class A564_Soldier_and_Bananas {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int k = ss.nextInt();
		long n = ss.nextLong();
		int w = ss.nextInt();
		long cash = 0;
		for (int i = 1; i <= w; i++) {
			cash = cash + i * k;
		}
		if (cash > n)
			cash = (long) (cash - n);
		else
			cash = 0;
		System.out.println(cash);
	}
}
