package Codeforces;
import java.util.Scanner  ; 
public class A230_Dragons {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		int s = ss.nextInt() ; 
		int n = ss.nextInt()  ; 
		int x = 0  ; 
		int y = 0 ; 
		int [][] b = new int [n][2] ; 
		int k = n-1; 
		int h = 0 ;
		int g = s ; 
		for (int i = 0 ; i <n; i ++){
			x=ss.nextInt() ; 
			y= ss.nextInt() ; 
			if (x>=g){
				b[k][0] =x ; 
				b[k][1] = y ; 
				k-- ; 

			}
			else if (x<g)
			{
				b[h][0] =x ; 
				b[h][1] = y ; 
				h++ ; 	


			}
		}	
		boolean f = true ; 
		int [] a = new int [2] ; 
		for (int i =0 ; i <n ; i ++ ){
			for (int j = i+1 ; j < n ;j ++ ){
				if (b[i][0]>b[j][0]){
					a[0] = b[i][0] ;
					a[1] = b[i][1] ; 
					b[i][0]=b[j][0] ; 
					b[i][1] = b[j][1] ;
					b[j][0] = a[0] ; 
					b[j][1] = a[1] ; 
				}
			}
			if (b[i][0]<s){
				s = s+ b[i][1] ; 
			}
			else {
				f = false ; 
				break ; 
			}
		}
		
		if (f)
			System.out.println("YES");
		else 
			System.out.println("NO");
		
	}

}
