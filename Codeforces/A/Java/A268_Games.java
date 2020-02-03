package Codeforces;

import java.util.Scanner;

public class A268_Games {	
	
	
	
	
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] [] a = new int [n][2] ;
		for (int i = 0 ; i < n ; i ++ ) { 
			a[i][0] = ss.nextInt() ; 
			a[i][1] = ss.nextInt() ; 
		}
		int c = 0 ; 
		for (int i = 0 ; i <n ; i ++ ) { 
			for (int j = 0 ;j < n ; j ++ ) { 
				if (i != j ) { 
					if (a[i][0] == a[j][1])
						c++ ; 
				}
			}
		}
		System.out.println(c);
	}

}
