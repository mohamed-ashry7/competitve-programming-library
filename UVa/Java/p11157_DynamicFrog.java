import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p11157_DynamicFrog {

	
		
		
		
		

	
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in )) ; 
		int n = Integer.parseInt( br.readLine()) ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			StringTokenizer stt = new StringTokenizer (br.readLine()) ; 
			int numberRocks = Integer.parseInt(stt.nextToken()) ; 
			int distance  = Integer.parseInt(stt.nextToken()) ; 
			stt = new StringTokenizer(br.readLine()) ; 
			Rock [] even = new Rock[numberRocks] ; 
			int j = 0 ; 
			while (stt.hasMoreTokens()) { 
				even[j++ ] = new Rock (stt.nextToken()) ; 
			}
			Rock [] odd =even.clone(); 
			int par = 0 ;
			for (int k = 0 ; k < even.length ; k ++ ) { 
				if (even[k].getType()=='S') { 
					if (par== 0) { 
						odd[k] = null ; 
						par = 1 ; 
								
					}
					else {
						even[k] = null ; 
						par = 0 ; 
					}
				}
			}
			if (numberRocks == 1 ) {
				if (even[0].getType() == 'B') { 
					int d1 = even[0].getPosition() ; 
					int d2 = distance- even[0].getPosition() ; 
					System.out.println(d1>d2?d1 :d2);
				}
				else {
					System.out.println(distance);
				}
				
			}
			else { 
			int max1 = - 1 , max2 = -1 ; 
	
			Rock now = even[0] ; 
			int k = 1 ; 
			if (now == null ){
				now = even[1] ; 
				max1 = even[1].getPosition() ;
				k = 2 ; 
			}
			else {
				max1 = even[0].getPosition() ;

			}
			for ( ; k < even.length ; k ++ ) { 
				Rock cur = even[k] ; 
				if (cur == null ) { 
					k++ ; 
				}
				else {
					int df = cur.getPosition() - now .getPosition() ; 
					if (max1 < df ) { 
						max1 = df ; 
					}
					now = even[k] ; 
				}
			}
			if ((distance - now.getPosition()) > max1 ) { 
				max1 = distance - now.getPosition()  ; 
			}
			
			now = odd[0] ; 
			k = 1 ; 
			if (now == null ){
				now = odd[1] ; 
				max2 = odd[1].getPosition() ;
				k = 2 ; 
			}
			else {
				max2 = odd[0].getPosition() ;

			}
			for ( ; k < odd.length ; k ++ ) { 
				Rock cur = odd[k] ; 
				if (cur == null ) { 
					k++ ; 
				}
				else {
					int df = cur.getPosition() - now .getPosition() ; 
					System.out.println(df);
					if (max2 < df ) { 
						max2 = df ; 
					}
					now = odd[k] ; 
				}
			}
			if ((distance - now.getPosition()) > max2 ) { 
				max2 = distance-now.getPosition()  ; 
			}
			
			System.out.println(max1>max2? max1 : max2);
			
			}
		}
		
	}
	
	static class Rock {
		char  type ; 
		int dis ; 
		
		public Rock (String rock ) {
		
			this.type = rock.charAt(0) ; 
			this.dis = Integer.parseInt(rock.substring(2)) ; 
		}
		public int  getPosition () { 
			
			return dis ; 
		}
		public char getType()  {
			return type ; 
		}
	}

}
