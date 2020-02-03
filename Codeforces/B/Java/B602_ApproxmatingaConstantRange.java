package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader ; 
import java.io.InputStreamReader ; 
import java.io.IOException  ;
public class B602_ApproxmatingaConstantRange {
	 
	public static void main(String[] args)throws IOException  {
		Scanner ss = new Scanner (new BufferedReader(new InputStreamReader(System.in))) ; 
		int n  = ss.nextInt() ; 
		int [] a = new int [n] ; 
		int c = 1 ; a[0] = ss.nextInt() ; 
		int max = a[0] ; 
		int min = a[0] ; 
		int lon = 0 ; 
	//	System.out.println("max 	min 	i 	c ");
		for (int i = 1 ; i <a.length ; i ++  ) {
		//	System.out.println(max + "	" + min + "	" + i + "	" + c );
			a[i] = ss.nextInt() ; 
			if (max < a[i])
				max = a[i] ; 
			else if (min > a[i] ) 
				min = a[i] ; 
			if ((int ) (Math.abs(max-min)) <=  1 ) { 
				c++ ; 
			}
			else { 
				if (c>lon)
					lon = c ; 
				if ((int ) Math.abs(a[i] -a[i-1]) <=1){
					c= 2 ; 
					if (a[i-1] < a[i]) {
						max = a[i] ;  
						min = a[i-1] ; } 
					
					else {
						max = a[i-1] ; 
						min = a[i] ; 
					}
					for (int j = i-2 ; j >= 0 ; j -- ) { 
						if (a[j] == a[j+1])
							 c++ ; 
						else 
							break ; 
					}
				}
				else {
					c = 1 ; 
					min = a[i] ; 
					max = a[i] ; 
				}

					
			}
			
		}
		if (c>lon)
			lon = c ; 
		System.out.println(lon);
	}

}
