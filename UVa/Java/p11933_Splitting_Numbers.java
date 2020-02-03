import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		String  x ; 
		 
		while (true  ) { 
			x = br.readLine() ; 
			int  n = Integer.parseInt(x) ;
			if (n== 0 ) { 
				break ; 
			}
			int   num1 =0; 
			int   num2 =0;
			boolean ist = true  ;
			int m = n ; 
			int j = 0 ; 
			while ( m  != 0  ) { 
				if ( (n & (1<<j )) != 0 ) { 
					if (ist ) { 
						num1 = num1 | (1<<j)  ; 
						ist =false ; 
					}
					else {
						num2= num2 | (1<<j)  ; 
						ist = true ; 
					}
				}
				
				m = m>> 1 ;
				j++ ; 
			}
			System.out.println(num1 + " " + num2 );
		
		}
		
		
		
		
		
		
	}

}
