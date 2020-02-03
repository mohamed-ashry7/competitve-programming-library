package Codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.io.* ; 
public class A892_Greed {

	public static void main(String[] args) {
		Scanner ss =new Scanner (new BufferedReader(new InputStreamReader(System.in))) ; 
		int n = ss.nextInt() ; 
		int max1 = 0 ; 
		int max2 = 0 ; 
		int a  ;
		int [] b =new int [n] ; 
		int all = 0 ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			a =ss.nextInt() ; 
			all+=a ; 
		}
		int c = 0 ; 
		for (int i = 0 ; i <n ; i ++ ) { 
			b[i] = ss.nextInt() ; 
			if (b[i] > max1){
				max1 = b[i] ; 
				c= i ; 
			}
				
		}
		b[c] = 0  ; 
		max2 = Arrays.stream(b).max().getAsInt() ; 
		System.out.println(all + " " + max1 + " " + max2);
		if (all<=max1+max2)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

}
