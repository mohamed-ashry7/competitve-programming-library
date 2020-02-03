package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class B618_GuessThePermutation {
	
	public static int getTheNum (int [] a ) { 
		int n = a.length ; 
		for (int i = 1 ; i < n-1 ;  i ++ )  {
			if (a[i]==a[i+1])
				return i ; 
		}
		return n ; 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] [] a=  new int [n][n] ;
		for (int i = 0 ; i < n ; i ++ ) { 
			for (int j = 0 ; j < n ; j ++ ) { 
				a[i][j] = ss.nextInt() ; 
			}
			Arrays.sort(a[i]);
		}
		boolean nn = false ; 
		String wan = "" ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			int num = getTheNum(a[i]) ; 
			if (num == n && !nn) { 
				wan +=num +" " ; 
				nn= true ; 
			}
			else if (num == n && nn) { 
				num-- ; 
				wan+= num +" " ; 
			}
			else {
				wan +=num+" " ; 
			}
		}
		System.out.println(wan );
	}

}
