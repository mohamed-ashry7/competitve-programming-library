package Codeforces;

import java.util.Scanner;

public class A675_infiniteSeq {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int a = ss.nextInt() ; 
		int b = ss.nextInt() ; 
		int c = ss.nextInt() ; 
		int v = 1 ; 
		if (c == 0 && a == b  )
			v = 0 ; 
		else if (c!= 0 ){
		 v = (b-a)%c  ;
		 if ((b-a)/c < 0 )
			 v = 1 ; 
		} 
		
		if (v == 0 ) 
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

}
