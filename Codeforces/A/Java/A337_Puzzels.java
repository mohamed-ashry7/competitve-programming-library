package Codeforces;
import java.util.Arrays;
import java.util.Scanner ; 
public class A337_Puzzels {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int m = ss.nextInt() ; 
		int [] a = new int [m] ; 
		for (int i = 0 ; i <m; i ++ ){
			a[i] =ss.nextInt() ; 
		}
		Arrays.sort(a);
		int min = 1000 ;
		int  i = 0 ; 
		int h = n-1 ; 
		for (;h<=m-1 ; h++ , i ++ ){
			if (a[h]-a[i]<min)
				min = a[h]-a[i] ; 
		}
		System.out.println(min);
	}
	

}
