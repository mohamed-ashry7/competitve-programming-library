package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class D1_1213_Equalizing_by_Division {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int m = Integer.parseInt(stt.nextToken());
		stt = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		int uniques = 0;
		int maxE = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int zeros = 0;
		for (int i = 0; i < n; ++i) {
			int num = Integer.parseInt(stt.nextToken());
			if (map.containsKey(num)) {
				int c = map.get(num) + 1;
				map.put(num, c);
			} else {
				if (maxE < num) {
					maxE = num;
				}
				a[uniques] = num;
				++uniques;
				map.put(num, 1);
			}
		}
		int min = (int) 1e6;
		int cum = m;
		for (int i = 0; i < uniques; ++i) {
			if (map.get(a[i]) >= m) {
				min = 0;
				break;
			} else if (a[i] != 0) {
				int diff = m - map.get(a[i]);
				if (cum > 0 ) {
					int loggy = a[i];
					int div = (int) (Math.log(loggy) / Math.log(2)) + 1;
					if (map.get(a[i]) > cum)
					{
						zeros += div*cum ; 
						cum -= a[i] ; 
						
					}
					else { 
						zeros += div * map.get(a[i]) ; 
						cum -= a[i] ; 
					}
				}
				/*
				 * change it to check all the higher ; 
				 */
				int d1 = a[i] * 2;
				int d2 = a[i] * 2 + 1;
				int mul = 0;
				int factor = 1;
				while (d1 <= maxE || d2 <= maxE) {
					int d3 = (d1+d2)/2 ; 
					if (map.containsKey(d1)) {
						int v1 = map.get(d1);
						if (v1 >= diff) {
							mul += diff * factor;
							diff -= v1;
							break;
						} else {
							mul += v1 * factor;
							diff -= v1;
						}
					}
					if (map.containsKey(d2)) {
						int v2 = map.get(d2);
						if (v2 >= diff) {
							mul += diff * factor;
							diff -= v2;
							break;
						} else {
							mul += v2 * factor;
							diff -= v2;
						}
					}
					if (d1!= d3 && d2 != d3) { 
						
					}
					d1 *= 2;
					d2 *= 2;
					++factor;
				}
				if (diff <= 0) {
					min = Math.min(min, mul);
				}
			}
		}
		min = Math.min(min, zeros) ; 
		System.out.println(min);
		// This might be a greedy solution ;
		// int min = 1000;
		// int theChosen = 0;
		// int max = 1;
		// int mostRep = 0;
		// int theBiggest = 0;
		// for (int i = 0; i < n; ++i) {
		// a[i] = Integer.parseInt(stt.nextToken());
		// if (a[i] > theBiggest) {
		// theBiggest = a[i];
		// }
		// if (map.containsKey(a[i])) {
		// int c = map.get(a[i]) + 1;
		// if (Math.abs(c - m) < min) {
		// theChosen = a[i];
		// min = Math.abs(c - m);
		// }
		// if (max < c) {
		// max = c;
		// mostRep = a[i];
		// }
		// map.put(a[i], c);
		// } else {
		// map.put(a[i], 1);
		// }
		// }
		// if (max >= m) {
		// System.out.println(0);
		// } else {
		// boolean enter = false;
		// ArrayList<Integer> no = new ArrayList <>() ;
		// if (theBiggest != theChosen) {
		// int count = 0;
		// int d1 = 2 * theChosen;
		// int d2 = 2 * theChosen + 1;
		// while (d1 <= theBiggest || d2 <= theBiggest) {
		// if (map.containsKey(d1)) {
		// count += map.get(d1);
		// }
		// if (count >= min) {
		// break;
		// }
		// if (map.containsKey(d2)) {
		// count += map.get(d2);
		// }
		// if (count >= min) {
		// break;
		// }
		// d1 *= 2;
		// d2 *= 2;
		// }
		// if (count < min ) {
		// enter = true ;
		// }
		// else {
		// System.out.println(min );
		// }
		// } else {
		// no.add(theChosen) ;
		// enter = true ;
		// }
		// if (enter ) {
		// for (Map.Entry<Integer, Integer> e : map.entrySet()) {
		// if (e.getKey() != theBiggest && !no.contains(e.getKey())) {
		//
		// }
		// }
		// }
		// }

	}

	// static class Nucleus implements Comparable<Nucleus> {
	// int element ;
	// int freq ;
	// public Nucleus(int element ) {
	// this.element = element ;
	// freq = 1 ;
	// }
	// public int getFreq () {
	// return freq ;
	// }
	// public void increase () {
	// this.freq = this.freq + 1 ;
	// }
	// public int compareTo(Nucleus n1) {
	// return n1.getFreq() - this.getFreq() ;
	// }
	//
	// }
}
