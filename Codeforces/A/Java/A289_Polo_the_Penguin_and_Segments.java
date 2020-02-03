package Codeforces;

import java.util.Scanner;

public class A289_Polo_the_Penguin_and_Segments {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in ) ; 
		int n = ss.nextInt() ; 
		int k = ss.nextInt() ; 
		int x = 0 ; 
		for (int i = 0 ; i < n ; ++ i ) { 
			int f = ss.nextInt() ; 
			int s = ss.nextInt(); 
			x += (s-f+1) ; 
		}
		if (x%k==0) {
			System.out.println(0);
		}
		else { 
			System.out.println(k-x%k);
		}
	}

}
