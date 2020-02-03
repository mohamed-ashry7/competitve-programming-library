package Codeforces;

import java.util.Scanner;

public class A794_TaymyrIsCalling {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int m  = ss.nextInt() ; 
		int z = ss.nextInt() ; 
		int mm = m ; 
		int nn = n ; 
		int killed = 0  ;
		int in = 2 ;
		int im = 2 ; 
		while (n<=z) { 
			if (n>=m) { 
				if (n==m)
				killed ++;
				m = mm * im   ; 
				im ++ ; 
				
			}
			else {
				n = in*nn  ; 
				in ++ ; 
			}
			
		}
		System.out.println(killed);
		
	}

}
