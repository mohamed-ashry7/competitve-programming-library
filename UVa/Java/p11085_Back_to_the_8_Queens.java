package UVa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p11085_Back_to_the_8_Queens {

	static int[] original;
	static long min ;

	public static boolean safe(int[] rows, int r, int c) {

		for (int i = 1; i < c; i++) {

			if (rows[i] == r) {
				return false;
			}
			if (Math.abs(c - i) == Math.abs(rows[i] - r)) {
				return false;
			}
		}

		return true;

	}

	public static void queens(int[] rows, int c) {
		if (c == 9) {
			long prop = 0;
			for (int i = 1; i < rows.length; i++) {
				if (rows[i] != original[i])
					prop += 1;
			}
			min = Math.min(min, prop);
			return;
		}

		for (int r = 1; r < rows.length; r++) {
			if (safe(rows, r, c)) {
				rows[c] = r;
				queens(rows, c + 1);
				rows[c] = -1;

			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out) ; 
		String line = null;
		int cas = 1;
		while (true) {
			line = br.readLine() ; 
			if (line == null ||line.length()==0 ) {
				break ; 
			}
			StringTokenizer st = new StringTokenizer(line);
			original = new int[9];
			min = Long.MAX_VALUE;
			for (int i = 1; i < 9; i++) {
				original[i] = Integer.parseInt(st.nextToken());
			}
			
			queens(new int[] { 0, -1, -1, -1, -1, -1, -1, -1, -1 }, 1);
			pw.printf("Case %d: %d\n" ,cas++ ,min );
		}
		pw.flush();

	}
}
