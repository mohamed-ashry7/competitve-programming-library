import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1121_Subsequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String readLine = br.readLine();
			if (readLine == null)
				break;
			StringTokenizer stt = new StringTokenizer(readLine);
			int n = Integer.parseInt(stt.nextToken());
			int s = Integer.parseInt(stt.nextToken());
			int[] a = new int[n];
			stt = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(stt.nextToken());
			}
			int sum = 0;
			int min = n + 1;
			int start = 0;
			for (int i = 0; i < n; ) {
				if (sum < s) {
					sum += a[i++];
				} else {
					while (sum >= s) {
						int diff = i - start ;
						min = diff < min ? diff : min;

						sum -= a[start++];

					}

				}
			}
			while (sum >= s) {
				int diff = n  - start;
				min = diff < min ? diff : min;
				sum -= a[start++];
			}
			if (min == n + 1)
				min = 0;
			System.out.println(min);
		}

	}

}
