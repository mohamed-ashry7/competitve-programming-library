package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A659_RoundHouse {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken()) ; 
		int a = Integer.parseInt(stt.nextToken()) ; 
		int b = Integer.parseInt(stt.nextToken()) ; 
		int movs  = b%n  + a ;
		if (movs <= 0 ){
			movs +=n ; 
		}
		System.out.println(movs>n ? movs%n : movs);
		
	}

}
