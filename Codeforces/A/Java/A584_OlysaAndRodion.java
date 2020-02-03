package Codeforces;
import java.util.Scanner ; 
public class A584_OlysaAndRodion {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in )  ;
		int  n  = ss.nextInt() ; 
		int d = ss.nextInt() ; 
		String u = d+"" ; 
		char g = u.charAt(0) ; 
		String h = new String (new char [n]).replace('\0', g) ; 
		if (d == 10&& n!=1)
			System.out.println(h.substring(1)+"0");
		else if (d!=10)
			System.out.println(h);
		else 
			System.out.println(-1);
		
		
	}

}
