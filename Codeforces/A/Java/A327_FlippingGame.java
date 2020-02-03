package Codeforces;
import java.util.Scanner  ; 
public class A327_FlippingGame {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		int n = ss.nextInt() ; 
		int [] a =new int [n]  ; 
		int c = 0 ; 
		int max = -1 ;
		boolean fi = false   ;
		int d=  0 ; 
		boolean foo = false ; 
		for (int i = 0 ; i <n ; i ++   ){
			if (!foo)
				a[i] = ss.nextInt() ;
			else 
				foo = false  ; 
			if (a[i] == 0 && !fi){ 
				c++ ; 
				fi = true ;
				d= 1 ; 
				for (int j = i-1 ; j>=0; j -- ) { 
					if (a[j] == 1 )
						c++ ; 
					else 
						break ; 
				}
			}
			else if (a[i] == 0 && fi  ) {
				c++ ; 
				
			}
			else if (a[i] == 1 ) { 
				c++ ; 
				i++  ; 
				fi = false ; 
				for ( ; i < n ; i ++ ) { 
					a[i] = ss.nextInt() ;
					if (a[i] == 1 )
						c++ ; 
					else {
						i-- ; 
						foo = true ; 
						break ; 
						
					}
				}
				if (max<c)
					max = c ;
				c= 0 ; 
			}
			
		}
		
		if (max<c)
			max = c ;
		if (d==1)
		System.out.println(max);
		else 
			System.out.println(0);
	
	}

}
