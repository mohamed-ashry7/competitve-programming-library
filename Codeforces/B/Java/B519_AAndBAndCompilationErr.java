package Codeforces;
import java.util.Arrays;
import java.util.Scanner ; 
public class B519_AAndBAndCompilationErr {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ;
		int [] b = new int [n-1] ; 
		int [] c= new int [n-2] ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			a[i] = ss.nextInt() ;
		}
		for (int i = 0 ; i < n-1 ; i ++ ){ 
			b[i] = ss.nextInt() ; 
			
		}
		for (int i = 0 ; i <n-2 ; i ++ ) { 
			c[i] = ss.nextInt() ; 
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		int d = 0 ; 
		int f = 0  ; 
		for (int i = 0  ; i < n-1 ; i ++ ){
			if (a[i] == b[d] ){
				d++ ; 
			}
			else {
				System.out.println(a[i]);
				f= 1 ; 
				break ; 
		}
		}if (f== 0 )
			System.out.println(a[n-1]);
		f=0 ; 
		d= 0 ; 
		for (int i = 0  ; i < n-2 ; i ++ ){
			if (b[i] == c[d] ){
				d++ ; 
			}
			else {
				System.out.println(b[i]);
				f= 1 ; 
				break ; 
		}
		}
		if (f== 0 )
			System.out.println(b[n-2]);
	
	}

}
