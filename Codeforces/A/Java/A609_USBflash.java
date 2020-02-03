package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A609_USBflash {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int t = ss.nextInt() ; 
		int [] a = new int [n] ; 
		for (int i = 0 ; i <n ; i ++  ) { 
			a[i] = ss.nextInt() ; 
		}
		Arrays.sort(a);
		int c = 0 ; 
		for (int i = n- 1 ; i>=0 ; i --  ) { 
			t-=a[i] ;
			c++ ; 
			if (t<=0) 
				break ; 
		}
		System.out.println(c);
	}

}
