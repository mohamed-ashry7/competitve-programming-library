package Codeforces;

import java.util.Scanner;

public class B535_TavasAndSaDDas {

	public static void main(String[] args) {
		
		
		
		
		Scanner ss = new Scanner (System.in) ; 
		
		int n = ss.nextInt() ; 
		String len = n+"" ; 
		int allPos = 0 ;
		int num = 0 ; 
		for (int i = 1 ; i<= len.length() ; i ++  ) { 
			
			allPos += Math.pow(2, i) ; 
			
			if (len.charAt(i-1) == '7') { 
				num |= 1<<(len.length()-i);
				
			}
			
		}
		allPos=allPos - (int) Math.pow(2, len.length()) + num +1; 
		System.out.println(allPos);
	}

}
