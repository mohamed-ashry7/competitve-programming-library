package Codeforces;
import java.io.* ; 
import java.util.Scanner ;  
public class A887_Div64 {
	public static boolean isDiv(String a) {
		long c  =0 ; 
		
		while (a.indexOf("1") != -1 ) { 
			c += (long)Math.pow(2, a.length()-1-a.lastIndexOf("1")) ;
			a = a.substring(0, a.lastIndexOf("1")) + "0"+a.substring(a.lastIndexOf("1") + 1 ) ; 
	
		}
	
		if (c%64 == 0 ){
			return true  ; 
			
		}
		return false ;
		
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (new BufferedReader(new InputStreamReader(System.in)))  ; 
		String a = ss.next() ;
		String wan = "" ; 
		while (true ) { 
			if (a.indexOf("1") == -1 ){
				wan= "no" ;
				break ; 
			}
			if (a.length()<=10 && a.length() >= 7){
				if (((long)Integer.parseInt(a) % 1000000  ==  0 ))
				{
					wan = "yes" ; 
					break ; 
				}

					
			} 
			if (a.lastIndexOf("1") == -1 || a.length() < 7 ) { 
				wan = "no" ; 
				break ; 
			}
			else {
				if (isDiv(a)){
					wan = "yes" ; 
					break ; 
					}  
				
			}
			a = a.substring(0, a.lastIndexOf("1")) + a.substring(a.lastIndexOf("1") + 1 ) ; 
 		}
		System.out.println(wan);
	}

}
