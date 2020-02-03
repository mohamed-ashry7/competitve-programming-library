package Codeforces;
import java.util.Scanner  ; 
public class A732_Shovel {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in)  ; 
		int  k = ss.nextInt() ; 
		 int r = ss.nextInt() ; 
		 int c = 1  ; 
		 if (k%10 == 0 )
			 System.out.println(1);
		 else if (k%10 == 5 && r == 5 )
			 System.out.println(1);
		 else if (k%10 == 5 )
			 System.out.println(2);
		 else {
			 int h = 0 ; 
			for (int i = 1 ; true ; i ++ ){
				h = i*k ; 
				if (h%10 == 0 || (i*k-r)%10 == 0  )
					break ; 
				else 
					c++ ; 
			}
			 System.out.println(c);

		 }
	}

}
