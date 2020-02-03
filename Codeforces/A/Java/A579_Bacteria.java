package Codeforces;

import java.util.Scanner;

public class A579_Bacteria {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		long n = ss.nextLong() ; 
		int b = 0 ; 
		while (n>0) { 
			b += n%2 ; 
			n/=2 ; 
		}
		System.out.println(b);
	}

}
