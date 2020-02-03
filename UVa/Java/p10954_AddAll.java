import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p10954_AddAll {

	
	
	
	
	
	public static void main(String[] args) throws IOException{
			
		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		
		
		while (true ) {
			
			int n = Integer.parseInt(br.readLine()) ; 
			if (n==0)
				break ; 
			StringTokenizer line = new StringTokenizer(br.readLine()) ;
			PriorityQueue<Integer> numbers = new PriorityQueue<>() ;
			while (line.hasMoreTokens()) { 
				numbers.add(Integer.parseInt(line.nextToken())) ; 
			}
			ArrayList<Integer> costs = new ArrayList<>();  
			while (numbers.size()>1) { 
				int cost = numbers.poll()+numbers.poll() ; 
				numbers.add(cost) ;
				costs.add(cost) ; 
			}
			int all = 0 ; 
			for (int i = 0 ; i < costs.size() ; i ++ ) { 
				all+=costs.get(i) ; 
			}
			System.out.println(all);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
