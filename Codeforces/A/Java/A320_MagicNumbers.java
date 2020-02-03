package Codeforces;
import java.util.Scanner  ; 
public class A320_MagicNumbers {
	public static boolean magiic (String n ){
		int adad = -1 ; 
		for (int i = 0 ;n.length()>=1; i ++ ){
			if (n.charAt(0)=='1'){
				adad = 0 ; 
				n=n.substring(1) ; 
				
			}
			else if (n.charAt(0)=='4' && adad>=0){
				adad ++ ; 
				n=n.substring(1) ; 
				
			}
			else 
				return false ; 
			if (adad >= 3)
				return false ; 
			
		}

		
	
		return true ; 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt(); 
		String m = n+"" ; 
		if (magiic(m))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
