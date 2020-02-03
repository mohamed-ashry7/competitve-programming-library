package Codeforces;

import java.util.Scanner;

public class A231_Team {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int[][] a = new int[ss.nextInt()][3];
		int counter = 0;
		int wan = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = ss.nextInt();
				if (a[i][j] == 1)
					counter++;
			}
			if (counter >= 2)
				wan++;
			counter = 0;
		}
		System.out.println(wan);
	}
}
