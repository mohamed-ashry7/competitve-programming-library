package Codeforces;

import java.util.Scanner;

public class A893_ChessForThree {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		boolean flag = true ; 
		a[0] = ss.nextInt() ; 
		boolean alex,bob,carl ; 
		if (a[0] == 1 ) {
			alex = true ;
			bob = false ; } 
		else { 
			bob = true   ;
			alex = false ; 
			} 
		carl = true ; 
		if ( a[0] == 3 )
		{
			flag =false ; 
		}else { 
		for (int i = 1 ; i <n ; i ++ ) { 
			a[i] = ss.nextInt() ; 
			if (a[i] == 1 ){
					if (!alex ) { 
						flag = false ; 
						break ; 
					}
					if (carl ) { 
						carl = false ;
						bob = true ; 
					}
					else if (bob){
						carl = true ; 
						bob = false ; 
					}
					else { 
						flag= false ;
						break ; 
					}
					
					alex = true ; 
					
				}
				else if (a[i] ==  2 ) { 
					if (!bob ) { 
						flag = false ; 
						break ; 
					}
					if (carl ) { 
						carl = false ;
						alex = true ; 
					}
					else if (alex){
						carl = true ; 
						alex = false ; 
					}
					else { 
						flag= false ;
						break ; 
					}
					
					bob = true ; 
				}
				else {
					if (!carl ) { 
						flag = false ; 
						break ; 
					}
					if (alex ) { 
						alex = false ;
						bob = true ; 
					}
					else if (bob){
						alex = true ; 
						bob = false ; 
					}
					else { 
						flag= false ;
						break ; 
					}
					
					carl = true ; 
			}
		} }
			if (flag) { 
				System.out.println("YES");
			}
			else { 
				System.out.println("NO");
			}
	
		
}
}