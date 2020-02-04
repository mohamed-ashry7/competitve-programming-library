package notAdded;

import java.util.Scanner;

public class B47_Coins {
	static boolean contains(int [] a , int num  ) { 
		for (int i = 0 ; i <a.length;++i) {
			if (a[i]==num)return true ; 
		}
		return false ;
	}
	static char get(int [] a , int num ) { 
		for (int i = 0 ; i < a.length ; ++i ) { 
			if (a[i]==num)return (char)(i+'A'); 
		}
		return '0' ; 
		 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int [] weights = new int [3] ; 
		for (int i = 0 ; i < 3 ; ++i ) { 
			String scale = ss.nextLine() ; 
			if (scale.charAt(1)=='>') {
				weights[scale.charAt(0)-'A']++;
			}
			else {
				weights[scale.charAt(2)-'A']++;
			}
		}
		if (contains(weights, 0) && contains(weights, 1) && contains(weights, 2)) {
			System.out.println(get(weights, 0)+""+get(weights, 1) + "" +get(weights, 2) );
		}
		else {
			System.out.println("Impossible");
		}
		
	}

}
