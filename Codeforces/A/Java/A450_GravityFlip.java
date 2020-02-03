package Codeforces;
import java.util.Arrays;
import java.util.Scanner  ; 
public class A450_GravityFlip {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		for (int i = 0 ; i <n ; i ++ ) {
			a[i] = ss.nextInt() ; 
		}
		Arrays.sort(a);
		for (int j = 0 ; j <n; j ++ ){
			System.out.println(a[j]);
		}
	
	
	}

}
