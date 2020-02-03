package Codeforces;

import java.util.Scanner;

public class A298_Snow_Footprints {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in);
		int n = ss.nextInt() ; 
		String feet = ss.next() ; 
		int right = feet.indexOf('R') ; 
		int left = feet.indexOf('L') ; 
		if (right>= 0 && left >= 0) { 
			System.out.printf("%d %d" , right+1,left );
		}
		else {
			if (left ==-1) {
				int start = feet.indexOf('R')+1 ; 
				int end = feet.lastIndexOf('R') + 2 ;
				System.out.println(start + " " + end );
			}
			else { 
				int start = feet.lastIndexOf('L') + 1 ; 
				int end = feet.indexOf('L') ; 
				System.out.println(start + " " + end );
			}
		}
	}

}
