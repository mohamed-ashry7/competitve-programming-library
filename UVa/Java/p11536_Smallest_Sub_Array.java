import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p11536_Smallest_Sub_Array {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int tt = 1; tt <= t; tt++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			int m = Integer.parseInt(stt.nextToken());
			int k = Integer.parseInt(stt.nextToken());
			int[] a = new int[n + 1];
			int[] freq = new int[k + 1];
			int min = n + 1;
			int number;
			int c = 0;
			int start = 1;
			for (int i = 1; i <= n; i++) {
				if (i <= 3)
					number = i;
				else
					number = (a[i - 1] + a[i - 2] + a[i - 3]) % m + 1;
				a[i] = number;
				if (number <= k) {
					if (freq[number]++ == 0) {
						++c;
					}
				}
				if (c == k) {

					while (true) {
						if (a[start] <= k) {

							if (freq[a[start]] == 1) {

								int diff = i - start + 1;
								min = min < diff ? min : diff;
								freq[a[start]]--;

								++start;
								--c;
								break;
							}
							freq[a[start]]--;
						}
						++start;

					}

				}

			}
			if (min < n + 1) {

				System.out.println("Case " + tt + ": " + min);
			} else {
				System.out.println("Case " + tt + ": " + "sequence nai");
			}

		}
	}

}
