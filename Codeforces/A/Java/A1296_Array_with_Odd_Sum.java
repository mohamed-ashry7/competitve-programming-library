package notAdded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1296_Array_with_Odd_Sum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		int t = Integer.parseInt(br.readLine());
		while (t-->0) { 
			boolean odd = false ; 
			boolean even = false ; 
			int n =Integer.parseInt(br.readLine()); 
			StringTokenizer stt= new StringTokenizer(br.readLine()) ; 
			int sum = 0 ; 
			while (stt.hasMoreTokens()) {
				int element = Integer.parseInt(stt.nextToken()) ;
				sum +=  element ; 
				if (element%2==0) { 
					even = true ; 
				}
				else {
					odd = true ; 
				}
				
			}
			if (sum%2==1) { 
				System.out.println("YES");
			}
			else { 
				if (odd&&even ) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}

}
