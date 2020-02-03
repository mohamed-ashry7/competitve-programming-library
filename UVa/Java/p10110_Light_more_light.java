import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10110_Light_more_light {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true )  { 
			long n = Long.parseLong(br.readLine()) ; 
			if (n==0) { 
				break; 
			}
			int c = 0 ; 
			for (int i = 1 ; i <=n/2; ++i  ) { 
				if (n%i==0)c++ ; 
			}
		
			System.out.println(c%2==0?"no":"yes");
		}

	}

}
