package Codeforces;

import java.util.Scanner;

public class A365_Good_Number {

	
	static boolean isItGoodNumber (String number , int k ) { 
		
		for (int i = 0 ; i<=k ; ++i ) { 
			if (!number.contains(i+"")) {
				return false ; 
			}
		}
		return true ; 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int k =ss.nextInt() ; 
		int count = 0 ; 
		for (int i = 0 ; i < n ; ++ i ) { 
			if (isItGoodNumber(ss.nextInt()+"", k))
			count++; 
		}
		System.out.println(count);
	}

}
