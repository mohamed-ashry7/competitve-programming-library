package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class D545_Queue {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int all = n ; 
		StringTokenizer stt = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> p = new PriorityQueue<>();
		while (n-- > 0) {
			p.add(Integer.parseInt(stt.nextToken()));
		}
		ArrayList <Integer > a = new ArrayList<> () ; 
		while (!p.isEmpty()) { 
			a.add(p.poll()) ; 
		}
		
		int sum =a.remove(0) ;
		int satisfa = 1 ; 
		while (!a.isEmpty()) {
			boolean end = true ; 
			int i = 0 ; 
			for ( ; i < a.size() ; i ++ ) { 
				if (sum<=a.get(i)) {
					satisfa ++ ; 
					end = false ; 
					break ; 
				}
			}
			if (end ) { 
				break ;
			}
			sum+=a.remove(i) ; 
		}
		System.out.println(satisfa);

	}

}
