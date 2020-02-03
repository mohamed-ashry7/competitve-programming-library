package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class A1249_Yet_Another_Dividing_into_Teams {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int number = 1;
			StringTokenizer stt = new StringTokenizer(br.readLine());
			PriorityQueue<Integer> pq = new PriorityQueue<>() ;
			while (stt.hasMoreTokens()) {
				int next = Integer.parseInt(stt.nextToken());
				pq.add(next) ; 
			}
			int fir = pq.poll();
			while (!pq.isEmpty())  { 
				if(pq.peek()-fir ==1){
					number =2 ;
					break ; 
				}
				else {
					fir = pq.poll(); 
				}
			}
			System.out.println(number);

		}
	}

}
