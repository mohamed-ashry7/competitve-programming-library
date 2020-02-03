package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class B1249_Books_Exchange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] students = new int[n + 1];
			StringTokenizer stt = new StringTokenizer(br.readLine());
			for (int i = 1; i < n + 1; ++i) {
				students[i] = Integer.parseInt(stt.nextToken());
			}
			int[] days = new int[n + 1];
			for (int i = 1; i <= n; ++i) {

				int day = 1;
				int receiver = students[i];
				TreeSet<Integer> set= new TreeSet<>() ;
				if (days[i]!=0){
					continue ;
				}
				
				set.add(i) ;
				while (i != receiver ) {
					set.add(receiver);
					receiver = students[receiver];
					day++;
				}
				Iterator<Integer> it = set.iterator();
				while (it.hasNext()) {
					days[it.next()] = day;
				}
				
			}
			System.out.println(Arrays.toString(days).replaceAll("[\\[,\\]]", "").substring(2));
		}
	}

}
