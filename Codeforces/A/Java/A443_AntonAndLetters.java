package Codeforces;
import java.util.Scanner; 
public class A443_AntonAndLetters {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		String a = ss.nextLine() ; 
		String b = "" ; 
		for (int i = 1 ; i < a.length() ; i +=3 ) { 
			if (a.charAt(i)>='a' && a.charAt(i)<='z'){
				if(  b.indexOf(a.charAt(i))==-1)
				b+=a.charAt(i) ; 
			}
		}
		System.out.println(b.length());
	}

}
