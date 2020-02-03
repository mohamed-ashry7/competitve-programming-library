package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class B216_Forming_Teams {

	static TreeSet<Integer> visited;
	static ArrayList<Integer>[] a;
	static int  dfs(int vertex) {
		if (visited.contains(vertex))
			return 0;
		visited.add(vertex);
		ArrayList<Integer> arr = a[vertex];
		int c = arr.size() ; 
		for (int i = 0; i < arr.size(); ++i) {
			c+=dfs(arr.get(i));

		}
		return c ; 

	}

	static int numberOfSentPlayers() {
		int cycles = 0;
		int v = 0 ; 
		for (int i = 1; i < a.length; ++i) {
			if (a[i] != null && !visited.contains(i)) {

				int edges = dfs(i)/2;
				v = visited.size()-v ; 
				if (edges%2==1 && edges == v)
					cycles++;
				v = visited.size() ; 
			}
		}
		if ((a.length - 1 - cycles) % 2 == 1)
			cycles++;

		return cycles;
	}

	public static void main(String[] args)  {
		
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int m = ss.nextInt();
		a = new ArrayList[n + 1];
		visited = new TreeSet<>();
	
		for (int i = 0; i < m; ++i) {
			int e1 = ss.nextInt();
			int e2 = ss.nextInt();
			if (a[e1] == null)
				a[e1] = new ArrayList<>();
			if (a[e2] == null)
				a[e2] = new ArrayList<>();
			a[e1].add(e2);
			a[e2].add(e1);
		}
		System.out.println(numberOfSentPlayers());

	}

	

}
