package Codeforces;
import java.util.Scanner ; 
public class A144_ArrivalOfTheGeneral {
	public static int minindex (int [] a ) { 
		int k = 0 ; 
		for (int i = 0 ; i <a.length ; i ++ ) { 	
			k = i ; 
			for (int j =i+1 ;j<a.length ; j++){
				if (a[i]<a[j]){}
				else 
					break ; 
				if (j ==a.length-1)
					return i ; 
			}
		}
		return k ; 
	}
	public static int maxindex (int [] a  ) {
		int k = 0 ; 
		for (int i = 0 ; i <a.length ; i ++ ){
			k = i  ;
			for (int j = i+1 ; j<a.length ; j ++ ){
				if (a[i]>=a[j]){}
				else 
					break ; 
				if (j ==a.length- 1 )
					return i ; 
			}
		}
		return k ; 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ;  
		
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		for (int i = 0 ;  i<n ; i ++ ){
			a[i]=ss.nextInt() ; 
			}
		int indexmin  = minindex(a) ; 
		int indexmax = maxindex(a); 
		
		int v = indexmax+a.length-1-indexmin ; 
		if (indexmin<indexmax)
			v-- ; 
		System.out.println(v);
		
	}

}
