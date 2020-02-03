package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A431_Black_Square {

	public static void main(String[] args) throws IOException {
	
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] a = new int [4] ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
		int i = 0 ; 
		while (stt.hasMoreTokens()) { 
			a[i++] = Integer.parseInt(stt.nextToken()) ; 
		}
		char [] pushes = br.readLine().toCharArray() ; 
		int cum = 0 ; 
		for (i = 0 ; i < pushes.length ; ++i ) { 
			cum += a[Integer.parseInt(pushes[i]+"")-1] ; 
		}
		System.out.println(cum);
	}

}
