package Codeforces;
import java.util.* ; 
public class A282_BitPlusPlus {
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		int n  = ss.nextInt() ; 
		int x = 0  ;
		String op  = ""  ;
		for (int i =1  ; i<= n  ; i ++ ){
			op = ss.next()  ; 
			if (op.charAt(0) == '+' || op.charAt(2) == '+')
				x++ ; 
			else 
				x-- ; 
		}
		System.out.println(x);
	}

}
