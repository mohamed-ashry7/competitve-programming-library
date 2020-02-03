package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A699_Launch_of_Collider {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ;  
		int n = Integer.parseInt(br.readLine()) ; 
		char particles [] = br.readLine().toCharArray() ;
		int min = Integer.MAX_VALUE ; 
		int foundR = -1 ; 
		StringTokenizer stt= new StringTokenizer(br.readLine()) ; 
		for (int i = 0 ; i < n ; ++i   ) { 
			int dis = Integer.parseInt(stt.nextToken()) ; 
			if (particles[i]=='R') {
				foundR = dis ; 
			}
			else if (particles[i]=='L' && foundR!=-1) { 
				min = Math.min(min,(dis-foundR)/2 ) ; 
			}
			
		}
		System.out.println(min==Integer.MAX_VALUE?-1:min);
	}

}
