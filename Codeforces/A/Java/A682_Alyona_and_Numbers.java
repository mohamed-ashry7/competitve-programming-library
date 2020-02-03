package Codeforces;

import java.util.Scanner;

public class A682_Alyona_and_Numbers {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		long n = ss.nextInt() ; 
		long m = ss.nextInt() ; 
		long divn = n/5 ; 
		long divm = m/5 ; 
		long wan = divm*divn*5 + (n%5)*divm + (m%5)*divn;
		for (int i = 1 ; i<=n%5 ; ++i )
		{
			if (5-i <=m%5)
				++wan; 
		}
		System.out.println(wan);
		
	}

}
