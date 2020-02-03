package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class A706_Beru_taxi {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int px = Integer.parseInt(stt.nextToken());
		int py = Integer.parseInt(stt.nextToken());		
		int n = Integer.parseInt(br.readLine()) ; 
		PriorityQueue<taxi> set = new PriorityQueue<>() ;
		for (int i = 0 ; i < n ; i ++ ) { 
			stt = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(stt.nextToken());
			int y = Integer.parseInt(stt.nextToken());	
			int speed = Integer.parseInt(stt.nextToken());	
			set.add(new taxi(x,y,speed,px,py)) ; 

		}
		System.out.println(set.poll().time());
	}
	
	
	static class taxi implements Comparable<taxi > { 
		int x ;
		int y ; 
		int speed ;
		
		public taxi (int x , int y , int speed , int px , int py  ) { 
			this.x = (int) (Math.abs(x-px)) ; 
			this.y = (int) (Math.abs(y-py)) ; 
			this.speed = speed ; 

		}
		public double time () { 
			
			double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) ; 
			return 1.0*d/speed ; 
		}
		@Override
		public int compareTo(taxi a) {
			
			return this.time() - a.time() > 0 ? 1 : this.time() - a.time() < 0 ? -1 : 0  ;
		} 
		
	}

}
