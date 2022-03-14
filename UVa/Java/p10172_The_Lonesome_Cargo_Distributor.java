package UVa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class p10172_The_Lonesome_Cargo_Distributor {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out) ; 
		int tests = Integer.parseInt(br.readLine());
		while (tests-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			int cargos = 0;
			Stack<Integer> stack = new Stack<>();
			Queue<Integer>[] stations = new Queue[n];
			for (int i = 0; i < n; i++) {
				stations[i] = new LinkedList<>();
				st = new StringTokenizer(br.readLine());
				cargos += Integer.parseInt(st.nextToken());
				while (st.hasMoreTokens()) {
					stations[i].add(Integer.parseInt(st.nextToken()));
				}
			}
			int minutes = -2;

			while (cargos > 0) {
				for (int i = 0; i < n && cargos>0; i++) {
					minutes += 2;

//			Unloading
					while (!stack.isEmpty()) {
						if (stack.peek() == i + 1) {
							stack.pop();
							++minutes;
							cargos--;
						} else {
							if (stations[i].size() < q) {
								stations[i].add(stack.pop());
								minutes++;
							} else {
//						The size of the queue is full and the current cargo is diff from the station id 
								break;
							}
						}
					}

//				Loading
					while (stack.size() < s && !stations[i].isEmpty()) {
						
						stack.add(stations[i].poll());
						
						minutes++;
					}
				}
			}
			pw.println(minutes);
		}
		pw.flush();
	}

}
