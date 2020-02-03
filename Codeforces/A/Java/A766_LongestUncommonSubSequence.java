package Codeforces;

import java.util.Scanner;

public class A766_LongestUncommonSubSequence {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		String a = ss.nextLine();
		String b = ss.nextLine() ; 
		if (a.equals(b))
			System.out.println(-1);
		else { 
			System.out.println(Math.max(a.length(),b.length()));
		}
		
		
	}

}
