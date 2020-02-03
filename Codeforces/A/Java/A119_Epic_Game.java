package Codeforces;

import java.util.Scanner;

public class A119_Epic_Game {
	public static int ggg(int n, int r) {
		while (n != r) {
			if (n < r)
				r -= n;
			else if (n > r)
				n -= r;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a = ss.nextInt();
		int b = ss.nextInt();
		int n = ss.nextInt();
		int rank = 0;
		while (n > 0) {
			if (rank % 2 == 0) {
				n -= ggg(n, a);
				rank++;
			} else if (rank % 2 == 1) {
				n -= ggg(n, b);
				rank++;
			}

		}
		if (rank % 2 == 0) {
			rank = 1;
		} else
			rank = 0;
		System.out.println(rank);

	}
}
