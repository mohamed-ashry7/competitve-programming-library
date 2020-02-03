package Codeforces;

import java.util.Scanner;

public class B688_Lovely_Palindromes {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String st = ss.next();

		String sp = new StringBuilder(st).reverse().toString();

		st = st + sp;
		System.out.println(st);

	}
}
