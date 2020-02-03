import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class p280_Vertex {

	static Vertex[] graph;
	static TreeSet<Integer> vertices;
	static TreeSet<Integer> visited;

	static void searchDFS(int vertex) {
		if (graph[vertex] == null) {
			return;
		}
		ArrayList<Integer> toBeChecked = graph[vertex].getAdj();
		for (int i = 0; i < toBeChecked.size(); ++i) {
			int neighbour = toBeChecked.get(i);
			if (!visited.contains(neighbour)) {
				visited.add(neighbour);
				searchDFS(neighbour);
			}
		}
	}

	static void printTheNonReachable(int vertex) {
		visited = new TreeSet<Integer>();
		searchDFS(vertex);
		TreeSet<Integer> nonReachable = vertices.stream().filter(x -> !visited.contains(x))
				.collect(Collectors.toCollection(TreeSet::new));
		String result = nonReachable.size() + " " + (nonReachable.toString().replaceAll("[\\[,\\]]", ""));
		System.out.println(result.trim());
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			graph = new Vertex[n + 1];
			vertices = new TreeSet<Integer>();
			for (int i = 1; i <= n; i++) {
				vertices.add(i);
			}
			while (true) {
				String str = br.readLine();
				StringTokenizer stt = new StringTokenizer(str);
				int ver = Integer.parseInt(stt.nextToken());
				if (ver == 0) {
					break;
				}
				if (graph[ver] == null) {
					graph[ver] = new Vertex(str);
				} else {
					graph[ver].addNeighbours(str);
				}

			}
			StringTokenizer stt = new StringTokenizer(br.readLine());
			stt.nextToken();
			while (stt.hasMoreTokens()) {
				int token = Integer.parseInt(stt.nextToken());
				printTheNonReachable(token);
			}

		}
	}

	static class Vertex {
		int vertex;
		ArrayList<Integer> outgoing;

		public Vertex(String str) {
			StringTokenizer stt = new StringTokenizer(str);
			outgoing = new ArrayList<>();
			vertex = Integer.parseInt(stt.nextToken());
			while (stt.countTokens() > 1) {
				outgoing.add(Integer.parseInt(stt.nextToken()));
			}
		}

		int getVertex() {
			return vertex;
		}

		void addNeighbours(String str) {
			StringTokenizer stt = new StringTokenizer(str);
			Integer.parseInt(stt.nextToken());
			while (stt.countTokens() > 1) {
				outgoing.add(Integer.parseInt(stt.nextToken()));
			}
		}

		ArrayList<Integer> getAdj() {
			return outgoing;
		}
	}

}
