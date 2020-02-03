package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A686_Free_Ice_Cream {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		long n =Long.parseLong(stt.nextToken()) ; 
		long x = Long.parseLong(stt.nextToken()) ;  
		long dis = 0 ; 
		for (int i = 0 ; i < n ; ++i ) {
			stt = new StringTokenizer(br.readLine()) ; 
			if (stt.nextToken().equals("+")) {
				x+=Long.parseLong(stt.nextToken()) ;  
			}
			else { 
				long wan = Long.parseLong(stt.nextToken()) ;  
				if (wan<=x) {
					x-=wan ; 
				}
				else { 
					dis++ ; 
				}
			}
		}
		System.out.println(x+" "+dis);
	}

}
