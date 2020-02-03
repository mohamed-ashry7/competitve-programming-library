package Codeforces;

import java.util.Scanner;

public class A76_Bus_Game {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int x = ss.nextInt() ; 
		int y = ss.nextInt() ; 
		boolean ceil =false  ; 
		int total = x*100 +y*10 ; 
		int turn = 1 ; 
		while (total>=220 ) { 
			if (turn == 1 ) { 
				if (x>= 2 && y>=2 ) { 
					x-=2 ; 
					y-=2 ; 
				}
				else if (x<2) {
					y=y-((2-x)*10 + 2 )  ; 
					x =0 ; 
				}
				else if (y<2  ) { 
					ceil = false ; 
					break ; 
				}
				total = x*100 + y*10 ;
				ceil = true ;
				turn = 2 ; 
			}
			else { 
				if (y>=22) { 
					y-=22 ; 
				}
				else if (y>= 12 ) {
					y-=12 ; 
					x-=1 ; 
				}
				else  if ( y>= 2 ){ 
					x-=2 ; 
					y-= 2 ; 
				}
				else { 
					ceil = true ; 
					break ; 
				}
				ceil = false ; 
				total = x*100 + y* 10 ; 
				turn = 1 ; 
			}
		}
		if (ceil ){
			System.out.println("Ciel");
		}
		else {
			System.out.println("Hanako");
		}
	}

}
