package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class B702_powersOfTwo {
	public static boolean isPow(long a, long b) {
		long c = a + b;
		return (c & (c - 1)) == 0 ? true : false;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer stt = new StringTokenizer(br.readLine());
		TreeMap<Long, Integer> map = new TreeMap<>();
		long p = 0;
		for (int i = 0; i < n; i++) {
			long number = Long.parseLong(stt.nextToken());
			if (map.containsKey(number)) {
				int val = map.get(number) + 1;
				map.put(number, val);
			} else {
				map.put(number, 1);
			}
		}
		ArrayList<Map.Entry<Long, Integer>> list = new ArrayList<>(map.entrySet());
		long a =1l<<31 ; 
		while (list.size() > 0 ) {
			long num1 = list.get(0).getKey();
			int v = list.get(0).getValue();

			if (isPow(num1, num1)) {
				
				long added =(long) ((long )v * ((long)v - 1));
				added /= 2;
				p += added;
			}
			for (long pow = 2; pow <= a ; pow<<=1) {
				long diff = pow - num1 ; 
				if (map.containsKey(diff) && diff != num1 ) { 
					p+= map.get(diff)* v ; 
				}
			}
			list.remove(0);
			map.remove(num1) ; 
		}
		System.out.println(p);
	}

}
