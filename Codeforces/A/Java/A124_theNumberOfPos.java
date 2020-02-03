package Codeforces;
import java.util.Scanner ; 
public class A124_theNumberOfPos {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int a = ss.nextInt() ; 
		int b = ss.nextInt() ; 
		if (a+b<n)
			System.out.println(b+1);
		else  {
			System.out.println(n-a);
			
		}
		
	}

}
