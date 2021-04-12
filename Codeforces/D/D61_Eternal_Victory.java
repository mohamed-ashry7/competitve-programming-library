package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class D61_Eternal_Victory {
	static PriorityQueue<Pair> Graph[];
	static int Cost;
	static TreeSet<Integer> visited;
	static int n;
	static int parent[];
	static int cum[];
	static int Distance = -1;
	static int edges[];

	
	static void DFS(int s) {
		if (visited.contains(s) || visited.size() == n - 1) {
			return;
		}
		PriorityQueue<Pair> a = Graph[s];
		while (a.size() > 0) {
			Pair p = a.poll();
			visited.add(s);
			int city = p.getCity();
			
			if (!visited.contains(city)){
				parent[city] = s;
				cum[city] = cum[s] + p.getWeight();
				edges[city] = p.getWeight();
				DFS(city);
			}

		}

	}

	static long getTheDistance() {
		DFS(1);
		int farthestCity = -1;
		long distance = -1;
		for (int i = 1; i < cum.length; ++i) {
			if (cum[i] > distance) {
				farthestCity = i;
				distance = cum[i];
			}
		}
		distance = 0;
		while (farthestCity != 1) {
			distance += edges[farthestCity];
			edges[farthestCity] = 0;
			farthestCity = parent[farthestCity];

		}
		for (int i = 1; i < edges.length; ++i) {
			distance += edges[i] * 2;
		}
		return distance ; 
	}

	static void addPair(int a, int b, int w) {
		if (Graph[a] == null) {
			PriorityQueue<Pair> pairs = new PriorityQueue<>();
			pairs.add(new Pair(b, w));

			Graph[a] = pairs;
		} else {
			Graph[a].add(new Pair(b, w));
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		Graph = new PriorityQueue[n + 1];
		parent = new int[n + 1];
		cum = new int[n + 1];
		edges = new int[n + 1];
		visited = new TreeSet<>();
		Cost = 0;
		for (int i = 1; i < n; i++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stt.nextToken());
			int b = Integer.parseInt(stt.nextToken());
			int w = Integer.parseInt(stt.nextToken());
			addPair(a, b, w);
			addPair(b, a, w);

		}
		System.out.println(getTheDistance());
	}

	static class Pair implements Comparable<Pair> {
		int c;
		int w;

		public Pair(int c, int w) {
			this.c = c;
			this.w = w;
		}

		public int getCity() {
			return c;
		}

		public int getWeight() {
			return w;
		}

		public String toString() {
			return String.format("(%d , %d)", this.c, this.w);
		}

		@Override
		public int compareTo(Pair p) {
			return this.w - p.getWeight();
		}
	}
}
