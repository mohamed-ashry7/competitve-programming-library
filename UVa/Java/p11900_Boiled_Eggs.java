import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11900_Boiled_Eggs {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		int n = Integer.parseInt(br.readLine()) ; 
		
		for (int e = 1 ; e <= n ; e ++ ) { 
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int eggs = Integer.parseInt(stt.nextToken()) ; 
			int p = Integer.parseInt(stt.nextToken()) ; 
			int q = Integer.parseInt(stt.nextToken()) ; 
			stt = new StringTokenizer(br.readLine()) ; 
			int picked = 0 ; 
			int weights = 0 ; 
			for (int i = 0 ; i <p &&  weights <q  && i < eggs ;  i ++   ) { 
				int theEgg = Integer.parseInt(stt.nextToken()) ; 
				weights += theEgg ; 
				if (weights <= q) { 
					picked ++ ; 

				}
				else { 
					break ; 
				}
			}
			System.out.println("Case "+e+": "+picked);

		}
	}

}
