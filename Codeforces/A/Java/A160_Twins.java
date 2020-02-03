package Codeforces;

import java.util.Scanner;

public class A160_Twins {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int summ = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ss.nextInt();
			summ += a[i];
		}
		int half = summ / 2;
		int temp;
		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {
				if (i != j) {
					if (a[i] < a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		int greed = 0;
		int i = 0;
		for (; i < n; i++) {
			if (greed <= half) {
				greed += a[i];
			} else {
				break;
			}

		}
		System.out.println(i);
	}
}
