package Codeforces;

import java.util.Scanner;

public class A459_PashmackAndGarden {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int x1 = ss.nextInt() ; 
		int y1 = ss.nextInt() ; 
		int x2 = ss.nextInt() ; 
		int y2 = ss.nextInt() ; 
		int diff , diff1; 
		if (x1 == x2 ) { 
			diff = (int )(Math.abs(y1-y2)) ; 
			x1 +=diff ; 
			x2 +=diff  ;
			System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 );
		}
		else if ( y1 == y2 ) { 
			diff = (int )(Math.abs(x1-x2)) ; 
			y1 +=diff ; 
			y2 +=diff  ;
			System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 );
		}
		else {
			diff = (int )(Math.abs(y1-y2)) ; 
			diff1 = (int )(Math.abs(x1-x2)) ; 
			if (diff !=diff1) { 
				System.out.println(-1);
			}
			else { 
				System.out.println(x1 + " "+ y2 + " " + x2 + " "+ y1);
			}
		}
	}

}
