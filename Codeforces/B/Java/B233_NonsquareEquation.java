package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B233_NonsquareEquation {

	public static long  addNum (long x ) { 
		int sum = 0  ; 
		
		while (x>0) { 
			sum += x%10 ; 
			x/=10 ; 
		}
		
		
		
		return sum ; 
	}
	
	public static long xRoot (String n ) { 
		
		
		long number = Long.parseLong(n) ; 
		for (int s =1 ; s <= 81 ; s ++ ) { 
			long sur =(long) Math.sqrt(s*s + 4*number ) ; 
			if ( sur*sur == s*s+4*number){
				long root = (long) Math.sqrt(s*s + 4*number ) - s ;
				if (root > 0 && root%2 == 0  ) { 
					long x = root/2 ; 
					if (s == addNum(x)) { 
						return x ; 
					}
				}			}
			
		}
		return -1 ; 

		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		 System.out.println(xRoot(br.readLine()));
		 
	
	}
}









