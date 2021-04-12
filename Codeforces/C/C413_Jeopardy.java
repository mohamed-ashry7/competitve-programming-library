package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C413_Jeopardy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		StringTokenizer stt = new StringTokenizer( br.readLine()) ; 
		
		int n = Integer.parseInt(stt.nextToken()) ; 
		int m = Integer.parseInt(stt.nextToken()) ; 
		String quests = br.readLine() ; 
		StringTokenizer qq = new StringTokenizer( quests ) ; 
		StringTokenizer auc = new StringTokenizer( br.readLine()) ;
		int [] specials = new int [m+1] ; 
		for (int i = 1 ; i <= m ; i ++  ) { 
			specials[i] = Integer.parseInt(auc.nextToken()) ; 
		}
		Arrays.sort(specials);
		long pts = 0 ;
		int max = 0 ; 
		int k = 1 ; 
		for (int i = 1 ; i <= n ;  i++ ) { 
			int wan = Integer.parseInt(qq.nextToken() ) ; 
			if (k <= m && i == specials[k]) { 
				k ++ ; 
				if (max < wan ) {
					max = wan ; 
				}
			}
			else { 
				pts += wan ; 
			}
		}
		if (max > pts ) { 
			pts += max ; 
			m-- ; 
		}
		pts <<= m ; 
		System.out.println(pts );
		

	}

}
