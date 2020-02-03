import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class p11995_ICanGuesstheDataStructure {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String ops = br.readLine();
			if (ops == null) {
				break;
			}
			int nums = Integer.parseInt(ops);
			Stack<Integer> stack = new Stack<>();
			Queue<Integer> queue = new LinkedList<>();
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			int who = 0b111;

			for (int i = 0; i < nums; i++) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				if (Integer.parseInt(stt.nextToken()) == 1) {
					int num = Integer.parseInt(stt.nextToken());
					stack.push(num);
					queue.add(num);
					pq.add(num);
				} else {
					int num = Integer.parseInt(stt.nextToken());
					if (stack.size() == 0) {
						who &= 0;
					} else {
						if (stack.pop() != num) {
							who = who & ~(1);
						}
						if (queue.poll() != num) {
							who = who & ~(1 << 1);
						}
						if (pq.poll() != num) {
							who = who & ~(1 << 2);
						}

					}
				}

			}
			if (who == 0) {
				System.out.println("impossible");
			} else if (who == 1) {
				System.out.println("stack");

			} else if (who == 2) {
				System.out.println("queue");

			} else if (who == 4) {
				System.out.println("priority queue");

			} else {
				System.out.println("not sure");

			}

		}
	}

}
