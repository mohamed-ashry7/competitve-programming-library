package Codeforces;
import java.util.Scanner ; 
public class B893_BeautifulDivisors {
	public static boolean isIt (int b ) { 
		return  (b == (int ) ((Math.pow(2, b) - 1 ) * Math.pow(2, b-1))) ; 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n =  ss.nextInt() ; 
		boolean f = true ; 
		for (int i = 1 ; i <=n ; i ++) { 
			System.out.println(n/i);
			if (n%i == 0 ) { 
				if (isIt(n/i)){
					System.out.println(n/i);
					f = false ; 
			} 
				
			} 
		}
	
	}

}
