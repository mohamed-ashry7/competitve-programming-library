package Codeforces;
import java.util.Scanner  ; 
public class A432_choosingTeams {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in ) ; 
		int n = ss.nextInt() ; 
		int k = ss.nextInt() ; 
		int c = 0 ; 
		int a =  0 ; 
		for (int  i = 0 ; i <n ; i ++ ) { 
			a = ss.nextInt() ; 
			a+=k ; 
			if (a<=5){
				c++ ; 
			}
		}
		c = c/3 ; 
		System.out.println(c);
		}

}
