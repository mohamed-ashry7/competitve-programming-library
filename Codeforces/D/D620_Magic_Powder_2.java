package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D620_Magic_Powder_2 {

	static long POWDER;
	static long[] a;
	static long[] b;
	
	
	static boolean  canTheCookies (long cookies  ) { 
		long subPOWDER = POWDER ; 
		
		for (int i = 0 ; i < a.length ; i ++ ) { 
			long needed = a[i] * cookies ; 
			if (needed > b[i]) { 
				long diff = needed - b[i] ; 
				if (diff > subPOWDER) { 
					return false ;
				}
				else { 
					subPOWDER-=diff ; 
				}
			}
		}
		return true; 
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		POWDER = Long.parseLong(stt.nextToken());
		stt = new StringTokenizer(br.readLine());
		a = new long [n] ; 
		b = new long [n] ; 

		long max = -1;
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(stt.nextToken());
		}
		stt = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			b[i] = Long.parseLong(stt.nextToken());
			long div = (POWDER + b[i]) / a[i];
			max = max > div ? max : div;
		}

		long low = 0l;
		long high = max;
		long mid = (low+high )/ 2 ; 
		
		while (low<=high ) { 
			boolean canIt = canTheCookies(mid ) ; 
			if (canIt) { 
				boolean secondChance = canTheCookies(mid+1) ; 
				if (secondChance) { 
					low = mid+1 ; 
					mid = (low+high )/ 2 ; 
				}
				else { 
					break ; 
				}
			}
			else { 
				high = mid-1 ; 
				mid = (low+high )/ 2 ; 
			}
		}
		System.out.println(mid);
	}

}
