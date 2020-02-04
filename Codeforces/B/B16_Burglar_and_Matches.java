package notAdded;

import java.util.Scanner;
import java.util.TreeMap;

public class B16_Burglar_and_Matches {

	public static void main(String[] args) {
		
		
		Scanner ss = new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int m = ss.nextInt() ; 
		TreeMap<Integer,Integer> map = new TreeMap<>() ; 
		int matches = 0 ; 
		for (int i = 0 ; i < m ; ++ i) { 
			int numberBoxes = ss.nextInt() ; int numberMatches = ss.nextInt() ; 
			int prev = 0; 
			if (map.containsKey(numberMatches) ) { 
				prev = map.get(numberMatches); 
			}
			prev += numberBoxes; 
			map.put(numberMatches, prev) ; 
		}
		
		while(n>0 && !map.isEmpty()) { 
			matches += map.lastKey()*
					Math.min(map.lastEntry().getValue(), n);
			n-=map.lastEntry().getValue() ; 
			map.pollLastEntry(); 
			
		}
		System.out.println(matches);
	}

}
