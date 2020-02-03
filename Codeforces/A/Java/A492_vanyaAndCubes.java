package Codeforces;
import java.util.Scanner  ; 
public class A492_vanyaAndCubes {
		
	public static int cubes (int n ) { 
		if (n == 1 )
			return 1 ; 
	   return (int)(((double)n/2) * (1+n));
	}
	
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int  n = ss.nextInt() ; 
		int k = 0 ; 
		int summ = 0 ; 
		for ( int i = 1 ; summ < n ; i ++ ){
			summ+=cubes(i) ; 
			k++ ;
			if (summ > n)
			{
				k--;
			}
	
		}
		System.out.println(k);
	}

}
