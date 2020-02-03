import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class p540_Team_Queue {

	static ArrayList<ArrayList<Integer>> teams;

	public static ArrayList<Integer> gimmeTheArray(int member) {
		for (int i = 0; i < teams.size(); i++) {
			if (teams.get(i).contains(member)) {
				return teams.get(i);
			}
		}
		return null;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int s = 1 ; 
		while (true) {
			int tests = Integer.parseInt(br.readLine());
			if (tests== 0 ) { 
				break ; 
			}
			teams = new ArrayList<>(tests);
			for (int t = 0; t < tests; t++) {

				StringTokenizer stt = new StringTokenizer(br.readLine());
				int members = Integer.parseInt(stt.nextToken());
				ArrayList<Integer> team = new ArrayList<>(members);
				for (int m = 0; m < members; m++) {
					team.add(Integer.parseInt(stt.nextToken()));
				}
				teams.add(team);
			}

			LinkedHashMap<Integer, Queue<Integer>> teamQueue = new LinkedHashMap<>();
			System.out.println("Scenario #"+s);
			while (true) {
				String command = br.readLine();
				if (command.equals("STOP")) {
					break;
				} else if (command.equals("DEQUEUE")) {
					Map.Entry<Integer, Queue<Integer>> e = teamQueue.entrySet().iterator().next();
					int key = e.getKey();
					Queue<Integer> team = e.getValue();
					out.println(team.poll());
					out.flush();
					if (team.isEmpty()) {
						teamQueue.remove(key);
					}
				} else {
					int enqueued = Integer.parseInt(command.substring(8));
					ArrayList<Integer> team = gimmeTheArray(enqueued);
					boolean isInNot = true;
					for (int i = 0; i < team.size(); i++) {
						int tt = team.get(i);
						if (teamQueue.containsKey(tt)) {
							teamQueue.get(tt).add(enqueued);
							isInNot = false;
							break;
						}
					}
					if (isInNot) {
						Queue<Integer> q = new LinkedList<>();
						q.add(enqueued);
						teamQueue.put(enqueued, q);
					}
				}
			}
			out.println();
			out.flush();
			s++ ; 
		}
//		out.println();
//		out.flush();
		br.close();
		out.close();

	}

}
