package Codeforces;

import java.util.Scanner;

public class A719_Vitya_in_the_Countryside {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		boolean up,down  ; up = false ; down = false ;  
		int c = ss.nextInt() ;
		int b ; 
		for (int i = 1  ; i <n ; i ++ ) {
			b = ss.nextInt() ; 
			if (b == 0  && b!=c) { 
				up = true ; 
				down = false ; 
			}
			
			else if (b == 15 && b!=c) { 
				down = true ; 
				up = false ; 
			}
			else if (b>c) { 
				up = true ; 
				down = false ; 
			}
			else if (c>b) { 
				down  = true ; 
				up = false ; 
			}
			c = b ; 
			
			}
		if (n== 1  ){
			if (c== 15 ) { 
			down = true ; 
			up = false ;  }
			else if (c== 0 ) { 
				up = true ; 
				down = false ;
			}
			} 
		if (up)
			System.out.println("UP");
		else if (down ) { 
			System.out.println("DOWN");
		}
		else 
			System.out.println(-1);
	

}
} 