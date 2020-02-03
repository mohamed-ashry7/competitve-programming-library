import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p514_Rails {

	public static void main(String[] args) throws IOException {


		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		
		
		
		while (true ) { 
			int n = Integer.parseInt(br.readLine()) ; 
			if (n== 0) { 
				break ; 
			}
			while (true ) { 
				Stack <Integer> ss = new Stack<Integer> () ; 
				String kk = br.readLine() ; 
				StringTokenizer st = new StringTokenizer(kk) ; 
				 
				if (kk.charAt(0)=='0') { 
					break ; 
			}
				boolean ye = true ; 
				while (st.hasMoreTokens()) { 
					int t = Integer.parseInt(st.nextToken()) ;
					if (ss.isEmpty()) { 
						ss.push(t) ; 
					}
					else { 
						if (t<=ss.peek()) { 
							ss.push(t) ; 
						}
						else { 
							while (!ss.isEmpty() && t> ss.peek()) { 
								ss.pop() ; 
							}
							if (ss.size() != 0 ) { 
								ye = false ;
							}
						}
					}
				}
				if (ye ){ 
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
				
			}
			System.out.println();
			
		}
	}

}
