package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p11367_Full_Tank {

	static int[][] graph;
	static int[] fuels;
	static int INF = (int) 1e7;
	static int CAPACITY;


	static int djkstra(int S, int T) {
		int[][] dist = new int[graph.length][CAPACITY + 1];
		for (int i = 0; i < dist.length; i++)
				Arrays.fill(dist[i], INF);
		dist[S][0] = 0 ; 
		PriorityQueue<Pair> pq = new PriorityQueue<>();

		pq.add(new Pair(S, 0, 0));
		while (!pq.isEmpty()) {
			Pair p = pq.poll();
			if (p.vertex == T) {
				return p.cost;
			}

			int[] neighbours = graph[p.vertex];
			for (int i = 0; i < neighbours.length; i++) {

				int distance = neighbours[i];
				if (distance == -1) {
					continue;
				}

				if (p.fuelInd >= distance) {
					if (dist[i][p.fuelInd] > p.cost) {
						Pair n = new Pair(i, p.fuelInd - distance, p.cost);
						dist[i][p.fuelInd - distance] = p.cost;
						pq.add(n);
					}
					if (i == T) {
						return p.cost;
					}

				}

			}
			if (p.fuelInd < CAPACITY) {
				Pair n = new Pair(p.vertex, p.fuelInd + 1, p.cost + fuels[p.vertex]);
				if (n.cost < dist[p.vertex][p.fuelInd + 1]) {
					dist[p.vertex][p.fuelInd + 1] = p.cost + fuels[p.vertex];
					pq.add(n);
				}
			}

		}
		return dist[T][0];

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		int cities = Integer.parseInt(st.nextToken());
		int roads = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		fuels = new int[cities];

		for (int i = 0; i < cities; i++) {
			fuels[i] = Integer.parseInt(st.nextToken());
		}

		graph = new int[cities][cities];
		for (int i = 0; i < cities; i++) {
			Arrays.fill(graph[i], -1);
		}
		for (int i = 0; i < roads; i++) {

			st = new StringTokenizer(br.readLine());
			int f = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (graph[f][t] != -1) {
				c = Math.min(c, graph[f][t]);
			}
			graph[f][t] = graph[t][f] = c;

		}
//		for (int i = 0 ; i < graph.length ; i ++ ) {
//			System.out.println(Arrays.toString(graph[i]));
//		}

		int queries = Integer.parseInt(br.readLine());
		while (queries-- > 0) {
			st = new StringTokenizer(br.readLine());
			CAPACITY = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			int cost = djkstra(S, T);
			if (cost != INF) {
				pw.println(cost);

			} else {
				pw.println("impossible");
			}
		}
		pw.flush();
	}

	static class Pair implements Comparable<Pair> {
		int vertex;
		int cost;
		int fuelInd;

		public Pair(int v, int fuelInd, int c) {
			this.vertex = v;
			this.fuelInd = fuelInd;
			this.cost = c;
		}

		@Override
		public int compareTo(Pair o) {
			return this.cost - o.cost;
		}

		public String toString() {
			return vertex + " " + fuelInd + " " + cost;
		}
	}

}
