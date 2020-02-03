package Codeforces;
import java.util.Scanner ; 
public class A884_ReadingBook {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int t = ss.nextInt() ; 
		int day = 0  ;
		int sec = 0 ; 
		int [] a = new int [n] ; 
		for (int i = 0 ; i <n ; i ++ ) { 
			day =  i +1 ;
			sec += 86400 -  ss.nextInt() ; 
			if (sec >= t)
				break ; 
		}
		System.out.println(day);
	}

}
