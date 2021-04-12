package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class D264_Colorful_Graph {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int m = Integer.parseInt(stt.nextToken());
		int[] colors = new int[n + 1];
		stt = new StringTokenizer(br.readLine());
		int mm = Integer.MAX_VALUE;
		TreeMap<Integer, ArrayList<Integer>> reg = new TreeMap<>();
		for (int i = 1; i <= n; i++) {
			colors[i] = Integer.parseInt(stt.nextToken());
			mm = mm < colors[i] ? mm : colors[i];
			if (reg.containsKey(colors[i])) {
				reg.get(colors[i]).add(i);
			} else {
				int h = i;
				reg.put(colors[i], new ArrayList<Integer>() {
					{
						add(h);
					}
				});
			}
		}

		TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();

		while (m-- > 0) {
			stt = new StringTokenizer(br.readLine());
			int p1 = Integer.parseInt(stt.nextToken());
			int p2 = Integer.parseInt(stt.nextToken());
			if (colors[p1] != colors[p2]) {
				if (map.containsKey(colors[p1])) {
					map.get(colors[p1]).add(colors[p2]);
				} else {
					map.put(colors[p1], new TreeSet<Integer>() {
						{
							add(colors[p2]);
						}
					});
				}
				if (map.containsKey(colors[p2])) {
					map.get(colors[p2]).add(colors[p1]);

				} else {
					map.put(colors[p2], new TreeSet<Integer>() {
						{
							add(colors[p1]);
						}
					});
				}
			}
		}

		int diversity = -1;
		int min = Integer.MAX_VALUE;
		if (map.size() == 0) {
			min = mm;
		} else {
			for (Map.Entry<Integer, TreeSet<Integer>> e : map.entrySet()) {
				
				if (diversity < e.getValue().size())  {
					diversity = e.getValue().size() ; 
					min = e.getKey() ; 
				}
				
			}
		}
		System.out.println(min);
	}

}
