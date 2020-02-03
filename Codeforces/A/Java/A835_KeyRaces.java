package Codeforces;
import java.util.Scanner ; 
public class A835_KeyRaces {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int c= ss.nextInt() ; 
		int v1 = ss.nextInt() ; 
		int v2 = ss.nextInt() ; 
		int t1 = ss.nextInt() ; 
		int t2 = ss.nextInt() ; 
		int h1 = c*v1+2*t1 ; 
		int h2 = c*v2 + 2*t2 ; 
		if (h1>h2){
			System.out.println("Second");
			
		}
		else if (h1<h2)
			System.out.println("First");
		else 
			System.out.println("Friendship");
	}

}
