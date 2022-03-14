package CF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B812_Sagheer_The_Hausmeister {

	static String[] floors;
	static int minIndex = -1;

	public static int minSteps(int floor, boolean left) {
		if (floor == minIndex) {
			int index = floors[floor].indexOf('1');
			if (index < 0) {
				return 0;
			} else {
				if (left) {
					return floors[floor].lastIndexOf('1');
				} else {
					return floors[floor].length() - index - 1;
				}
			}
		} else {
			int leftIndex = floors[floor].lastIndexOf('1');
			if (leftIndex < 0) {
				return 1 + minSteps(floor - 1, left);
			}
			int floorLength = floors[0].length();
			int rightIndex = floorLength - floors[floor].indexOf('1') - 1;
			int steps = 0;
			int lefty = 0 ; 
			int righty = 0 ; 
			if (left) {
				steps = leftIndex;
				lefty = leftIndex + minSteps(floor - 1, true);
				righty = floorLength - 1 - floors[floor].lastIndexOf('1') + minSteps(floor - 1, false);
			} else {
				steps  = rightIndex;
				lefty  = floors[floor].indexOf('1') + minSteps(floor - 1, true);
				righty = rightIndex + minSteps(floor - 1, false);
			}
			

			return steps + 1 + Math.min(lefty, righty);

		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st.nextToken();
		floors = new String[n];

		for (int i = 0; i < n; i++) {
			floors[i] = br.readLine();
			if (minIndex == -1) {
				if (floors[i].indexOf('1') > 0) {
					minIndex = i;
				}
			}
		}
		if (minIndex == -1) {
			System.out.println(0);
		} else
			System.out.println(minSteps(n - 1, true));
	}

}
