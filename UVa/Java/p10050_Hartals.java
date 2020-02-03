import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class p10050_Hartals {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int p = Integer.parseInt(br.readLine());
			int parties[] = new int[p];
			for (int i = 0; i < p; ++i) {
				parties[i] = Integer.parseInt(br.readLine());
			}
			TreeSet<Integer> strikes = new TreeSet<>();
			TreeSet<Integer> offs = new TreeSet<>() ; 
			int saturday = 7;
			
			while (saturday<=n+1) { 
				offs.add(saturday) ; 
				offs.add(saturday-1) ; 
				saturday+=7 ; 
			}
			for (int i = 0; i < p; i++) {
				int m = parties[i];
				
				for (int j = m; j <= n; j += m) {
					if (!offs.contains(j) ) {
						strikes.add(j);
					}
					
				}
				
			}
			System.out.println(strikes.size());
		}

	}

}
