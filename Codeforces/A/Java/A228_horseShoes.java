package Codeforces;
import java.util.Scanner ; 
public class A228_horseShoes {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int a = ss.nextInt() ; 
		int b = ss.nextInt() ; 
		int c = ss.nextInt() ; 
		int d = ss.nextInt() ; 
		int h = 0 ; 
		if (a==b || a ==c || a==d  )
			h++ ; 
		if (b==c || b== d )
			h++ ; 
		if (c==d)
			h++ ; 
		System.out.println(h);
	}

}
