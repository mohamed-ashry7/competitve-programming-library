package Codeforces;

import java.util.Scanner;
import java.io.* ; 
import java.math.BigInteger;
public class B897_CthollysRequest {

	
	
	public static void result (int k , int p ) { 
		String h = "" ; 
		BigInteger summ = new BigInteger("0") ; 
		for (int i = 1 ; i <=k ; i ++ )  {
			h = i+""  ;
			StringBuilder v = new StringBuilder(h).reverse() ; 
			h = h + v +"" ; 
			summ = summ.add(new BigInteger(h))  ;
		}
		 summ = summ.mod(new BigInteger(p+"")) ; 
		 System.out.println(summ.toString());
	}
	
	
	
	public static void main(String[] args) {
		Scanner ss =new Scanner (new BufferedReader(new InputStreamReader(System.in)))  ;
		int k = ss.nextInt() ; 
		int  p = ss.nextInt() ; 
		result(k,p);
	}

}
