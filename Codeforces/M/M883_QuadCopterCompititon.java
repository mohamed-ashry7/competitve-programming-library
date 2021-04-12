package Codeforces;
import java.util.Scanner ;
public class M883_QuadCopterCompititon {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in)  ; 
		int x1 ,x2,y1,y2 ; 
		x1 = ss.nextInt() ; 
		y1 = ss.nextInt() ; 
		x2 = ss.nextInt() ; 
		y2 = ss.nextInt() ; 
		
		int cir =2* ((int )(Math.abs(x1-x2) + (int ) Math.abs((y1-y2)) + 2 ))  ; 
		if (x1== x2 || y1 == y2 ) {
			cir+=2 ; 
			
		}
		System.out.println(cir );
	}

}
