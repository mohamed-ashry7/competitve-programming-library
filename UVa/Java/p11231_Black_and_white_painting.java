import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11231_Black_and_white_painting {

	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) { 
			StringTokenizer stt = new StringTokenizer(br.readLine()) ;
			int n = Integer.parseInt(stt.nextToken()) ; 
			int m = Integer.parseInt(stt.nextToken()) ; 
			int w = Integer.parseInt(stt.nextToken()) ; 
			if (n== 0 && m== 0  ) { 
				break ; 
			}
			int row = n-8 + 1 ; 
			int col = m-8 + 1 ; 
			int mult1 = row/2 ; 
			int mult2 = col/2 ; 
			long res = 0 ; 
			if (row%2 == 1 && col %2 ==1) { 
				if (w==1) { 
					res = (mult1+1)*(mult2+1) + mult1*mult2 ; 
				}
				else { 
					res = mult1*(mult2+1) + (mult1+1)*mult2; 
				}
			}
			else { 
				if (row%2 ==1) { 
					res = mult2*(mult1 + mult1+1);
				}
				else { 
					res = mult1*col ; 
				}
			}
	
			System.out.println(res);
			
		}
	}
}
