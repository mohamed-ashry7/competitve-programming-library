package Codeforces;

import java.util.Scanner;
import java.io.* ; 
import java.math.BigInteger ; 
public class A614_LinkCutTree {

	public static void main(String[] args) {
		Scanner ss = new Scanner (new BufferedReader(new InputStreamReader(System.in))) ;
		BigInteger l = new BigInteger (ss.next()) ; 
		BigInteger r = new BigInteger (ss.next()) ; 
		BigInteger k = new BigInteger (ss.next()) ; 
		String wan = "" ; 
		long a  = 0 ; 
		int  i = (int )(Math.log(l.longValue()) / Math.log(k.longValue())) ;
		 

		
		for ( ; k.pow(i).compareTo(r)< 0  ; i ++  ){
			if (k.pow(i).compareTo(l)>=0 && k.pow(i).compareTo(r)<=0){
				wan +=  k.pow(i).toString()+" " ; 
			}
			
		}  
		if (wan.length() == 0 )
			wan +="-1" ; 
		
		System.out.println(wan);
	}

}
