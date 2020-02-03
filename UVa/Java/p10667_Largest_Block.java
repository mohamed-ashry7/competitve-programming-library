import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10667_Largest_Block {
	static int[][] Board;
	static int EPS = (int) -1e6;

	static void fillArea(int r1, int c1, int r2, int c2) {

		for (int i = r1; i <= r2; ++i) {
			for (int j = c1; j <= c2; ++j) {
				Board[i][j] = EPS;
			}
		}

	}
	static int kadane (int [] a ) { 
		int max = EPS ;
		int count = 0 ; 
		for (int i = 1 ; i < a.length ; ++ i ) { 
			count+=a[i] ; 
			if (count < 0 ) { 
				count = 0 ; 
			}
			else { 
				max = Math.max(count , max) ; 
			}
 		}
		return max; 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		while (p-- > 0) {
			int s = Integer.parseInt(br.readLine()) + 1;
			int n = Integer.parseInt(br.readLine());
			Board = new int[s][s];
			while (n-- > 0) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				int r1 = Integer.parseInt(stt.nextToken());
				int c1 = Integer.parseInt(stt.nextToken());
				int r2 = Integer.parseInt(stt.nextToken());
				int c2 = Integer.parseInt(stt.nextToken());
				fillArea(r1, c1, r2, c2);
			}
			int max = EPS ; 
			for (int l = 1 ; l <s ; ++l ) { 
				int [] arr = new int [s] ; 
				for (int r = l ; r<s ; ++r ) { 
					for (int j = 1 ; j < s ; ++ j ) { 
						arr[j] += Board[j][r] + 1  ;
					}
					max = Math.max(max, kadane(arr)) ; 
				}
			}
			System.out.println(max==EPS?0:max);
		}

	}

}
