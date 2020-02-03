import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p10703_Free_spots {

	public static void main(String[] args) throws IOException {

		Scanner ss = new Scanner (new BufferedReader(new InputStreamReader(System.in)));

		while (true) {

			int w =ss.nextInt() ; 
			int h = ss.nextInt();
			int n = ss.nextInt();
			if (h == 0 && w == 0 && n == 0) {
				break;
			}
			int co = h * w;

			boolean[][] arr = new boolean[w][h];
			for (int i = 0; i < n; i++) {

				int x1 = ss.nextInt();
				int y1 = ss.nextInt();
				int x2 = ss.nextInt();
				int y2 =ss.nextInt();
				for (int x = Math.min(x1, x2)-1; x < Math.max(x1, x2); x++) {
					for (int y = Math.min(y1, y2)-1; y < Math.max(y1, y2); y++) {
						if (!arr[x ][y ]) {
							arr[x ][y] = true;
							co--;
						}
					}
				}

			

			}

			if (co == 0) {
				System.out.println("There is no empty spots.");
			} else if (co == 1) {
				System.out.println("There is one empty spot.");
			} else {
				System.out.println("There are " + co + " empty spots.");
			}

		}

	}

}
