package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class A105_Transmigration {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		StringTokenizer stt= new StringTokenizer(br.readLine());
		TreeMap<String, Integer> map = new TreeMap<>() ; 
		int n = Integer.parseInt(stt.nextToken()) ; 
		int m = Integer.parseInt(stt.nextToken()) ; 
		int k = Integer.parseInt(stt.nextToken().substring(2)) ; 
		for (int i = 0 ; i < n ; i ++  ) { 
			stt = new StringTokenizer(br.readLine()) ;
			String skill = stt.nextToken() ; 
			int power = Integer.parseInt(stt.nextToken()) * k / 100 ; 
			if (power >=100){
				map.put(skill,power  ) ; 
			}
		}
		for (int i = 0 ; i < m ; i ++ ) { 
			String skill = br.readLine() ; 
			if (!map.containsKey(skill)){
				map.put(skill, 0) ; 
			}
		}
		System.out.println(map.size());
		for (Map.Entry<String, Integer > e : map.entrySet()) { 
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
