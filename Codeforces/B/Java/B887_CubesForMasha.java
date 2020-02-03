package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class B887_CubesForMasha {

	
	
	
	public static int N1 (int [] c1 ) {
		int i = 1 ; 
		for (; i <10 ; i ++ ) {
			if (c1[i] == 0 ) { 
				 return  i-1 ;
				 
			}
			
		}
			return 9 ;
	}
	public static int N2(int []c1 , int [] c2) { 
		int i = 10 ;
		while (true ) { 
			if (c1[i%10] >= 1 && c2[i/10%10] >=1  || c2[i%10] >= 1 && c1[i/10%10] >=1 )
				i++ ; 
			else 
				return i-1 ; 
		}
	
	}
	
	public static int N3(int [] c1 , int []c2 , int [] c3) {
		int i = 10 ; 
		while (true ) { 
			if (i<100 ) { 
				if (c1[i%10] >= 1 && c2[(i/10)%100] >= 1 || c1[i%10] >= 1 && c3[(i/10)%100] >= 1 || c2[i%10] >= 1 && c1[(i/10)%100] >= 1 || c2[i%10] >= 1 && c3[(i/10)%100] >= 1 || c3[i%10] >= 1 && c2[(i/10)%100] >= 1  || c3[i%10] >= 1 && c1[(i/10)%100] >= 1    ){
					i++ ; 
				}
				else 
					return i-1 ; 
			}
			else {
				if (c1[i%10] >=1 && c2[i/10%100] >=1 && c3[i/100%1000] >= 1  || c1[i%10] >=1 && c3[i/10%100] >=1 && c2[i/100%1000] >= 1  || c2[i%10] >=1 && c1[i/10%100] >=1 && c3[i/100%1000] >= 1  || c2[i%10] >=1 && c3[i/10%100] >=1 && c1[i/100%1000] >= 1  ||c3[i%10] >=1 && c2[i/10%100] >=1 && c1[i/100%1000] >= 1  ||c3[i%10] >=1 && c1[i/10%100] >=1 && c2[i/100%1000] >= 1 )
					i++ ; 
				else 
					return i-1 ; 
			
			}
		}
	}
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		 
		int [] c1 = new int [10] ; 
		int [] c2 = new int [10] ; 
		int [] c3 = new int [10] ; 
		int [] d = new int [10] ; 
		for (int i = 0 ; i <n*6 ; i ++ ) {
			int b = ss.nextInt() ; 
			  if ( i < 6 )
				  c1[b] ++ ; 
			  else if (i < 12 )
				  c2[b] ++ ; 
			  else 
				  c3[b] ++ ; 
			  d[b] ++ ; 
			
		}
		int c = 0 ; 
		for (int j = 1 ; j <10 ; j ++  ) { 
			if (d[j] == 0 ){
				c = j-1 ; 
				break ;
			}
		}
		if ( d[1] >= 1 && c == 0  ){
		if (n == 1 ){
			c = N1(c1) ; 
		}
		else if (n == 2 ) { 
			c = N2(c1,c2 ) ; 
			 
		}
		else {
			
			c = N3(c1,c2,c3) ; 
		}
		
		}
			System.out.println(c);
		
		
		
	}

}
