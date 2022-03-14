

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p10360_Rat_Attack {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {
			int d = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] map = new int[1025][1025];
			while (n-- > 0) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(stt.nextToken());
				int y = Integer.parseInt(stt.nextToken());
				int size = Integer.parseInt(stt.nextToken());
				map[x][y] = size;
			}
			for (int i = 0; i < 1025; i++) {
				for (int j = 0; j < 1025; j++) {
					if (i != 0 && j != 0) {
						map[i][j] += map[i - 1][j] + map[i][j - 1] - map[i - 1][j - 1];
					} else if (i != 0) {
						map[i][j] += map[i - 1][j];

					} else if (j != 0) {
						map[i][j] += map[i][j - 1];

					}
				}
			}
			int max = -1;
			int x = 0;
			int y = 0;
			
			
			
			
			for (int i = 0; i < 1025; i++) {
				for (int j = 0; j < 1025; j++) {
					int count = map[i][j];
					
					
					if (i > 2 * d && j > 2 * d) {
						count =count -  map[i - 2 * d - 1][j] 
								- map[i][j - 2 * d - 1] 
								+ map[i - 2 * d - 1][j - 2 * d - 1];
						

					} else if (i > 2 * d) {
						count -= map[i - 2 * d - 1][j];
					} else if (j > 2 * d) {
						count -= map[i][j - 2 * d - 1];
					}
					
					if (count > max) {
						max = count;
						x = i - d<0?0:i-d;
						y = j - d<0?0:j-d;
						if (max == map[1024][1024]) {
							break;
						}
					}

				}
			}

			pw.println(x + " " + y + " " + max);
		}
		pw.flush();
		pw.close();
		br.close();

	}

}

