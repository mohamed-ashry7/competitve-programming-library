package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class C903_Boxes {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n =  ss.nextInt() ; 
		long [] a = new long [n] ; 
		for (int i = 0 ; i < n ; i ++ ) 
			a[i] = ss.nextLong() ; 
		Arrays.sort(a );
		int c = 0 ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			long k = a[i] ; 
			for (int j = i+1 ; j < n ; j ++ ) { 
				if (k < a[j] && k != -1 ) { 
					c ++ ; 
					k = a[j] ; 
					a[j] = -1 ; 
				}
			}
		}
		System.out.println(n-c);
		
	}

}
