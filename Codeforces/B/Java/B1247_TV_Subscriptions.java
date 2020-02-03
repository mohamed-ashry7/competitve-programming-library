package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class B1247_TV_Subscriptions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n  = Integer.parseInt(stt.nextToken()) ; 
			int k  = Integer.parseInt(stt.nextToken()) ; 
			int d  = Integer.parseInt(stt.nextToken()) ; 
			TreeMap<Integer,Integer> map = new TreeMap<>(); 
			Queue<Integer>qq = new LinkedList<>() ; 
 			stt = new StringTokenizer(br.readLine());
			int min =(int) 1e9 ; 
			for (int i = 0 ; i< n ; ++i ) {
				int e = Integer.parseInt(stt.nextToken()) ;
				if (i<d) { 
					if (map.containsKey(e)) { 
						int occ = map.get(e)+1 ;
						map.put(e, occ) ; 
					}
					else {
						map.put(e, 1) ;
					}
					qq.add(e); 
					
				}
				else {
					min = Math.min(min, map.keySet().size()); 
					int polled = qq.poll() ; 
					if (map.get(polled) == 1) { 
						map.remove(polled) ; 
					}
					else {
						int occ = map.get(polled)-1 ;
						map.put(polled, occ) ; 
					}
					if (map.containsKey(e)) { 
						int occ = map.get(e)+1 ;
						map.put(e, occ) ; 
					}
					else {
						map.put(e, 1) ;
					}
					qq.add(e) ;
					min = Math.min(min, map.keySet().size()); 

				}
			}
			min = Math.min(min, map.keySet().size()); 
			System.out.println(min);

		}

	}

}
