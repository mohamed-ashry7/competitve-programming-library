package Codeforces;

import java.util.Scanner;

public class A935_FafaAndHisCompany {

	public static void main(String[] args) {

		
		
		
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int c = 1 ; 
		for (int i = 2 ; i <=n/2 ; i ++ ) { 
			if (n%i == 0 )
				c++ ; 
		}
		System.out.println(c);
	}

}
