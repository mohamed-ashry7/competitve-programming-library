package Codeforces;
import java.util.Scanner  ; 
import java.math.* ; ; 
public class A791_BearAndbigBrother {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		double wl = ss.nextInt() ; 
		double wb = ss.nextInt() ;
		double c= (double )(wb/wl) ; 
		int n = (int)(Math.ceil((double)(double)Math.log(c) /(double) Math.log(1.5))) ;
		if (((double)Math.log(c) /(double) Math.log(1.5)) - (int )(((double)Math.log(c) /(double) Math.log(1.5))) == 0)
			n++ ; 
		System.out.println(n);
	}

}
