package Codeforces;

import java.util.Scanner;

public class A633_Ebony_and_Ivory {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a = ss.nextInt();
		int b = ss.nextInt();
		int c = ss.nextInt();
		int t = 0;
		int f = 0;
		if (c == a || c == b) {
			t = c;
		} else {
			for (int x = 0; x < 100; x++) {
				t = 0;
				for (int y = 0; t < c; y++) {
					t = x * a + y * b;
				}
				if (t == c)
					break;

			}
			if (t != c) {
				for (int j = 0; j < 100; j++) {
					f = 0;
					for (int i = 0; f < c; i++) {
						f = i * a + j * b;
					}
					if (f == c)
						break;

				}
			}
		}
		if (t == c || f == c)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
