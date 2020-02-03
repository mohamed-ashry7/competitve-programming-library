import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p167_The_Sultan_s_Successors {

	static int Max;
	static int[][] board;
	static int n;
	static int[] Col;
//	static boolean[] posDiag;
//	static boolean[] negDiag; // TRY WITH DIAGONALSSSS

	static boolean isAttacked(int row, int col) {

		for (int i = 1; i <= n; i++) {
			if (Col[i] == col) {
				return true;
			}
			if (Col[i] == 0)
				break;
		}

		for (int i = 1; i <= n; i++) {
			if (Col[i] == 0) {
				break;
			}
			if (Math.abs(row - i) == Math.abs(col - Col[i]))
				return true;
		}
		return false;
	}

	static void backtracking(int r, int cumSum) {

		if (r > n) {
			if (cumSum > Max) {
				Max = cumSum;
			}
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (isAttacked(r, i)) {

				continue;
			}

			Col[r] = i;
			int minus = Math.abs(r - i);
			int plus = Math.abs(r + i);
//			posDiag[plus] = true;
//			negDiag[minus] = true;
			// System.out.println(Arrays.toString(Col));
			backtracking(r + 1, cumSum + board[r][i]);
			Col[r] = 0;
//			posDiag[plus] = false;
//			negDiag[minus] = false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tests = Integer.parseInt(br.readLine());
		n = 8;
		while (tests-- > 0) {
			board = new int[9][9];
			for (int i = 1; i <= 8; i++) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				for (int j = 1; j <= 8; j++) {
					board[i][j] = Integer.parseInt(stt.nextToken());
				}
			}
			Max = -1;
			Col = new int[9];
//			posDiag = new boolean[17];
//			negDiag = new boolean[8];
			backtracking(1, 0);
			String wan = ""+Max ; 
			while(wan.length() < 5 ){
				wan = " " + wan ; 
			}
			System.out.println(wan);
		}
	}

}
