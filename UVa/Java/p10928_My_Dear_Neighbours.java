import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p10928_My_Dear_Neighbours {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n-->0) { 
			int p = Integer.parseInt(br.readLine());
			PriorityQueue<Pair> pp = new PriorityQueue<>() ; 
			for (int i = 1 ; i <=p  ; i ++ ) { 
				pp.add(new Pair (i , new StringTokenizer(br.readLine()).countTokens())) ; 
			}
			
			int min = pp.peek().getNeiboughrs() ; 
			String places = "" ; 
			while (!pp.isEmpty() && min == pp.peek().getNeiboughrs()) { 
				places = places + " " +pp.poll().getP() ; 
			}

			System.out.println(places.trim());
			br.readLine() ; 

		}
		

	}

	
	static class Pair implements Comparable<Pair> { 
		int p ; 
		int neighbors ;
		public Pair (int p , int neigh) { 
			this.p = p ; 
			this.neighbors = neigh ; 
		}
		public int getNeiboughrs() { 
			return neighbors ;
		}
		public int getP(){
			return p ; 
		}
		@Override
		public int compareTo(Pair o) {
			return this.neighbors - o.neighbors == 0 ?p-o.p :this.neighbors-o.neighbors ; 
		}
		
		
	}
}
