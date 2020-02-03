package Codeforces;
import java.util.Scanner ; 
public class A136_Presents {

	public static void main(String[] args) {
		Scanner  ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int  [] a = new int [n] ; 
		for (int i = 0 ; i < n ; i ++ ){
			a[i] = ss.nextInt() ; 
		}
		String wan = "" ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			for (int j = 0 ; j < n ; j ++ ) { 
				if (i+1 == a[j]){
					int c = j +1 ; 
					wan +=  c + " " ; 
					break ; 
				}
			}
		}
		System.out.println(wan );
	}

}
