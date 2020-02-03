package Codeforces;

import java.util.Scanner;

public class A80_Panoramixs_Prediction {
	
	
	static boolean isPrime (int x) { 
		if (x==2 || x==3 || x==5 || x== 7 )return true ; 
		for (int i =2 ; i<=Math.sqrt(x)+1 ; ++i) { 
			if (x%i==0)
				return false ; 
		}
		return true ; 
	}
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int m = ss.nextInt() ; 
		for (int i = n+1;i<m ; ++i ) { 
			if (isPrime(i))
			{
				System.out.println("NO");
				return ; 
			}
		}
		if (isPrime(m)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
