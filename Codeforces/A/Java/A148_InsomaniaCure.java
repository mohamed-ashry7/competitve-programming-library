package Codeforces;
import java.util.Scanner ; 
public class A148_InsomaniaCure {

	public static void main(String[] args) {
		Scanner ss= new Scanner (System.in) ; 
		int k = ss.nextInt() ; 
		int l = ss.nextInt() ; 
		int m = ss.nextInt() ; 
		int n = ss.nextInt() ; 
		int d = ss.nextInt() ;
		int [] u= new int []{k,l,m,n} ; 
		int j = 0 ; 
		int h = 0 ; 
		int r= 0 ; 
		for (int i = 1 ; i <=d ; i++,h++ ){
			if (h>3){
				h=0 ; 
			}
			r = u[h] ; 
			if (i%r == 0 ){
				j++ ; 
			}
		}
		System.out.println(j);
	}

}
