package Codeforces;
import java.util.Scanner  ; 
public class A61_shapurr {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		String x = ss.next() ; 
		String y = ss.next() ; 
		String wan = ""  ; 
		for (int i = 0 ; i <x.length() ; i ++ ){
			if (x.charAt(i) != y.charAt(i))
				wan+="1" ; 
			else 
				wan +="0" ; 
			
		}
	System.out.println(wan );
	}

}
