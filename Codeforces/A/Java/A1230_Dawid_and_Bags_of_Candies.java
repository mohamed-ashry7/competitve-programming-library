package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1230_Dawid_and_Bags_of_Candies {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine()) ;
		int a1 = Integer.parseInt(stt.nextToken()) ; 
		int a2 = Integer.parseInt(stt.nextToken()) ; 
		int a3 = Integer.parseInt(stt.nextToken()) ; 
		int a4 = Integer.parseInt(stt.nextToken()) ; 
		if (a1+a2==a3+a4 || a1+a3==a2+a4 || a1+a4 == a2+a3 || a1==a2+a3+a4 || a2 == a1+a3+a4 || a3 == a1+a2+a4 || a4 == a1+a2+a3) { 
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
