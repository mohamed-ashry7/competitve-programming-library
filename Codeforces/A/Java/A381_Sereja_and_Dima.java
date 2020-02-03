package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A381_Sereja_and_Dima {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) ; 
		int i = 0 ; 
		int [] a = new int [n] ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
		
		while (stt.hasMoreTokens()) { 
			int x = Integer.parseInt(stt.nextToken()) ; 
			a[i++] = x;
		}
		int sereja = 0 ; 
		int dema = 0 ; 
		int left = 0 ; 
		int right = n-1 ; 
		boolean index = true ; 
		
		while (left<=right) { 
			int max = 0 ; 
			if (a[left] > a[right]) { 
				max = a[left++] ; 
			}
			else {
				max = a[right--] ; 
			}
			if (index) {
				sereja += max ; 
			}
			else {
				dema += max  ; 
			}
			index = !index ; 
		}
		System.out.println(sereja + " " + dema );
	}


}