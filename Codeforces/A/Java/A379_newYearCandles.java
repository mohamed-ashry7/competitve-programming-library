package Codeforces;
import java.util.Scanner ; 
public class A379_newYearCandles {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in)  ;
		int a = ss.nextInt() ; 
		int b = ss.nextInt() ; 
		int hours = 0 ; 
		int burnt = 0 ; 
		while (a>0){
			hours+=a ; 
			burnt += a ; 
			a  = burnt/b ; 
			burnt%=b ; 
		}
		System.out.println(hours);
	}

}
