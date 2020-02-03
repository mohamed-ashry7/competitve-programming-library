package Codeforces;

import java.util.Scanner;

public class A294_Shaass_and_Oskols {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int w = ss.nextInt();

		int[] wires = new int[w + 1];
		for (int i = 1; i <= w; ++i) {
			wires[i] = ss.nextInt();
		}
		int m = ss.nextInt();
		if (w == 1) {
			System.out.println(m == 0 ? wires[1] : 0);
		} else {
			for (int i = 0; i < m; ++i) {
				int x = ss.nextInt();
				int y = ss.nextInt();
				if (x == 1) {
					wires[x + 1] += wires[x] - y;
				} else if (x == w) {
					wires[x - 1] += y - 1;
				} else {
					wires[x + 1] += wires[x] - y;
					wires[x - 1] += y - 1;
				}
				wires[x] = 0;

			}
			for (int i = 1; i <= w; ++i) {
				System.out.println(wires[i]);
			}
		}

	}
}
