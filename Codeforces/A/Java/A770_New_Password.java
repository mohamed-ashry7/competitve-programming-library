package Codeforces;

import java.util.Scanner;

public class A770_New_Password {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in) ; 
		int n = ss.nextInt() ; 
		int k = ss.nextInt() ; 
		
		int indexChar = 'a' ;
		String wan = "" ;
		for (int i = 0 ; i<n;++i) { 
			wan+= (char)(indexChar) ;
			indexChar++ ; 
			indexChar = (indexChar-'a')%k + 'a' ; 
		}
		System.out.println(wan);
	}

}
