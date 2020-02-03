package Codeforces;
import java.util.Scanner  ; 
public class A812_SagheerAndCross {
	
	
	
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int [][] a = new int [4][4] ; 
		for (int i = 0 ; i <a.length ; i ++ )  {
			for (int j = 0 ; j  <a.length ; j++ ) { 
				a[i][j] = ss.nextInt() ; 
			}
		}
		int check1  ;
		int check2 ; 
		int check3 ;
		boolean ch  = false ; 
		for (int i = 1 ; i <= 4 ; i ++ ) {
			check1 = (i+1)%4 ; 
			if (check1 == 0 )
				check1 = 4 ; 
			check2 = (i+2)%4 ; 
			if (check2 == 0 )
				check2 = 4 ;
			check3 = (i+3)%4 ; 
			if (check3 == 0 )
				check3 = 4 ;
			
			
			if (a[i-1][3] == 1 ){
				if (a[i-1][0] == 1 || a[i-1][1] == 1 || a[i-1][2] == 1 || a[check1-1][0] == 1 ||a[check2-1][1] == 1 || a[check3-1][2] == 1 ){
					System.out.println("YES");
					ch  = true ; 
					break ; 
				}
			}

		}
		if (!ch){
			System.out.println("NO");
		}
		
			
	}

}
