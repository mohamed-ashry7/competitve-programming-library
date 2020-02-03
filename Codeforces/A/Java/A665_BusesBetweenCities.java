package Codeforces;

import java.util.Scanner;
public class A665_BusesBetweenCities {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int a = ss.nextInt(); 
		int ta = ss.nextInt() ; 
		int b = ss.nextInt() ; 
		int tb = ss.nextInt() ; 
		String s = ss.next() ; 
		int lower = Integer.parseInt(s.substring(0,2)) * 60 + Integer.parseInt(s.substring(3))  ; 
		int high = lower + ta  ;
		int buses = 0 ; 
		int i = 0 ; 
		int t = 300 ; 
		for ( ; t <high &&t<24*60 ;) { 
			 if (!(t+tb <= lower ||t>= high ))
				 buses ++ ; 
			 i++ ; 
			 t = 300+i*b  ; 

			 
			 
		}
		System.out.println(buses );
		
		
	}

}
