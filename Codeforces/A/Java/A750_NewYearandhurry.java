package Codeforces;

import java.util.Scanner;

public class A750_NewYearandhurry {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int k = ss.nextInt() ; 
		int min = 4 *60 ; 
		int rem = min - k ;
		int j = 0 ; 
		for (int i = 1 ; rem >= i*5 && i<= n; i ++ ){ 
			j++ ; 
			rem =rem - i*5 ; 
		}
		System.out.println(j);
	}

}
