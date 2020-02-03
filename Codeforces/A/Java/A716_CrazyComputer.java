package Codeforces;
import java.util.Scanner ; 
public class A716_CrazyComputer {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in)  ; 
		int n = ss.nextInt() ; 
		int c = ss.nextInt() ; 
		int w = 0 ; 
		long f = ss.nextLong() ; 
		
		long tan = 0 ; 
		for (int i = 1 ; i < n ; i ++ ) {  
			tan = ss.nextLong() ; 
			if (tan-f <= c )
				w ++ ; 
			else 
				w= 0  ; 
			f =(long) tan ; 
		}
		System.out.println(w+1);
	}

}
