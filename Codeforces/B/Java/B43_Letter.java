package Codeforces;
import java.util.Scanner ; 
public class B43_Letter {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		String a = ss.nextLine() ; 
		String b = ss.nextLine() ; 
		boolean v =true ; 
		for (int i = 0 ; i < b.length() ;i ++ ){
			if (b.charAt(i) == ' ' ){
			}
			else if (a.indexOf(b.charAt(i)) != -1 )
				a = a.substring(0, a.indexOf(b.charAt(i))) +"*"+a.substring(a.indexOf(b.charAt(i))+1) ; 
			else {
				
				v= false  ; 
				break ; 
			}
			
		}
			if (v){
				System.out.println("YES");
			}
			else 
				System.out.println("NO");
	
	
	
	
	}

}
