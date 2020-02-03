package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B706_Interesting_drink {

	
	static int [] memo ; 
	public static int binSearch (int [] shops , int key ) { 
		int start = 0 ; 
		int end = shops.length -1 ; 
		int mid = (start + end ) / 2 ; 
		while (true ) { 
			if (key > shops[mid] && mid == shops.length-1 ) { 
				return shops.length ; 
			}
			else if (key < shops[mid] && mid == 0 ) {
				return 0 ; 
			}
			else if (key > shops[mid ] && key < shops[mid +1]) { 
				return mid +1 ;
			}
			else if (key < shops[mid] && key > shops[mid-1]) { 
				return mid ; 
			}
			else if (key < shops[mid]) { 
				end = mid ; 
				mid = (start + end ) / 2 ;
			}
			else if (key > shops[mid]) { 
				start = mid ; 
				mid = (start + end ) / 2 ;

			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in)) ; 
		
		int n = Integer.parseInt(br.readLine()) ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()); 
		int [] shops = new int [n] ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			shops[i] = Integer.parseInt(stt.nextToken()); 
		}
		Arrays.sort(shops );
		int days = Integer.parseInt(br.readLine()) ;
		memo = new int [shops[n-1]+1] ; 

		for (int i = 0 ; i < days ; i ++ ) { 
			int d = Integer.parseInt(br.readLine()) ;
			int where = Arrays.binarySearch(shops, d ) ;
			if (where >=0 ) { 
				if (memo[d]== 0 ) {
				for ( ; where < shops.length ; where ++ ) { 
					if (shops[where ] > d){
						break ; 
					}
				}
				memo[d] = where  ;
				}
				else {
					where = memo[d] ; 
				}
				System.out.println(where );
			}
			else { 
				if (d > shops[n-1]){

					System.out.println(n);
				}
				else if (d< shops[0]){
					System.out.println(0);}
				
				else 
					System.out.println(binSearch(shops, d));
			}
		}
		
	}

}
