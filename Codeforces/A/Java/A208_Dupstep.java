package Codeforces;
import java.util.Scanner ; 
public class A208_Dupstep {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		String a = ss.next() ; 
		String wub = "WUB" ; 
		String v = "" ; 
		boolean fir = true ; 
		int i = a.indexOf(wub) ; 
		boolean aman  = false ; 
		String check = "" ; 
		while (a.length() > 0 ) {
			if (i == - 1 )
			{
				if (fir == true ){
					v+=a ; fir = false ; }
				else 
					v = v + " " + a ; 
				break ; 
			}
			else {
				
					if (a.substring(0,3).equals(wub))
						aman = false ; 
					else 
						aman = true ; 
				if (aman )
				if (fir ){
					v+= a.substring(0, i) ; 
					fir = false ; }
					
				
				else 
					v = v+ " " + a.substring(0,i) ; 
				a = a.substring(i+3) ; 
			}
			i = a.indexOf(wub) ; 
		}
		System.out.println(v);
	}

}
