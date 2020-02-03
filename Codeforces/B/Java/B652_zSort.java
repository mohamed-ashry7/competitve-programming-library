package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B652_zSort {

	
	
	public static void main(String[] args) throws IOException {

		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		
		int n = Integer.parseInt(br.readLine()) ; 
		StringTokenizer stt =new StringTokenizer(br.readLine() ) ; 
		int [] a = new int [n+1] ; 
		int [] b = new int [n+1] ; 
		for (int i = 1 ; i <= n ; i ++ ) { 
			a[i] = Integer.parseInt(stt.nextToken()) ; 
		}
		Arrays.sort(a);
		int k = n ;
		int s = 1 ; 
		for (int i = 1; i <= n ; i ++ ) { 
			if (i % 2 == 1 ) { 
				b[i] =  a[s++] ; 
			}
			else {
				b[i] = a[k--] ; 

			}
		}
		System.out.println(Arrays.toString(b).replaceAll("[\\[\\],]", "").substring(2));
		
	}

}
