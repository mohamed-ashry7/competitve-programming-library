package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Minimize_the_Permutation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		while (q-->0) { 
			int n = Integer.parseInt(br.readLine());
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int [] num = new int [n] ; 
			for (int i = 0 ;i<n ; ++i ) { 
				num[i] = Integer.parseInt(stt.nextToken()) ; 
			}
			int swaps = n-1 ; 
			for (int i = 0 ; i <n&& swaps>0 ; ++i){
				
				int min = num[i] ; 
				for (int j = i+1 ;j<n ; ++j ) { 
					min = Math.min(min, num[j]) ; 
				}
			}
			
		}
	}

}
