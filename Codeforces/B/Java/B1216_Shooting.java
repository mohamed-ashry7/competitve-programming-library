package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1216_Shooting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer stt = new StringTokenizer(br.readLine() ) ; 
		PriorityQueue<Pair> pq = new PriorityQueue<>() ;
		int x =  0; 
		int i = 1 ; 
		while (stt.hasMoreTokens()) { 
			pq.add(new Pair(Integer.parseInt(stt.nextToken()) , i++)) ; 
		}
		int cost = 0 ; 
		
		String wan = "" ; 
		while (pq.size() > 0 ) { 
			Pair p = pq.poll() ; 
			cost += (x*p.getValue() + 1 ) ; 
			x++ ; 
			wan = wan  + p.getIndex() + " " ; 
		}
		System.out.println(cost+"\n"+wan.trim());
	
	
	}
	
	static class Pair implements Comparable<Pair> {

		int value ; 
		int index ; 
		public Pair(int value , int index ) { 
			this.value = value ; 
			this.index = index ; 
		}
		int getValue () { 
			return value ; 
		}
		int  getIndex () { 
			return index; 
		}
		public int compareTo(Pair arg0) {
			return arg0.getValue() - this.getValue()  ;
		} 
		
	}

}
