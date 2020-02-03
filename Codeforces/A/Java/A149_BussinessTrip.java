package Codeforces;
import java.util.Arrays;
import java.util.Scanner ; 
import java.util.Random ; 
public class A149_BussinessTrip {
	
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in ) ; 
		int k = ss.nextInt() ; 
		int [] a = new int [12] ; 
		int  summ = 0 ;
		int mon = 0 ; 
		for (int i = 0 ; i <a.length ; i ++ ) 
			a[i] = ss.nextInt()  ;
		Arrays.sort(a);
		if (k != 0 ) { 
			for (int i = a.length- 1 ; i >= 0 ; i -- ) { 
				summ += a[i] ; 
				mon ++ ; 
				if (summ >= k ) {
					break ; 
				}
			}
		}
		if (summ >=k ) 
			System.out.println(mon );
		else 
			System.out.println(-1);
			
		
	}

}
