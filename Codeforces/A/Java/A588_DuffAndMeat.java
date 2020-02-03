package Codeforces;
import java.util.Scanner ; 
public class A588_DuffAndMeat {

	public static void main(String[] args) {
		Scanner  ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int af = ss.nextInt() ; 
		int pf = ss.nextInt() ; 
		int kilos = 0 ; 
		int cost = af*pf ; 
		int al ; 
		int pl ; 
		for (int i = 1 ; i < n ; i ++ ) { 
			al = ss.nextInt() ; 
			pl = ss.nextInt() ; 
			if (pf < pl ) { 
				cost+=pf *al  ; 
			}
			else {
				cost +=pl*al ; 
				pf = pl ; 
			}
		}
		System.out.println(cost);
	}

}
