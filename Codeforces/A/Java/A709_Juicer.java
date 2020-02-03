package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A709_Juicer {

	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine()) ;
		int n = Integer.parseInt(stt.nextToken()) ; 
		int b =  Integer.parseInt(stt.nextToken()) ; 
		int d =  Integer.parseInt(stt.nextToken()) ; 
		stt = new StringTokenizer(br.readLine()) ;
		int waste = 0 ; 
		int cleans = 0 ; 
		for (int i = 0 ; i <n ; ++i) { 
			int orange =  Integer.parseInt(stt.nextToken()) ; 
			if (orange>b)continue ; 
			waste+= orange ; 
			if (waste>d) {
				waste = 0 ; 
				cleans ++ ; 
			}
		}
		System.out.println(cleans);
	}
}
