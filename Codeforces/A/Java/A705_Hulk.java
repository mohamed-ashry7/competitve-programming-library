package Codeforces;
import java.util.Scanner ; 
public class A705_Hulk {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		String one  = "I hate" ;
		String two = "I love" ; 
		String wan = "" ; 
		for (int  i = 0 ; i <n ; i ++ ) {
			if (i == n-1)
				if (i%2 == 0 )
					wan+=one + " it" ; 
				else 
					wan+=two+" it" ; 
			else if (i%2 == 0 )
				wan += one + " that "  ; 
			else 
				wan += two + " that " ; 
		}
		System.out.println(wan );
		
	}

}
