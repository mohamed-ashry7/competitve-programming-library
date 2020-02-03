package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A60_Where_Are_My_Flakes {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ;
		int boxes = Integer.parseInt(stt.nextToken()) ;
		int ins = Integer.parseInt(stt.nextToken()) ;
		int left = boxes ; 
		int right = 1 ;
		while (ins-->0) { 
			String theInstruction = br.readLine() ;
			int which = Integer.parseInt(theInstruction.substring(theInstruction.indexOf("of")+3));
			if (theInstruction.contains("left")){
				if (left>=which) { 
					left = which-1 ; 
				}
			}
			else { 
				if (right <= which ) { 
					right = which+1  ;
				}
			}
		}
		if (right > left ) { 
			System.out.println(-1);
		}
		else {
			System.out.println(left-right + 1);
		}
	}

}
