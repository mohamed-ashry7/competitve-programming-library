import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10474_Where_is_the_Marble {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 0;
		while (++t > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			int q = Integer.parseInt(stt.nextToken());
			if (n+q == 0 ) { 
				break ; 
			}
			int[] marbles = new int[n];
			for (int i = 0; i < n; i++) {
				marbles[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(marbles);
			System.out.printf("CASE# %d:\n",t);
			for (int i = 0; i < q; i++) {
				int x = Integer.parseInt(br.readLine());
				int index = Arrays.binarySearch(marbles, x);
				if (index < 0) {
					System.out.println(x + " not found");
				} else {
					while (marbles[index] == x) {
						index--;
						if (index == -1) {
							break;
						}
					}
					++index;
					System.out.printf("%d found at %d\n",x,index+1);
				}
			}
		}
	}

}
