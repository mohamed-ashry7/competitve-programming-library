import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1260_Sales {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out )) ; 
		
		int n = Integer.parseInt(br.readLine()) ; 
		for (int i = 0 ; i < n ; i ++ )  
		{
			int [] a = new int [Integer.parseInt(br.readLine()) ] ;
			int cum = 0 ; 
			int j= 0  ; 
			StringTokenizer stt = new StringTokenizer(br.readLine()) ;
			while (stt.hasMoreTokens()) { 
				a[j ] = Integer.parseInt(stt.nextToken()) ; 
				for (int k = 0 ; k<j ; k ++ ) { 
					if (a[k] <= a[j]) { 
						cum ++ ; 
					}
				}
				j++ ; 
			}
			bw.write(cum+"\n");
			bw.flush();
		}
		bw.close(); 
		br.close();
	}

}
