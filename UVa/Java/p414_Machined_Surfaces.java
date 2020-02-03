import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class p414_Machined_Surfaces {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		while (true) { 

			int n = Integer.parseInt(br.readLine());
			if (n == 0 ) { 
				break ;
			}
			int [] a = new int [n] ; 
			for (int i =  0 ; i <n ; i ++ ) { 
				String x = br.readLine() ; 
				int space = x.indexOf(' ') ; 
				int xes = 0 ; 
				if (space != -1) { 
					String y = (x.substring(space)) ; 
					xes = y.indexOf('X') ; 
					a[i] = xes - space +x.substring(0,space).length(); 
				}
				else { 
					a[i] = 0 ; 
				}
				
				 
			}
			Arrays.sort(a);
			int len = 0 ; 
			for (int i = 1 ; i < a.length ; i ++ ) { 
				len += a[i] - a[0] ; 
			}
			out.println(len);
			out.flush();
		}
		out.close();

	}
}
