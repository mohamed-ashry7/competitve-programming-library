package notAdded;

import java.util.Scanner;

public class B463_Caisa_and_Pylons {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int dollars = 0 ; 
		int energy = 0 ; 
		int cur = 0 ; 
		for (int i = 0 ; i <n ;++i) { 
			int next =ss.nextInt() ; 
			if (next>cur) { 
				int diff = next-cur ; 
				if (diff >energy ) { 
					dollars += diff-energy ; 
					energy = 0 ; 
				}
				else {
					energy -=diff ; 
				}
			}
			else { 
				energy += (cur-next) ;
			}
			cur = next ; 
		}
		System.out.println(dollars );
	}

}
