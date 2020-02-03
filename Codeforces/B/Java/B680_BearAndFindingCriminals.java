package Codeforces;

import java.util.Scanner;

public class B680_BearAndFindingCriminals {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int limak = ss.nextInt() ; 
		limak-- ; 
		int [] a  =new int [n] ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			a[i] = ss.nextInt() ; 
		}
		int i = limak-1 ; 
		int j = limak +1 ; 
		int times = 0 ; 
		if (a[limak] == 1) { 
			times ++ ; 
		}
		for ( ; i>= 0  || j<n ; i-- , j ++  ) { 
			if (i>=0 && j<n) { 
				if (a[i] == a[j] && a[i] == 1 ) { 
					times +=2   ; 
				}

			}
			else if (i>=0 && a[i] == 1 )
				times ++ ; 
			else if (j < n && a[j] == 1 ) 
				times ++ ; 
		}
		System.out.println(times );
	}

}
