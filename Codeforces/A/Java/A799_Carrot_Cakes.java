package Codeforces;

import java.util.Scanner;

public class A799_Carrot_Cakes {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("all")
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int t = ss.nextInt() ; 
		int k = ss.nextInt() ; 
		int d = ss.nextInt() ; 
		String res = "YES" ; 
		if (t>d) {
			if (k>=n) {
				res="NO" ; 
			}
		}
		else if (t==d) {
			if (n-k<=k) {
				res ="NO" ; 
			}
		}
		else {
			if (d%t ==0) { 
				int times =d/t ; 
				int madeCakes  = times * k ; 
				if (n-madeCakes<=k) {
					res="NO" ; 
				}
			}
			else { 
				int times =(int) Math.ceil(d/(double)t) ; 
				int madeCakes  = times * k ; 
				if (madeCakes>=n) {
					res="NO" ; 
				}
			}
		}
		System.out.println(res);
		
		
	}

}
