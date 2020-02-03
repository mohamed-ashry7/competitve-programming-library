import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12405_Scarecrow {

public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		int n = Integer.parseInt(br.readLine()) ; 
		
		for (int i = 1 ; i <= n ; i ++ ) { 
			
			int len =  Integer.parseInt(br.readLine()) ; 
			String field = br.readLine() ; 
			int scarecrow = 0 ; 
			for (int j = 0 ; j < field.length() ; j ++ ) { 
				if (field.charAt(j ) == '.') { 
					scarecrow ++ ; 
					j+=2 ; 
				}
			}
			System.out.println("Case "+i+": "+scarecrow);
			
		}
	}

}
