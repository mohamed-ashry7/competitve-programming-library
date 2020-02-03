import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class p11581_Grid_Successors {

	static ArrayList<int[][]> phases;

	public static int f(int[][] a) {
		boolean zero = true;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 1) {
					zero = false;
					break;
				}
			}
		}
		if (zero) {
			return -1;
		} else {
			int[][] b = new int[3][3];
			b[0][0] = a[0][1] ^ a[1][0];
			b[0][1] = a[0][0] ^ a[1][1] ^ a[0][2];
			b[0][2] = a[0][1] ^ a[1][2];
			b[1][0] = a[0][0] ^ a[1][1] ^ a[2][0];
			b[1][1] = a[0][1] ^ a[1][0] ^ a[1][2] ^ a[2][1];
			b[1][2] = a[2][2] ^ a[1][1] ^ a[0][2];
			b[2][0] = a[1][0] ^ a[2][1];
			b[2][1] = a[2][0] ^ a[1][1] ^ a[2][2];
			b[2][2] = a[2][1] ^ a[1][2];
			
			boolean inf = true;
			for (int k = 0; k < phases.size(); k++) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (phases.get(k)[i][j] != b[i][j]) {
							inf = false;
							break;
						}
					}
				}
			}
			if (inf) {
				return Integer.MIN_VALUE;
			}
			phases.add(b.clone());
			return 1 + f(b);

		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			br.readLine();
			int[][] a = new int[3][3];
			phases = new ArrayList<>();
			phases.add(a);
			for (int j = 0; j < 3; j++) {
				String row = br.readLine();
				a[j][0] = Integer.parseInt(row.charAt(0) + "");
				a[j][1] = Integer.parseInt(row.charAt(1) + "");
				a[j][2] = Integer.parseInt(row.charAt(2) + "");

			}
			try{
			int ind = f(a);
			if (ind < 0)
				System.out.println(-1);
			else
				System.out.println(ind);
			}
			catch (StackOverflowError e) {
				System.out.println(-1);
			}
		}
	}

}
