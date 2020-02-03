import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class p12442_Forwarding_Emails {

	static int[] vertices;
	static TreeSet<Integer> visited;
	static TreeMap<Integer, Integer> values;
	static TreeSet<Integer> potentialCycles;
	static int n;

	static void processTheData(ArrayList<Integer> arr, int tar, int number) {

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == tar) {
				for (; i < arr.size(); i++) {
					values.put(arr.get(i), number);
				}
			} else {
				values.put(arr.get(i), number--);
			}
		}
	}

	static int DFSseach(int start) {
		if (values.keySet().contains(start)) {
			return values.get(start);
		}
		int vertex = start;
		ArrayList<Integer> arr = new ArrayList<>();
		int number = 0;
		while (!visited.contains(vertex)) {
			visited.add(vertex);
			arr.add(vertex);
			number++;
			vertex = vertices[vertex];
		}
		if (values.keySet().contains(vertex)) {
			number += values.get(vertex);
		}
		processTheData(arr, vertex, number);

		return number;

	}

	// TreeMap<Integer, Integer> map = potentialCycles.stream()
	// .collect(Collectors.toMap(Function.identity(), m -> martians, (a, b) ->
	// a, TreeMap::new));
	static int getTarget() {
		visited = new TreeSet<>();
		values = new TreeMap<>(); 
		int tar = 0;
		int max = -1;
		for (int i = 1; i < vertices.length; ++i) {
			int wan = DFSseach(i);
			if (wan == n) {
				return i;
			}
			if (max < wan) {
				max = wan;
				tar = i;
			}

		}
		return tar;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for (int j = 1; j <= tests; j++) {
			n = Integer.parseInt(br.readLine());

			vertices = new int[n + 1];
			for (int i = 0; i < n; i++) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				int ver = Integer.parseInt(stt.nextToken());
				int des = Integer.parseInt(stt.nextToken());
				vertices[ver] = des;
			}
			System.out.printf("Case %d: %d\n", j, getTarget());

		}

	}

}
