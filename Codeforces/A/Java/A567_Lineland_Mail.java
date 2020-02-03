package Codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A567_Lineland_Mail {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine()) ;
		int [] a = new int [n] ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
		for (int i = 0 ; i < n ; ++i ) { 
			a[i] = Integer.parseInt(stt.nextToken()) ; 
		}
		for (int i = 0 ; i < n ; ++i ) { 
			if ( i == 0 ) { 
				System.out.println((a[1]-a[0]) + " " + (a[n-1] - a[0]));
			}
			else if (i == n-1) { 
				System.out.println((a[n-1] - a[n-2] ) + " " + (a[n-1] - a[0]));
			}
			else { 
				System.out.println(Math.min(a[i]-a[i-1], a[i+1]-a[i]) + " " + Math.max(a[i] -a[0], a[n-1] - a[i]));
			}
		}
	}

}
