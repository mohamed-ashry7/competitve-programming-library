package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A767_Snacktower {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out) ; 
		int n  = Integer.parseInt(br.readLine()) ;
		boolean [] nums = new boolean  [n+1] ; 
		int next = n ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ; 

		for (int i = 1 ; i <= n ; ++i ) { 
			int a  = Integer.parseInt(stt.nextToken()) ; 
			nums[a] = true ; 
			while(nums[next]) {
				pw.print(next+" ");
				next--; 
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}

}
