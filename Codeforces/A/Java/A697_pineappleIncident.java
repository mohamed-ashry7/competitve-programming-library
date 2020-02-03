package Codeforces;
import java.util.Scanner ; 
public class A697_pineappleIncident {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		long t =ss.nextLong() ; 
		long s =ss.nextLong() ; 
		long x =ss.nextLong() ; 
		if (t>x)
			System.out.println("NO");
		else if (x== t)
			System.out.println("YES");
		else {
		long ratio =(x-t)%s ; 
		long ratio1 = (x-t-1)%s ; 
		if ((ratio == 0  || ratio1 == 0 )  && x-t-1 !=0){
			System.out.println("YES");
			
		}
		else 
			System.out.println("NO"); } 
	}

}
