package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A558_LalaLandAndAppleTrees {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] pos = new int [1000000] ;
		int [] pp = new int [n] ; 
		int[]  neg = new int [1000000] ; 
		int [] nn = new int [n] ; 
		int np = 0 ; 
		int ng = 0 ;
		int c = 0 ; 
		for (int i = 0 ; i<n ; i ++ ) 
		{
			int si = ss.nextInt() ; 
			int b = ss.nextInt() ; 
			if (si > 0 ) { 
				pos[si] = b ; 
				pp[np] = si ; 
				np ++ ; 
			}
			else {
				neg[-si] = b ;
				nn[ng] = -si ; 
				ng ++ ; 
			}
			c+=b ; 
		}
		Arrays.sort(pp);
		Arrays.sort(nn);
		if (ng == np && ng+np == n){
			c=c  ;
		}
		else if (ng == np ) {
			
			c = 0 ; 
			for (int i = np ; i > 0 ; i -- ) { 
				c  +=pos[pp[pp.length-i]] + neg[nn[nn.length-i]] ; 
			}
			if (pos[pp[pp.length-np-1]] > neg[nn[nn.length-np-1]]){
				c+=pos[pp[pp.length-np-1]] ; 
			}
			else {
				c+=neg[nn[nn.length-np-1]] ; 
			}
		
		}
		else if (np > ng) {
			c = 0 ; 
			for (int i = ng+1 ; i > 0 ; i -- ) {
				c  +=pos[pp[pp.length-np+i-1]] ; 
				if (i > 1 ) {
					c+=neg[nn[nn.length-i+1]] ; 

				}
			}
			
		}
		else {
			c = 0 ; 
			for (int i = np+1 ; i > 0 ; i -- ) {
				c+=neg[nn[nn.length-ng+i-1]] ; 

				if (i > 1 ) {
					c  +=pos[pp[pp.length-i+1]] ; 

				}
			}
		}
		System.out.println(c);
	} 
}



