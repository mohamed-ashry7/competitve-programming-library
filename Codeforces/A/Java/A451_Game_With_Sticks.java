package Codeforces;

import java.util.*;

public class A451_Game_With_Sticks {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String[] winn = { "Akshat", "Malvika" };
		int m = ss.nextInt();
		int n = ss.nextInt();
		int wnr = 0;
		int t = m * n;
		int tem;
		if (m > n) {
			tem = m;
			m = n;
			n = tem;
		}
		for (; t > 1; m--) {
			if (wnr == 0) {
				t = m * n;
				wnr = 1;
			} else {
				t = m * n;
				wnr = 0;
			}
		}
		System.out.println(winn[wnr]);

	}

}
