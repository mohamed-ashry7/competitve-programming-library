import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10340_All_in_All {

	public static void main(String[] args) throws IOException {

		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		
		
		while (true ) {
			String line = br.readLine() ; 
			if (line == null ) {
				break ; 
			}
			StringTokenizer stt = new StringTokenizer(line ) ; 
			String fir = stt.nextToken() ; 
			String sec = stt.nextToken() ; 
			boolean flag = false ;
			for (int j = 0 , k = 0 ; j < fir.length() && k <sec.length() ; k ++) { 
				if (fir.charAt(j) == sec.charAt(k)) { 
					if (j == fir.length()-1) { 
						flag = true ; 
					}
					j++ ; 
					
				}
			}
			System.out.println(flag ? "Yes" : "No");
			
		}
		br.close();
	
	}

}
