package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class A903_HungryStudent {
	public static boolean tellMe(int n ) { 
		if (n < 3 || n%3 != 0 && n  <7   )
			return false ; 
		else if ( n%3 == 0  || n %7 == 0 )
			return true ;
		else {
			int m = 0  ; 
			for (int sev = 1 ; sev*7 < n  ; sev ++ ) {
				m = sev * 7 ; 
				while (m<n){ 
					m +=3 ; 
					if (m == n ) 
						return true ; 
				}
			}
			return false ; 
		}
		
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		PrintWriter oo = new PrintWriter(System.out) ; 
		
		int n = ss.nextInt() ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			if (tellMe(ss.nextInt())){
				oo.println("YES");
				oo.flush();} 
			else{
				oo.println("NO");
				oo.flush();
			}
		}
	}

}
