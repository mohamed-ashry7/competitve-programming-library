package Codeforces;
import java.util.Scanner  ; 
public class A158_NextRound {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in ) ; 
		int n = ss.nextInt() ; 
		int  k = ss.nextInt() ; 
		int [] a  = new int [n] ; 
		for (int  i = 0 ; i < n ; i ++ ) { 
			a[i] = ss.nextInt() ; 
		}
		int max = a[k-1] ; 
		int c = 0  ; 
		for (int  i = 0 ; i <n ; i ++ ) { 
			if (a[i] >= max && a[i] > 0 ) { 
				c++ ; 
			}
		}
		System.out.println(c);
	}

}
