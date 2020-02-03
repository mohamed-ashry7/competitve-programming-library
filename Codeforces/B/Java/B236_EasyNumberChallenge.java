package Codeforces;

import java.util.Scanner;

public class B236_EasyNumberChallenge {
	public static int NoDiv(int n ) {
		if (n==1 )
			return 1 ; 
		int c = 2 ; 
		for (int i = 2 ; i < n ; i ++ ){
			if (n%i == 0 )
				c++ ; 
		}
		return c ; 
			
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int a = ss.nextInt() ; 
		int b = ss.nextInt() ; 
		int c = ss.nextInt() ; 
		int summ = 0 ; 
		for (int i = 1 ; i<=a ; i ++ ) {
			for (int j = 1 ; j <=b ; j++ ){
				for (int k = 1 ; k <=c ; k++ ){
					summ+=NoDiv(i*j*k) ; 
				}
			}
		}
		System.out.println(summ);
	}

}
