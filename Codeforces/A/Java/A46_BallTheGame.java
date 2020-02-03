package Codeforces;
import java.util.Scanner  ;
public class A46_BallTheGame {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		int n = ss.nextInt() ; 
		String wan ="2" ; 
		int j = 2  ; 
		int h= 2 ; 
		for (int i = 2 ; i <=n-1 ; i++ , j++  ){
			h = h+j ; 
			if (h== n)
				h=n ;
			else if (h>n)
				h%=n ; 
			wan = wan +" " +h ; 
		}
		System.out.println(wan);
	}

}
