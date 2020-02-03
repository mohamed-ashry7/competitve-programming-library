package Codeforces;
import java.util.Scanner ; 
public class A26_almostPrime {
	public static boolean isprime(int n ){
		for (int i = 2 ; i <= (int)(Math.pow(n, .5)) ; i ++ ){
			if (n%i==0)
				return false ; 
		}
		return true ; 
	}
	public static int num(int pp){
		int c = 0 ; 
		int k = 0 ; 
		for (int i = 4 ; i<=pp ; i ++ ){
			for (int j = 2 ; j < i ; j ++ ){
				if (i%j == 0  && isprime(j))
					k++ ; 
				if (k>2)
					break ; 
				
			}
			if (k==2 )
				c++ ; 
			k= 0 ; 
		}
		return c ; 
	}
	public static void main(String [] a ){
		Scanner ss = new Scanner  (System.in) ; 
		int n = ss.nextInt() ; 
		System.out.println(num(n));
	}
	
	
}
