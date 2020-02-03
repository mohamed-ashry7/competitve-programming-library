import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class p11991_Easy_Problem_from_Rujia_Liu {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			StringTokenizer stt = new StringTokenizer(line);
			int n = Integer.parseInt(stt.nextToken());
			int tests = Integer.parseInt(stt.nextToken());
			stt = new StringTokenizer(br.readLine());
			TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
			for (int i = 1; i <= n; i++) {
				int num = Integer.parseInt(stt.nextToken());
				if (map.containsKey(num)) {
					map.get(num).add(i);
				} else {
					int ind = i;
					map.put(num, new ArrayList<Integer>() {
						{
							add(ind);
						}
					});
				}
			}
			while (tests-- > 0) {
				stt = new StringTokenizer(br.readLine());
				int pos = Integer.parseInt(stt.nextToken());
				int number = Integer.parseInt(stt.nextToken());
				if (map.containsKey(number)) {
					if (pos > map.get(number).size()) {
						System.out.println(0);
					} else {
						System.out.println(map.get(number).get(pos - 1));
					}
				} else {
					System.out.println(0);
				}
			}
		}
	}

}
