package Codeforces;
import java.util.Arrays;
import java.util.Scanner ; 
public class A469_iWannaBeTheGuy {
	public static boolean chich(int [] a , int n ) {
		boolean fond = false  ; 
		for (int i =1 ; i<=n ; i ++ ){
			for (int j = 0 ; j<a.length ; j++ ){
				if (i == a[j])
					fond = true  ; 
			}
			if (fond == false ) 
				return false ; 
			else 
				fond = false ; 
		}
		return true ; 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int a = ss.nextInt() ; 
		int [] am = new int [a] ; 
		for (int i = 0 ; i <a ; i ++ ){
			am[i] = ss.nextInt() ; 
		}
		int b = ss.nextInt() ; 
		int [] bm = new int [b] ; 
		for (int i = 0 ; i <b ; i ++ ){
			bm[i] = ss.nextInt() ; 
		}
		int [] c =new int [a+b] ; 
		for (int i = 0 ; i <a+b ; i ++){
			if (i>=a){
				c[i]=bm[i-a] ; 
				
			}
			else {
				c[i] = am[i] ; 
			}
		}
		Arrays.sort(c) ; 
		if (chich(c,n))
			System.out.println("I become the guy.");
		else 
			System.out.println("Oh, my keyboard!");
		
	}

}
