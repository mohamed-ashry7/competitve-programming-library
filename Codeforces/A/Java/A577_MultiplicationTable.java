package Codeforces;
import java.util.Scanner ; 
public class A577_MultiplicationTable {

	public static void main(String[] args) {
		Scanner ss  = new Scanner (System.in)  ;
		int n = ss.nextInt() ; 
		int x = ss.nextInt() ; 
		int c = 0 ; 
		for (int  i = 1 ; i <=n ; i ++ )  {
			if (x%i == 0 ){
			for (int  j = 1 ; j <=n ; j ++ ){
				if (i*j == x )
					c++  ; 
				else if (i*j>x)
					break ; 
			}
		}
			}
		System.out.println(c);
		
		
		
		
	}

}
