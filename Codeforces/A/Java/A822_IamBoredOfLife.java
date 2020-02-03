package Codeforces;
import java.util.Scanner ; 
public class A822_IamBoredOfLife {
	public static long fac(long a ) { 
		long h = 1 ; 
		while (a>1){
			h =h *a ; 
			a-=1 ; 
					
		}
		return h ;
	}
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		long a = ss.nextLong() ; 
		long b = ss.nextLong() ; 
		
		if (a>b)
			System.out.println(fac(b));
		else 
			System.out.println(fac(a));
	}

}
