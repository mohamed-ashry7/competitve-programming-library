package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class B879_TableTennis {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int  n = ss.nextInt() ; 
		long k = ss.nextLong()  ; 
		int []  a = new int [n]  ; 
		for ( int i = 0 ;  i < n ; i ++ ) { 
			a[i] = ss.nextInt()  ;
		}
		int i = 0  ; 
		int max = a[0] ; 
		if (n<=k) { 
			System.out.println(Arrays.stream(a).max().getAsInt());
		}
		else {
		int c = Arrays.stream(a,0,(int)(k+1)).max().getAsInt(); 
		if (max == c)
			System.out.println(c);
		else { 
		boolean b = true  ; 
			max = a[1] ; 
			i= 1 ; 
		for (; i<n-k+1 ; i ++ )  {
			c = Arrays.stream(a,i-1,(int)(i+k)).max().getAsInt(); 
			if (c == max) {
				b = false ; 
				System.out.println(c);
				break ; 
			}
			else {
				max = a[i+1] ; 
			}
			
		}
		if (b)
		System.out.println(Arrays.stream(a).max().getAsInt());
		}

	}
	}
}
