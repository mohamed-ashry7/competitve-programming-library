import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p11462_Age_Sort {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			int[] a = new int[100];
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int max = Integer.MIN_VALUE;
			while (stt.hasMoreTokens()) {
				int number = Integer.parseInt(stt.nextToken());
				a[number]++;
				max = max > number ? max : number;
			}

			for (int j = 0; j <= max; j++) {
				if (a[j] != 0) {
					while (a[j] != 0) {
						if (a[j] == 1 && j == max) {
							pw.print(j);

						} else {
							pw.print(j + " ");
						}
						pw.flush();
						a[j]--;

					}
				}
			}
			pw.println();
			pw.flush();

		}
		br.close();
		pw.close();
	}

}
