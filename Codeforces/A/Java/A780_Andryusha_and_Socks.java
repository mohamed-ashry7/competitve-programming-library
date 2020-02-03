package Codeforces;

import java.util.Scanner;

public class A780_Andryusha_and_Socks {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		boolean [] a = new boolean [n] ; 
		int times = 0 ; 
		int c; 
		int max = 0 ; 
		for (int i = 0 ; i <2*n ; i ++ ) { 
			c = ss.nextInt()  ; 
			if (a[c-1]) { 
				times--  ; 
			}
			else { 
				times ++ ; 
				a[c-1] = true ; 
				if (times > max) { 
					max = times ; 
				}
			}
			
		}
		System.out.println(max );
		
 	}

}
