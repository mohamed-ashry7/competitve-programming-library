package Codeforces;
import java.util.Scanner ; 
public class A476_DreamoonAndStairs {
	public static int Number_of_Moves(int n ,int m ) { 
		if (m>n)
			return -1 ; 
		else if (m==n)
			return m ; 
		else {
			int b= n/2 ; 
			int x = 0 ; 
			for(;b>=0 ; b--){
				if((n-b)%m == 0 )
					return (n-b); 
				
			}
			return -1 ; 
		}
	}
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int m = ss.nextInt() ; 
		System.out.println(Number_of_Moves(n,m));
	}

}
