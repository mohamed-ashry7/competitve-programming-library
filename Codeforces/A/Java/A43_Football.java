package Codeforces;

import java.util.Scanner;

public class A43_Football {

	public static void main(String[] args) {
		
		
		
		Scanner ss =new Scanner (System.in); 
		int n = ss.nextInt()  ; 
		int a1 = 0 ; int a2 = 0 ; String s1="" ; String s2 = "" ; 
		for(int i = 0 ; i <n ; ++i ) { 
			String t = ss.next() ; 
			if (s1.length()==0) {
				s1 = t ; 
				a1++ ; 
			}
			else if (s1.equals(t)) { 
				a1++ ; 
			} 
			else  {
				s2 = t ;a2++ ; 
			}
		}
		System.out.println(a1>a2?s1:s2);
	}

}
