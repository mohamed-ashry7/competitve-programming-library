package Codeforces;
import java.util.Scanner ; 
public class B339_XeniaAndRingRoad {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int m = ss.nextInt() ; 
		int [] a = new int [m] ;
		a[0] = ss.nextInt() ;
		long w =(long) a[0] - 1  ; 
	
		for (int i = 1 ; i <m; i ++ ) { 
			a[i] = ss.nextInt() ; 
			if (a[i] >= a[i-1]){
				w+=(long)a[i]-a[i-1]  ; 
			}
			else if (a[i] < a[i-1]){
				w+=(long)n-a[i-1]+a[i] ; 
			}
		}
		System.out.println(w);
	}

}
