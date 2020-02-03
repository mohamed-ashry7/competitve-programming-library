package Codeforces;

import java.util.Scanner;

public class A265_Colorful_Stones {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		String stones = ss.nextLine() ; 
		String ins = ss.next() ; 
		int c = 0 ; 
		for (int i = 0 ; i < ins.length() ; ++i ) { 
			if (ins.charAt(i) == stones.charAt(c)) {
				c++ ; 
			}
		}
		System.out.println(c+1);
	}

}
