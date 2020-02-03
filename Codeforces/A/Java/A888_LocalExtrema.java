package Codeforces;

import java.util.Scanner;

public class A888_LocalExtrema {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		for (int i = 0 ; i <n ; i ++ ) { 
			a[i] = ss.nextInt() ; 
		}
		int times = 0 ; 
		for (int i = 1 ; i<n-1 ; i ++   ) { 
			if (a[i]>a[i-1] && a[i]>a[i+1]  ||a[i]<a[i-1] && a[i]<a[i+1]  )
				times ++ ; 
		}
		System.out.println(times );
	}
	

}
