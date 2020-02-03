package Codeforces;

import java.util.Scanner;

public class A71_Way_Too_Long_Words {
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in); 
		int n = ss.nextInt() ; 
		String s ; 
		String st ; 
		for (int i = 1 ; i <=n ; i++){
			s = ss.next() ;
			if(s.length()>10){
				st=s.charAt(0)+""+(s.length()-2) +s.charAt(s.length()-1);
			}
			else
				st = s ; 
			System.out.println(st);
		}
	}
}
