package Codeforces;
import java.util.Scanner ; 
public class A427_PoliceRecruits {

	public static void main(String[] args) {
		Scanner ss= new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		int k = 0 ; 
		int c = 0 ; 
		for (int i = 0 ; i <n ; i ++ ) { 
			a[i] = ss.nextInt() ;
			k +=a[i] ; 
			if (k<0){
				c++ ; 
				k = 0 ; 
			}
		
		}
		System.out.println(c);
	}

}
