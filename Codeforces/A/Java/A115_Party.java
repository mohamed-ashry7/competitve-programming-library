package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class A115_Party {
	static ArrayList<Integer>[] vertices;
//	static int[] visited;
	static ArrayList<Integer> theHighManagers;

	static int BFS(int s) {

		Queue<Integer> waiting = new LinkedList<>();
		waiting.addAll(vertices[s]);
//		visited[s] = 1;
		int levels = 1;

		while (waiting.size() > 0) {
			Queue<Integer> next = new LinkedList<>();
			while (waiting.size() > 0) {
				if (vertices[waiting.peek()] != null)
					next.addAll(vertices[waiting.peek()]);
				waiting.poll() ; 
			}
			waiting = new LinkedList<>() ; 
			waiting.addAll(next);
			++levels;
		}

		return levels;
	}

	static int numberGroups() {
		int max = 1;
		for (int i = 0; i < theHighManagers.size(); ++i) {
			if (vertices[theHighManagers.get(i)]!= null)
				max = Math.max(max, BFS(theHighManagers.get(i)));
		}
		return max;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		vertices = new ArrayList[n + 1];
		theHighManagers = new ArrayList<>() ; 
//		visited = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			int manager = Integer.parseInt(br.readLine());
			if (manager == -1) {
				theHighManagers.add(i);
			} else {
				int k = i;
				if (vertices[manager] == null) {
					vertices[manager] = new ArrayList<Integer>() {
						{
							add(k);
						}
					};
				} else {
					vertices[manager].add(i);
				}
			}

		}

		System.out.println(numberGroups());
	}

}
