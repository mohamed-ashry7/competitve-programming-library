package Codeforces;

import java.util.Scanner;

public class A263_Beautiful_Matrix {
	public static void main(String[] a) {
		Scanner ss = new Scanner(System.in);
		int[][] x = new int[5][5];
		int row = 0;
		int col = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = ss.nextInt();
				if (x[i][j] == 1) {
					row = i;
					col = j;
				}
			}
		}
		int fr2 = (int) (Math.abs(2 - col) + Math.abs(2 - row));
		System.out.println(fr2);

	}
}
