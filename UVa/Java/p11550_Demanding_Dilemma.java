import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class p11550_Demanding_Dilemma {

	public static String checkTheMatrix(int[][] a,int n , int m ) {

		int[][] mat = new int[n][n];
		for (int i = 0; i < m; i++) {
			boolean hah = false;
			for (int j = 0; j < n; j++) {
				if (a[j][i] == 1) {
					int p1 = j;
					while (++j < n) {
						hah = true;
						if (a[j][i] == 1) {
							if (mat[p1][j] == 1) {
								return "No";
							} else {
								mat[p1][j] = 1;
								mat[j][p1] = 1;
								break;
							}
						}
					}
				}
				if (hah)
					break;
			}
		}
		return "Yes";

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		while (tests-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			int m = Integer.parseInt(stt.nextToken());
			/**
			 * implement the pairr that track the pair which has edges
			 */
			int[] edges = new int[m];
			int[][] a = new int[n][m];
			for (int i = 0; i < n; i++) {
				stt = new StringTokenizer(br.readLine());
				for (int j = 0; j < m; j++) {
					int num = Integer.parseInt(stt.nextToken());
					edges[j] += num;
					a[i][j] = num;
				}
			}
			boolean huh = false;
			for (int i = 0; i < m; i++) {
				if (edges[i] != 2) {
					huh = true;
					break;
				}
			}
			if (huh) {
				System.out.println("No");
			} else {
				System.out.println(checkTheMatrix(a,n,m));
			}

		}
	}

}
