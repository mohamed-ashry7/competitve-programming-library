package Codeforces;
import java.util.Scanner ; 
public class A520_Pangram {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		String x = ss.next() ; 
		x = x.toLowerCase() ; 
		boolean f = true ; 
		int j = 0 ; 
		String alpha = "abcdefghijklmnopqrstuvwxyz" ; 
		if (n<26)
			f = false ; 
		else 
		for (int i = 0 ; i < 26 ; i ++ ){
			if (x.indexOf(alpha.charAt(i)+"")==-1)
			{
				f = false ; 
				break ; 
			}
			
		}
		if (f)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

}
