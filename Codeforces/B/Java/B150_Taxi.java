package Codeforces;
import java.util.Scanner;
public class B150_Taxi {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ;
		int n = ss.nextInt() ; 
		int a = 0 ; 
		int taxi  = 0 ; 
		int one = 0 ; 
		int two = 0 ; 
		int three = 0 ; 
		int four = 0 ; 
		for (int i = 0 ; i <n ; i ++ ){
			a = ss.nextInt() ; 
			switch(a){
			case 1 : one ++ ; break ; 
			case 2 : two ++ ; break ; 
			case 3 : three++ ; break ; 
			case 4 : four ++ ; break  ; 
		}
		}
		taxi+=four ; 
		boolean remone = false ; 
		if (three>=one){
			taxi+=three ; 
			taxi+=two/2 ; 
			taxi+=two%2  ;
		}
		else {
			remone = true ; 
		}
		if (remone == true ) {
			if (three != 0 ){
			taxi+=three ; 
			one  = one-three   ;
			two+=one/2 ; 
			one = one %2 ; 
			taxi+=two/2 +two%2 + one ; 
			if (one == 1 && two%2 == 1 ) 
				taxi-- ; 
		}
			else {
				two+=one/2 ; 
				one = one %2 ;
			
				taxi+=two/2 + two%2 + one ;
				two =two%2  ;
				if (one == 1 && two == 1 ) 
					taxi-- ; 
			}
			}
		
		System.out.println(taxi);

		}
	}


