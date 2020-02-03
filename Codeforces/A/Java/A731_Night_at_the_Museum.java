package Codeforces;

import java.util.Scanner;

public class A731_Night_at_the_Museum {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		char cur = 'a' ; 
		String word = ss.next() ;
		int rot = 0 ; 
		for (int i= 0 ; i < word.length() ; ++i ) { 
			char det = word.charAt(i) ; 
			int min1 = Math.abs(det-cur) ; 
			int min2 = 0; 
			if (cur<det) { 
				min2 = cur-'a' + 'z'-det +1 ; 
			}
			else {
				min2 = det-'a' + 'z'-cur +1 ; 
			}
			cur = det ; 
			rot += Math.min(min1, min2) ; 
			
		}
		System.out.println(rot);
	
	}

}
