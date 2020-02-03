package Codeforces;
import java.util.Scanner ; 
public class A82_DoubleCola {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int h = n%5 -1;
		if (h==-1)
			h= 4 ; 
		String [] a = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"} ; 
		System.out.println(a[h]);
	}

}
