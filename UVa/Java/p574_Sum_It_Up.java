import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class p574_Sum_It_Up {

	static int n;
	static int[] a;
	static int GOAL;
	static int SIZE;
	static int[] chosen;
	static TreeSet<String> set ; 

	static String processSolution() {
		String wan = "";
		for (int i = 0; i < chosen.length; i++) {
			
			
			if (chosen [i] == 1 ) { 
				wan += a[i] + "+" ; 
			}
		}
		if (wan.length() == 0 ) 
			return ""  ; 
		return wan.substring(0,wan.length()-1);
	}

	
	static void backtracking (int start , int accSum ) { 
		if (accSum == GOAL) { 
			String sol = processSolution() ; 
			if (!set.contains(sol) ) { 
				set.add(sol);
				System.out.println(sol);
				return ; 
			}
			
		}
		
		for (int i = start ; i < a.length ; i ++ ) { 
			
			 if (accSum > GOAL) { 
				return ; 
			}
			else {
				chosen[i] = 1 ; 
				backtracking(i+1, accSum + a[i]);
				chosen[i] = 0 ; 
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			StringTokenizer stt = new StringTokenizer(line);
			GOAL = Integer.parseInt(stt.nextToken());
			n = Integer.parseInt(stt.nextToken());
			if (n + GOAL == 0) {
				break;
			}
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(stt.nextToken());

			}
			set= new TreeSet<>() ; 
			chosen = new int [n] ; 
			System.out.println("Sums of " + GOAL+":");
			backtracking(0, 0);
			if (set.size() == 0 ) { 
				System.out.println("NONE");
			}
		}
	}

}
