package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class A1213_Chips_Moving {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) ;
		int [] a = new int [n] ; 
		TreeSet<Integer> pos = new TreeSet<>() ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
		
		for (int i = 0; i < n ; ++i  ) { 
			a[i] = Integer.parseInt(stt.nextToken()) ;
			pos.add(a[i]) ; 
		}
		Iterator<Integer> it = pos.iterator() ; 
		int min = Integer.MAX_VALUE ; 
		while (it.hasNext()) { 
			int next = it.next() ; 
			int calc = 0 ; 
			for (int i = 0 ; i < n ; i ++ ) { 
				calc += Math.abs(a[i]-next)%2 ; 
			}
			if (calc<min) { 
				min = calc ; 
			}
		}
		System.out.println(min);
	}

}
