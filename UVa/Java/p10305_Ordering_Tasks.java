import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class p10305_Ordering_Tasks {

	static TreeSet<Integer> visited;

	static int getParent(int[] p, int s) {
		int ind = s;
		while (p[s] != 0) {
			ind = p[s];
			s = p[s];
		}
		return ind;
	}

	static void dfs(int v, ArrayList<Integer>[] arr) {
		if (visited.contains(v)) {
			return;
		}
		visited.add(v);
		System.out.print(v);
		if (visited.size()!=arr.length-1)
			System.out.print(" ");
		ArrayList<Integer> next = arr[v];
		for (int i = 0; next != null && i < next.size(); ++i) {
			dfs(next.get(i), arr);
		}
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int m = ss.nextInt();

		while (!(n == 0 && m == 0)) {
			int[] parents = new int[n + 1];
			visited = new TreeSet<>();
			ArrayList<Integer>[] list = new ArrayList[n + 1];
			for (int i = 0; i < m; ++i) {
				int pred = ss.nextInt();
				int succ = ss.nextInt();
				int parentOfSuccessor = getParent(parents, succ);
				if (list[pred] == null)
					list[pred] = new ArrayList<>();
				list[pred].add(parentOfSuccessor);
				if (parentOfSuccessor != pred) {
					parents[parentOfSuccessor] = pred;
				}
			}
			for (int i = 1; i <= n; ++i) {
				if (parents[i] == 0 && !visited.contains(i)) {
					dfs(i, list);
				}
			}
			System.out.println();
			n = ss.nextInt();
			m = ss.nextInt();
		}
	}

}
