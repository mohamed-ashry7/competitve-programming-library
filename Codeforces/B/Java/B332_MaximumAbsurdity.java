package Codeforces;
import java.io.BufferedReader; 
import java.io.InputStreamReader  ; 
import java.util.Scanner;
import java.util.Arrays ; 
public class B332_MaximumAbsurdity {
	
	public static long []  max (long [][] a , long [] num , long d ,int k ) {
		int i , max ;
		long b1, b2 ; 
		if (d == -1 ) { 
			i = 1 ;
			long val = Arrays.stream(num).max().getAsLong() ; 
			max = Arrays.asList(num).indexOf(val) ; 
			System.out.println(max);
			return a[max] ; 
		}
		else {
			b1 = d-k ; 
			b2 = d+k ;
			if (b1 <0) { 
				i =(int) b2+1 ;
				long val = Arrays.stream(num,i,num.length).max().getAsLong() ; 
				 max = Arrays.asList(num).indexOf(val);
				 return a[max] ; 
			}
			if (b2>a.length) { 
				i = 1 ;  
				long val = Arrays.stream(num,i,(int )b1).max().getAsLong() ; 
				 max = Arrays.asList(num).indexOf(val);
				 return a[max] ; 
			}
			i =(int) b2+1 ;
			long val = Arrays.stream(num,i,num.length).max().getAsLong() ; 
			 max = Arrays.asList(num).indexOf(val);
			i = 1 ; 
			int maxx = 0 ; 
			val = Arrays.stream(num,i,(int )b1).max().getAsLong() ; 
			maxx = Arrays.asList(num).indexOf(val);
			if (a[maxx][0] > a[max][0]){
				return a[maxx] ; 
			}
			else {
				return a[max] ; 
			}
			
		}
		

		
	}
	public static void main(String[] args) {
		Scanner ss =new Scanner (new BufferedReader (new InputStreamReader (System.in) )) ; 
		int  n = ss.nextInt() ; 
		int  k  = ss.nextInt() ;
		long [] a = new long [n] ; 
		long [][] c = new long [n-k+1][3] ; 
		for (int i = 0 ; i <n ; i ++ ) { 
			a[i] = ss.nextLong() ; 
		}
		// make an array to make all the summs 
		
		long []  num  = new long [n-k+1] ; 
		for (int i = 0 ; i < n-k+1 ; i ++  ) { 
			long summ = Arrays.stream(a,i,i+k).sum();
			c[i][0] = summ ;
			c[i][1] = i ; 
			c[i][2] = k+i-1 ; 
			num[i] = summ ; 
			
		}
		long f =(max(c,num,-1, -1)[1]);
		long d =  (max(c,num,f,k)[1]);
		f++ ; 
		d++ ; 
		if (f>d)
			System.out.println(d + " " + f);
		else {
			System.out.println(f+" " + d);
		}
		
	}
}







