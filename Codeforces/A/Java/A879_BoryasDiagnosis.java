package Codeforces;

import java.util.Scanner;

public class A879_BoryasDiagnosis {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int days = 0 ; 
		int s ,d ,v ; 
		for (int i = 0 ; i < n ; i ++ ) {
			s = ss.nextInt() ; 
			d = ss.nextInt() ; 
			if ( i == 0 ) {
				days =s ; 
			}
			else {
				if (days > s ) {
					int r = (days-s )/d ; 
					 v= s +r*d   ; 
				while ( v<=days ) { 
					v+=d ; 
				} 
				}
				else  if (days < s   ){
					v = s ; 
				}
				else {
					v = s + d ; 
				}
				days = v ; 
			}
		}
		System.out.println(days);
	}

}
