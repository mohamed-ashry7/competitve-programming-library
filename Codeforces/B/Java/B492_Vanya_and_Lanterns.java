package CF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B492_Vanya_and_Lanterns {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stt = new StringTokenizer(br.readLine()) ;
		int n  = Integer.parseInt(stt.nextToken()); 
		int l = Integer.parseInt(stt.nextToken()) ; 
		int [] a = new int [n]; 
		stt = new StringTokenizer(br.readLine()) ;
		for (int i = 0 ; i < n ; ++i ) { 
			a[i] =Integer.parseInt(stt.nextToken()) ; 
		}
		Arrays.sort(a);
		int ends = (int) Math.max(a[0], l - a[n-1]) ; 
		double max = 0 ; 
		for (int i = 1 ; i<n ;i++) { 
			max = Math.max(max, a[i]-a[i-1]); 
		}
		max = Math.max(max/2.0, ends); 
		System.out.println(max);
		
		
	}

}
