package Codeforces;
import java.util.Scanner ;
import java.io.BufferedReader ;
import java.io.InputStreamReader; 
public class A807_is_it_Rated {
		
	
	
	public static void main(String[] args) {
		Scanner ss = new Scanner (new BufferedReader(new InputStreamReader (System.in))) ; 
		int [][] a  =new int [ss.nextInt()][2] ;
		boolean organized = true  ; 
		boolean rated = false ; 
		a[0][0] = ss.nextInt() ; 
		a[0][1] = ss.nextInt() ; 
		if (a[0][0] != a[0][1] ) {
			System.out.println("rated");
		}
		else { 
		for (int i = 1 ; i < a.length ; i ++ ) { 
			a[i][0] = ss.nextInt() ; 
			a[i][1] = ss.nextInt() ; 
			if (a[i][0] != a[i][1] ) { 
				System.out.println("rated");
				rated = true ; 
				break ; 
			}
			else {
				if ( organized && a[i][0]>a[i-1][0] ){
					organized = false  ; 
				}
				
			}
			
		} 
		if (!rated && organized) { 
			System.out.println("maybe");
		}
		else if (!rated && !organized) { 
			System.out.println("unrated");
		}
		
		} 
	}

}
