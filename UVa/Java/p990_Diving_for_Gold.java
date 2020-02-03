import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p990_Diving_for_Gold {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 0 ;
		while (t++>=0) {
			String nextLine = br.readLine();
			if (nextLine == null || nextLine.length() == 0) {
				break;
			}
			if (t>1) { 
				System.out.println();
			}
			StringTokenizer stt = new StringTokenizer(nextLine);
			int remA = Integer.parseInt(stt.nextToken());
			int W = Integer.parseInt(stt.nextToken());
			int N = Integer.parseInt(br.readLine());
			int[] d = new int[N];
			int[] v = new int[N];
			int[][] memo = new int[N][remA + 1];
			for (int i = 0; i < N; ++i) {
				stt = new StringTokenizer(br.readLine());
				d[i] = 3*W*Integer.parseInt(stt.nextToken());
				v[i] = Integer.parseInt(stt.nextToken());

			}
			memo = new int[N][remA + 1];

			for (int i = 0; i < N ; ++i) {
				int Cost = d[i];
				for (int j = 1; j < remA + 1; ++j) {
					if (i == 0) {
						if (j >= Cost) {
							memo[i][j] = v[i];
						}
					} else {

						int value = 0;
						if (j <Cost) {
							value = memo[i - 1][j];
						} else {
							value = Math.max(memo[i - 1][j], v[i] + memo[i - 1][j - d[i]]);

						}
						memo[i][j] = value ; 
					}
				}
			}
			PriorityQueue<Integer> values = new PriorityQueue<Integer>() ; 
			int IndI = N-1 ; 
			int IndJ = remA ;

			
			while (IndJ>0  && IndI >= 0) { 
				if (IndI ==0 ) {
					if (memo[0][IndJ]>0)
					values.add(0) ; 
				}
				else if (memo[IndI][IndJ] != memo[IndI-1][IndJ]) { 
					values.add(IndI) ;
					IndJ -= d[IndI] ; 
				}
				IndI -- ; 
				
			}
			System.out.println(memo[N-1][remA]);
			System.out.println(values.size());
			while (values.size()>0) { 
				System.out.printf("%d %d\n" ,(d[values.peek()])/(3*W) ,v[values.poll()] );
			}
			br.readLine();

		}
		br.close();
	}

}
