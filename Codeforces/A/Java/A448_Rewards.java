package Codeforces;
import java.util.Scanner ; 
public class A448_Rewards {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int [] a = new  int []{ss.nextInt() , ss.nextInt() , ss.nextInt()} ; 
		double val1 = a[0] + a[1] +a[2] ;
		int shelfMedal = (int) (Math.ceil(val1/5.0)) ; 
		int [] b = new  int []{ss.nextInt() , ss.nextInt() , ss.nextInt()} ; 
		double val2 = b[0] + b[1] +b[2] ;
		int n = ss.nextInt() ; 
		int shelfcups = (int) (Math.ceil(val2/10.0)) ; 
		

		if (shelfcups+shelfMedal <=n )
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

}
