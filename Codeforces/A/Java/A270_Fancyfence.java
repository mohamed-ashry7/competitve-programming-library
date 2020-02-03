package Codeforces;
import java.util.Scanner ; 
public class A270_Fancyfence {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int x = 0 ; 
		double tes = 0 ; 
		int tess =0 ; 
		double h = 0 ; 
		for (int i = 0 ; i< n ; i ++ ) { 
			x = ss.nextInt() ;
			tes = (double)(360)/(180-x) ; 
			tess = (int) tes  ; 
			h = (double) tess ; 
			if (h== tes)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

}
