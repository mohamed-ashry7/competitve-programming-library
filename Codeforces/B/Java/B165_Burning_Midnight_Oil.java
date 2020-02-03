package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B165_Burning_Midnight_Oil {
	
	public static double can (double n ,double v , double k   ){
		
		double sum = v ;
		double i = 1 ; 
		double c ; 
		while (( c =(int) Math.floor(v/Math.pow(k,i++ ))) != 0 ) { 
			sum+=c ; 
		}
		double df = n-sum ; 
		if (df<0) { 
			df*=-1 ; 
		}
		if (df < 1e-7)
			return 0 ; 
		return n-sum ; 
	}
	public static int binaryGen (double n  , double k ) { 
		double mid = (n+1) / 2.0 ; 
		double l =1 ; 
		double h = n ; 
		double val  ;
		int i = 80 ; 
		while ((val = can( n ,mid , k  )) != 0 && i-->0) { 

			if (val<0){
				h = mid ; 
				mid =(l+h)/2.0 ;
			}
			else {
				l = mid ; 
				mid =(l+h)/2.0 ;
			}
			
		}
		
		return(int) Math.round(mid) ; 
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(stt.nextToken());
		int k = Integer.parseInt(stt.nextToken());
		System.out.println(binaryGen((double)n, (double)k));
	}

}
