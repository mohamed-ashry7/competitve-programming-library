package Codeforces;
import java.util.Scanner ; 
public class A677_VanyaAndTheFence {

	
	
	
		public static void main (String [] aa ) { 
			Scanner ss =  new Scanner (System.in) ; 
			int n = ss.nextInt() ; 
			int h = ss.nextInt() ; 
			int width = 0 ; 
			int c = 0 ; 
			for (int i = 0 ; i < n ; i ++ ){
				c = ss.nextInt() ; 
				if (c<= h )
					width ++ ; 
				else {
					width += 2 ; 
				}
				
			}
			System.out.println(width);
		}
}
