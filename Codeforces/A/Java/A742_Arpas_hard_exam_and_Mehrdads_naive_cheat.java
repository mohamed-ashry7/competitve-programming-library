package Codeforces;

import java.util.Scanner;

public class A742_Arpas_hard_exam_and_Mehrdads_naive_cheat {

	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);

		int n = ss.nextInt();
		int p = n % 4;
		if (n == 0) {
			System.out.println(1);
		} else {
			if (p == 0)
				p = 4;
			System.out.println((int) Math.pow(8, p) % 10);
		}
	}

}
