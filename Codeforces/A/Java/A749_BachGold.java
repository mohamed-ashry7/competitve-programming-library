package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class A749_BachGold {
	
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		PrintWriter oo = new PrintWriter(System.out) ; 
		int n = ss.nextInt() ; 
		String wan = "" ; 
		int c =  2 ;  
		int o = 0 ; 
		
			int k = n/ c ; 
			if (n%2 == 1 ) { 
				k--; 
			}
			System.out.println((n/2));
			for (int i = 0 ; i  < k ; i ++ ) { 
				oo.print(2+" "); 
			}
		if (n%2 == 1 ) { 
			oo.print(3);
		}
		oo.flush();
	}

}
