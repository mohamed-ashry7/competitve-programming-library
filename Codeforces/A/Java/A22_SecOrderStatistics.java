package Codeforces;
import java.util.Arrays;
import java.util.Scanner ; 
public class A22_SecOrderStatistics {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		for (int i = 0 ; i <n ; i ++ ){
			a[i] = ss.nextInt() ; 
			
		}
		Arrays.sort(a);
		if (a[0] == a[n-1])
			System.out.println("NO");
		else {
			int  u = 0 ; 
			for (int i = 1 ; i < n ; i ++ ) { 
				if (a[i-1]!=a[i])
				{
					u =a[i] ; 
					break ; 
				}
			}
			System.out.println(u);
		}
	
	}

}
