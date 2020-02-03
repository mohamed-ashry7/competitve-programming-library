package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A37_Towers {

	public static void main(String[] args) {
		Scanner ss =new Scanner(System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		int max = 0 ; 
		int c = 1 ;
		int v = 1 ;
		for (int i = 0 ; i <n ; i ++ ) 
			a[i]=ss.nextInt() ; 
		Arrays.sort(a);
		for (int i = 0 ; i <n-1 ; i ++ ) { 
			if (a[i] == a[i+1])
			{
				v++ ; 
			}
			else {
				if (v>max)
					max = v ; 
				c++ ; 
				v = 1 ; 
			}
			
		}
		if (v>max)
			max = v ; 
		System.out.println(max + " " + c);
	}

}
