package Codeforces;
import java.util.Scanner ; 
public class A460_VasyanadSocks {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int m = ss.nextInt() ;
		int days = n ; 
		for (int i = 1 ; i <= days ; i ++ ){ 
			if (i%m == 0 )
				days ++ ; 
		}
		System.out.println(days);
	}
	

}
