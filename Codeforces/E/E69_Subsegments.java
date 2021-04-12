package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class E69_Subsegments {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int k = Integer.parseInt(stt.nextToken());
		TreeSet<Integer> set = new TreeSet<>();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {

			if (i < k) {
				if (map.containsKey(a[i])) {
					int c = map.get(a[i]) + 1;
					map.put(a[i], c);
					set.remove(a[i]);
				} else {
					set.add(a[i]);
					map.put(a[i], 1);
				}
			} else {
				if (set.size() == 0) {
					System.out.println("Nothing");
				} else {
					System.out.println(set.last());
				}
				int v = map.get(a[i - k]) - 1;
				if (v == 0) {
					map.remove(a[i - k]);
					set.remove(a[i-k]) ; 
				} else {
					map.put(a[i - k], v);
					if (v== 1 ){
						set.add(a[i-k]) ; 
					}
				}
				
				if (map.containsKey(a[i])) {
					int c = map.get(a[i]) + 1;
					map.put(a[i], c);
					set.remove(a[i]);
				} else {
					set.add(a[i]);
					map.put(a[i], 1);
				}

			}

		}
		if (set.size() == 0) {
			System.out.println("Nothing");
		} else {
			System.out.println(set.last());
		}

	}

}
