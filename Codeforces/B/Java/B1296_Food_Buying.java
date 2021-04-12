package notAdded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1296_Food_Buying {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		int t = Integer.parseInt(br.readLine());
		while (t-->0) {
			int burles = Integer.parseInt(br.readLine());
			int spent  = 0 ; 
			while (true ) { 
				if (burles%10 == burles) {
					spent+=burles ; 
					break ; 
				}
				if (burles%10 == 0 ) { 
					spent += burles ; 
					burles = burles/10 ; 
				}
				else { 
					int aside = burles%10 + burles/10 ; 
					spent += (burles/ 10)*10 ;
					burles = aside ; 
				}
			}
			System.out.println(spent);
		}
	}

}
