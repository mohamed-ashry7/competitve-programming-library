package Codeforces;

import java.util.Scanner;

public class A50_Domino_piling {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n1 = ss.nextInt();
		int n2 = ss.nextInt();
		int multi = n1 * n2;
		multi = multi - multi % 2;
		int domin = multi / 2;
		System.out.println(domin);
	}
}
