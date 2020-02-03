package Codeforces;
import java.util.Scanner;
public class A734_AntonDanik {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		String b = ss.next() ; 
		int d = 0 ; 
		int a = 0 ; 
		for (int  i = 0 ; i <n ; i ++ ) {
			if (b.charAt(i)=='D')
				d++ ; 
			else 
				a++ ; 
		}
		if (d>a)
			System.out.println("Danik");
		else if (a>d)
			System.out.println("Anton");
		else 
			System.out.println("Friendship");
	}

}
