import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P541_Error_Correction {

	public static void main(String[] args) throws  IOException {

		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in)) ; 
		while (true ) { 
			int n = Integer.parseInt(br.readLine()) ; 
			if (n== 0 )
				break ; 
			int [] rows = new int [n] ; 
			int [] col = new int [n] ; 
			for (int i = 0 ; i < n ; i ++ ) { 
				StringTokenizer line  = new StringTokenizer(br.readLine()) ; 
				for (int j = 0 ; j < n ; j ++ ) { 
					int x = Integer.parseInt(line.nextToken()) ; 
					rows[i] +=x ; 
					col[j]+=x ; 
				}
			}
			int r = 0 ; 
			int c = 0 ; 
			boolean corr = false ; 
			boolean ok = false ;
			boolean change = false ; 
			for (int i = 0 ; i < n ;  i ++ ) { 
				if (rows[i] % 2!= 0 ) { 
					if (r != 0 ) { 
						corr = true ; 
						break ; 
					}
					else { 
						r = i + 1 ; 
					}
				}
				if (col[i] % 2!= 0 ) { 
					if (c != 0 ) { 
						corr = true ; 
						break ; 
					}
					else { 
						c = i + 1 ; 
					}
				}
			}
			if (r == 0 ) {
				ok = true  ; 
				
			}
			else {
				change = true ; 
			}
			System.out.println(corr?"Corrupt":r==0 && c ==0 ?"OK" :"Change bit ("+r+","+c+")");
		}
	}

}
