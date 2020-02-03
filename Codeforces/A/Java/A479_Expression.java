package Codeforces;
import java.util.Scanner  ; 
public class A479_Expression {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		int a = ss.nextInt() ; 
		int b = ss.nextInt() ; 
		int c = ss.nextInt() ; 
		int max = 0 ; 
		int res = 0 ; 
		res = a+b+c ; 
		if (res > max )
			max = res ; 
		res = (a*b)+c ; 
		if (res > max )
			max = res ;
		res = a*(b+c) ; 
		if (res > max )
			max = res ;
		res= a*b*c ; 
		if (res > max )
			max = res ;
		res = (a+b)*c ; 
		if (res > max )
			max = res ;
		res= a+(b*c) ; 
		if (res > max )
			max = res ;
		System.out.println(max);
	}

}
