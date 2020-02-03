import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class p10295_Hay_Points {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ; 
		String nums = br.readLine() ; 
		StringTokenizer ss = new StringTokenizer(nums) ; 
		int m = Integer.parseInt(ss.nextToken()) ; 
		int n = Integer.parseInt(ss.nextToken()) ; 
		TreeMap<String, Integer > hay = new TreeMap<>() ; 
		for (int i = 0 ; i < m ;  i ++ ) { 
			String thing = br.readLine() ; 
			StringTokenizer st = new StringTokenizer(thing) ; 
			hay.put(st.nextToken(), Integer.parseInt(st.nextToken())) ; 
		}
		for (int i = 0 ; i  < n ; i ++ ) { 
			int pts = 0 ; 
			while (true ){
				String line = br.readLine() ; 
				if (line.equals(".")) { 
					break ; 
				}
				StringTokenizer stt = new StringTokenizer(line) ; 
				while (stt.hasMoreTokens()) { 
					String token = stt.nextToken() ; 
					if (hay.containsKey(token))
						pts+=hay.get(token).intValue() ; 
				}
			}
			System.out.println(pts);
		}
		
	}

}
