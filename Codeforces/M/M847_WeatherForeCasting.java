package Codeforces;
import java.util.Scanner ; 
public class M847_WeatherForeCasting {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int [] a = new int [ss.nextInt()] ; 
		a[0] = ss.nextInt() ; 
		int c = 0 ; 
		boolean x = true ; 
		for (int i = 1 ; i <a.length ; i ++  ) { 
			a[i] = ss.nextInt() ;
			if (i == 1 ) {
				c = a[i] - a[i-1] ; 
			}
			else if (a[i] - a[i-1] != c ){ 
				x = false ; 
			}
			
		}
		if (x) { 
			System.out.println(a[a.length-1] +c );
			
		}
		else 
			System.out.println(a[a.length-1]);
	}

}
