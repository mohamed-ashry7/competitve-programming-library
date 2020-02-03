package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class A350_Banana {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String wan = br.readLine() ; 
		int n = Integer.parseInt(br.readLine()) ;
		TreeMap<Character,Integer > map = new TreeMap<>() ; 
		for (int i = 0 ; i < wan.length() ; i ++ ) { 
			char c = wan.charAt(i) ;
			if (map.containsKey(c)) { 
				int freq = map.get(c)+1  ;
				map.put(c, freq)  ;
 			}
			else {
				map.put(c, 1) ; 
			}
		}
		if (map.keySet().size() > n) { 
			System.out.println(-1);
		}
		else if (map.keySet().size() == n ) { 
			System.out.println(Collections.max(map.values()));
			System.out.println(map.keySet().toString().replaceAll("[\\[,\\] ]", ""));
		}
		else { 
			String tar = map.keySet().toString().replaceAll("[\\[,\\] ]", "") ;  
			int k = n- tar.length(); 
			PriorityQueue<Char> pq = new PriorityQueue<>() ; 
			for (Map.Entry<Character, Integer> e : map.entrySet()) { 
				if (e.getValue()>1) { 
					pq.add(new Char(e.getKey() , e.getValue()-1))  ;
				}
				map.put(e.getKey(), 1) ; 
				
			}
			while (k-->0 && pq.size() > 0 ) { 
				Char p = pq.poll() ; 
				p.update(); 
				int v = map.get(p.getC())+1 ;
				map.put(p.getC(), v) ;
				if (p.getF() >0) { 
					pq.add(p)  ; 
				}
			}
			int i = -1 ; 
			while (k>0 && tar.length()< wan.length()) { 
				k-- ; 
				
				char c =  tar.charAt((++i)%tar.length()) ;
				int v = map.get(c) + 1 ; 
				map.put(c, v) ; 
			}
			tar = "" ; 
			for (int j = 0 ; j < wan.length()&& map.size()>0 ; ++ j ) { 
				char charAt = wan.charAt(j);
				if (map.containsKey(charAt)){
				tar = tar + new String(new char[map.get(charAt)]).replace('\0', charAt) ;
				map.remove(charAt) ; 
				}
			}
			System.out.println(tar);
		}
	}
	static class Char implements Comparable<Char>{
		char c ; 
		int f ; 
		public Char (char c , int f ) { 
			this.c = c ; 
			this.f = f ; 
		}
		int getF() { 
			return f ; 
		}
		char getC () { 
			return c ;
		}
		void update() { 
			this.f = this.f-1 ; 
		}
		@Override
		public int compareTo(Char o) {
			return o.getF() -this.f  ;
		}
		
	}
}
