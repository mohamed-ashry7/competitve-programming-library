package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class A768_Oath_of_the_Nights_Watch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine()) ;
		TreeMap<Integer,Integer> map = new TreeMap<>() ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
		for (int i = 0 ; i < n ; ++i ) { 
			int a  = Integer.parseInt(stt.nextToken()) ; 
			if (map.containsKey(a)) { 
				int v = map.get(a)+1 ;
				map.put(a, v) ; 
			}
			else {
				map.put(a, 1) ; 
			}
		}
		
		int  c = 0 ; 
		map.pollFirstEntry() ; 
		map.pollLastEntry() ; 
		for (Map.Entry<Integer, Integer> e : map.entrySet()) { 
			c+= e.getValue() ; 
		}
		System.out.println(c);
	}

}
