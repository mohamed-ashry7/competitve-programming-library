package Codeforces;

import java.util.Scanner;

public class A621_wetSharks {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		long summ = 0 ; 
		long min = (long)Double.POSITIVE_INFINITY ;  
		for (int i = 0 ; i < n ; i ++ ) { 
			long c = ss.nextLong() ; 
			if (c%2 == 0 ) { 
				summ += c ; 
			}
			else {
				summ+=c ; 
				if (c<min ) { 
					min = c ; 
				}
			}
		}
		if (summ%2 != 0 ) { 
			summ -= min ; 
		}
		System.out.println(summ );
	}

}
