package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A296_Yaroslav_and_Permutations {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		for (int i = 0 ; i < n ; ++ i ) { 
			a[i] = ss.nextInt() ; 
		}
		Arrays.sort(a);
		int max = 0 ; 
		int count = 1 ; 
		for (int i = 0 ; i < n-1 ; ++ i ) { 
			if (a[i]==a[i+1]) {
				count ++ ; 
			}
			else {
				max = Math.max(max, count) ; 
				count = 1 ; 
			}
		}
		max = Math.max(max, count) ; 
		if (n%2==0) {
			System.out.println(max>n/2?"NO":"YES");
		}
		else { 
			System.out.println(max>n/2+1?"NO":"YES");
		}
	}
	

}
