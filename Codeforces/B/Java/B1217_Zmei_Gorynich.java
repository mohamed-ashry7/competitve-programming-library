package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1217_Zmei_Gorynich {




	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			int ALL = Integer.parseInt(stt.nextToken());
			int max = (int)-1e9 ; 
			int wanH = 0 ; 
			for (int i = 0; i < n; i++) {
				stt = new StringTokenizer(br.readLine());
				int d = Integer.parseInt(stt.nextToken());
				int h = Integer.parseInt(stt.nextToken());
				int diff = d-h ; 
				if (diff > max) { 
					max = diff  ;
					wanH = h ; 
				}
			}
			if (max <= 0 ) { 
				System.out.println(-1) ;
			}
			else { 
				int blows = (int)Math.ceil((1.0*ALL) / max) -1;
				int after = blows * max ; 
				if (ALL - after > wanH) { 
					blows++ ; 
				}
				System.out.println(blows );
			}
			

		}
	}

}
