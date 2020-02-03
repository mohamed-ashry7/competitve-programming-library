package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A653_Bear_and_Three_Balls {
	public static boolean contains(int[] a, int n) {
		boolean one = false;
		boolean two = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] - n == 1)
				one = true;
			if (a[i] - n == 2)
				two = true;
		}
		return one && two;
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int[] a = new int[ss.nextInt()];
		for (int i = 0; i < a.length; i++)
			a[i] = ss.nextInt();
		boolean f = false;
		for (int i = 0; i < a.length; i++) {
			if (contains(a, a[i])) {
				f = true;
				break;
			}
		}
		if (f)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}
