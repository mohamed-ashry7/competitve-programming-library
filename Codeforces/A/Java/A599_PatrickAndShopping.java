package Codeforces;
import java.util.Scanner  ; 
public class A599_PatrickAndShopping {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		long d1 = ss.nextLong() ; 
		long d2 = ss.nextLong() ; 
		long d3 = ss.nextLong() ; 
		long min =(long) 2*d1+2*d2 ; 
		long mul =(long) 2*d1+2*d3 ; 
		if (mul<min)
			min = mul ; 
		mul =(long) 2*d2 + 2*d3 ;
		if (mul<min)
			min = mul ; 
		mul =(long) d2 +d3 +d1 ; 
		if (mul<min)
			min = mul ; 
		System.out.println(min);
		}

}
