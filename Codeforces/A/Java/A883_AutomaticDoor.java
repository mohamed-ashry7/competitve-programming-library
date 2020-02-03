package Codeforces;

import java.util.Arrays;
import java.util.Scanner;
public class A883_AutomaticDoor {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		long n = ss.nextLong() ; 
		long m = ss.nextLong() ;  
		long a = ss.nextLong() ; 
		long d = ss.nextLong() ;
		int times = 1 ;
		int i = 1  ; 
		long interval ;
		long an = a*i ; 
		long t = ss.nextLong() ;
		if (an<t){
			interval = an +d  ; 
		}
		else {
			interval = t+d ; 
		}
		int em = 1 ; 
		int cl = 1 ; 
		while (true ) { 
			if (em>n) { 
				if (cl<=m) { 
					cl++ ; 
					t = ss.nextLong() ;
					if (t >  interval )
					{
						times ++ ; 
						interval = t+ d ; 
					}
				}
				else {
					break ; 
				}
			}
			else if (cl > m) { 
				if (em <= n) { 
					em ++ ;
					an = a * em ; 
					if (an > interval ) { 
						times ++ ; 
						interval = an + d ; 
					}
				}
				else {
					break ; 
				}
				
			}
			else {
				if (em == n ) 
					em ++ ; 
				 if (cl == m )
					cl ++ ; 
				 if (an > interval && t> interval) { 
					times ++ ; 
					
					if (an<t){
						interval = an +d  ; 
					
					}
					else {
						interval = t+d ;
					
					}
				}
				 
				 else if (an <= interval && t<= interval ) { 
					 em++ ; 
					 an = em* a ; 
					 cl ++ ; 
					t = ss.nextLong() ; 
				 }
				else if (an<= interval) { 
					em ++ ; 
					an = em*a ; 
				}
				else if (t<= interval ) { 
					cl ++ ; 
					t = ss.nextLong() ; 
				}
			}
		}
		
		System.out.println(times);
		
	}

}
