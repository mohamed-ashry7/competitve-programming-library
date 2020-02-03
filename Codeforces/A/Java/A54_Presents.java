package Codeforces;

import java.util.Scanner;

public class A54_Presents {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int k = ss.nextInt() ; 
		int c = ss.nextInt() ; 
		int [] a = new  int [c] ; 
		for (int i = 0 ; i < c ; i ++ ) 
			a[i] = ss.nextInt() ; 
		 
		int p = n/k ;
		for (int i = 0 ; i < a.length ; i ++  ) {
			if (a[i] < k )
				p++ ; 
			else if (a[i] % k != 0 )
				p ++ ; 
		}
		
		System.out.println(p);
	}

}
