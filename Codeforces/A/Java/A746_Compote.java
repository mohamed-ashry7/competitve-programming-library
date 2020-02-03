package Codeforces;
import java.util.Scanner ; 
public class A746_Compote {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int lem = ss.nextInt() ; 
		int app = ss.nextInt() ; 
		int pee  = ss.nextInt() ; 
		int c = 0 ; 
		for (int i = 1 ; i<=lem ; i ++ ){
			if (i*2<=app && i*4<=pee){
				c++ ; 
			}
			else 
				break ; 
		}
		int u = c*1+c*2+c*4  ; 
		System.out.println(u);
	}

}
