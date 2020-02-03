package Codeforces;
import java.util.* ; 
public class A560_Currency_System_in_Geraldion {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		int n = ss.nextInt()  ;
		int  j  ; 
		int max = 100000000 ; 
		for (int i = 0 ; i<n ; i++){
			j = ss.nextInt() ; 
			if (max >j)
				max = j ; 
				
		}
		if (max == 1)
			System.out.println(-1);
		else 
			System.out.println(1);
		}
	

}
