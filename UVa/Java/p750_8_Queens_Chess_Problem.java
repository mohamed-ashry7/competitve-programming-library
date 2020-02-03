import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.function.Consumer;

public class p750_8_Queens_Chess_Problem {

	static int Max;
	static int nn;
	static int[] Row;
	static int X, Y;
	static int counter;
	static TreeSet<String >set ; 
	static boolean isAttacked(int row, int col) {
		if (Math.abs(row-X) == Math.abs(Y-col) || Row[Y] == row)
			return true ; 
		for (int i = 1; i < col; i++) {
			if (Row[i] == row) {
				return true;
			}
		}

		for (int i = 1; i < col; i++) {
			
			if (Math.abs(col - i) == Math.abs(row - Row[i]))
				return true;
		}
		return false;
	}

	static void backtracking(int c) {

		if (c > nn) {
			String wan = counter+"" ;
			counter ++ ; 
			if (wan.length() == 1 )
				wan = " " + wan ; 
			System.out.println(
					wan + "      " + Arrays.toString(Row).replaceAll("[\\[\\],]", "").substring(2));
			return;
		}
		if (c == Y){
			backtracking(c + 1);
		} else {
			for (int i = 1; i <= nn; i++) {
				if (isAttacked(i, c)) {
					continue;
				}

				Row[c] = i;
				backtracking(c + 1);
				Row[c] = 0;

			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		nn = 8 ; 
		while (tests-- > 0) {
			br.readLine();
			StringTokenizer stt = new StringTokenizer(br.readLine());
			X = Integer.parseInt(stt.nextToken());
			Y = Integer.parseInt(stt.nextToken());
			counter = 1;
			Row = new int[9];
			Row[Y] = X;
			System.out.println("SOLN       COLUMN\n #      1 2 3 4 5 6 7 8\n");
			backtracking(1);
			
			if (tests > 0)
				System.out.println();
		}
	}

}
