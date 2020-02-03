package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1247_Forgetting_Things {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer stt = new StringTokenizer(br.readLine()) ;
		int da = Integer.parseInt(stt.nextToken()) ; 
		int db = Integer.parseInt(stt.nextToken()) ; 
		if (da==db) { 
			System.out.println((da*10+1)+" "+(db*10+2));
		}
		else if (db-da==1){
			System.out.println(da+" "+db);
		}
		else if (da==9 && db ==1) {
			System.out.println(da+" "+10);
		}
		else {
			System.out.println(-1);
		}
		
		
	}

}
