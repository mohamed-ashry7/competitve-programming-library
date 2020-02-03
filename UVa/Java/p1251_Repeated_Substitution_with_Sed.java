import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1251_Repeated_Substitution_with_Sed {
	static String [] keys ;
	static String [] subs ;
	static String Goal ; 
	static int MIN ; 
	
	
	static void  backtrack (String cur , int times ) { 
		if (cur.equals(Goal ) ) { 
			if (times < MIN) { 
				MIN = times ; 
			}
			return ; 
		}
		if (cur.length() >  Goal.length() ) 
			return ; 
		for (int i = 0 ; i <keys.length ; i ++ ) { 
			if (cur.contains(keys[i])){
				String next = cur.replace(keys[i], subs[i]) ;
				backtrack(next, times +1 ) ; 
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while (true ) { 
			int n = Integer.parseInt(br.readLine());
			if (n== 0 ) { 
				break ; 
			}
			keys = new String [n] ; 
			subs = new String [n] ; 
			MIN = 100000000; 
			for (int i = 0 ; i < n ; i ++  ) { 
				StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
				keys[i] = stt.nextToken() ; 
				subs[i] = stt.nextToken() ; 
			}
			String fir = br.readLine() ; 
			Goal = br.readLine() ; 
			backtrack(fir, 0);
			if (MIN == 100000000) { 
				System.out.println(-1);
			}
			else {
				System.out.println(MIN);
			}
		}
	}

}
