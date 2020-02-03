import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11341_Term_Strategy {
	static int[][] L;
	static int N;
	static int M ; 
	static int[][] memo;
	static int maxGrade(int course, int time) {
		if (time <= 0) {
			if (course<N+1) { 
				return (int)-1e6 ; 
			}
			return 0;
		}
		if (course == N + 1) {
			return 0;
		}
		if (memo[course][time ]!=-1) { 
			return memo[course][time ] ; 
		}
		int max = (int)-1e6;
		for (int i = 1; i <= M; ++i) {
			if (L[course][i] < 5) {
				continue;
			}
			if (time < i) {
				break ; 
			}
			max = Math.max(L[course][i] + maxGrade(course + 1, time - i), max);

		}
		

		return memo[course][time ] = max;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		while (tests-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			N = Integer.parseInt(stt.nextToken());
			M = Integer.parseInt(stt.nextToken());
			L = new int[N + 1][M + 1];
			memo = new int[N + 1][M + 1];
			for (int i = 1; i <= N; ++i) {
				stt = new StringTokenizer(br.readLine());
				for (int j = 1; j <= M; ++j) {
					L[i][j] = Integer.parseInt(stt.nextToken());
					memo[i][j] = -1;
				}
			}
			int highGrade = maxGrade(1, M);
			double average = highGrade/(double)N ; 
			if (average>=5) { 
				System.out.printf("Maximal possible average mark - %.2f.\n",average);
			}
			else {
				System.out.println("Peter, you shouldn't have played billiard that much.");
			}
		}
	}

}
