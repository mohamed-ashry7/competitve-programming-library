package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class C812_Sagheer_and_Nubian_Market {
	static long[] a;

	public static long sum(int k) {
		
		PriorityQueue<Long> set = new PriorityQueue<>();
		for (int j = 1; j < a.length; j++) {
			long num =a[j] +(long)j*k   ; 
			set.add(num);
			
		}
		long sum = 0l;
		int i = 1;
		
		while (i++ <= k ) {
			sum += set.poll() ; 

		}
	
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		long s = Long.parseLong(stt.nextToken());
		stt = new StringTokenizer(br.readLine());
		a = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = Long.parseLong(stt.nextToken());
		}
//		System.out.println(Arrays.toString(a).replaceAll("[\\[\\],]", "").substring(2));
		int low = 1;
		int high = n;
		int mid = (low + high) / 2;
		long sum = 0l;
		while (low <= high) {
			sum = sum(mid);
			if (sum == s || mid >= n) {
				break;
			} else if (sum > s) {
				high = mid - 1;
				mid = (low + high) / 2;
			} else {
				long suma = sum(mid + 1);
				if (suma < s) {
					low = mid + 1;
					mid = (low + high) / 2;
					sum = suma ; 
				} else if (suma == s) {
					sum = suma;
					mid++;
					break;
				} else {
					break;
				}
			}

		}
		if (sum <= s)
			System.out.println(mid + " " + sum);
		else
			System.out.println(0 + " " + 0);
	}

//	static class pair  {
//
//		int price;
//		int index;
//		int k;
//
//		public pair(int p, int i, int k) {
//			price = p;
//			index = i;
//			this.k = k;
//		}
//
//		int getPrice() {
//			return price;
//		}
//
//		int getIndex() {
//			return index;
//		}
//
//		int getK() {
//			return k;
//		}
//
//		long getSum() {
//			return (long) this.getIndex() * this.getK() + this.getPrice();
//		}
//
//		public int compareTo(pair o) {
//			return (int) (this.getSum() - o.getSum());
//		}
//
//		public String toString() {
//			return this.price + " , " + this.index;
//		}
//
//	}
}
