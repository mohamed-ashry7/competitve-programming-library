package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_LargestSquare {

	static int[][] a;

	public static int getWrongSquarely(int size, int startH, int startV, int lim ,int cumSum) {
		int wrong = 0;

		for (int i = startH; i < size; i++) {

			for (int j = startV; j < size; j++) {
				if (a[i][j] == 1) {
					wrong++;
				}
				if (wrong > lim) {
					return -1;
				}
			}
		}

		return wrong > lim ? -1 : 0;
	}

	public static int getTheMin(int size, int lim) {
		int cumSum = getWrongSquarely(size, 1, 1, lim , 0) ; 
		for (int i = 1; i < a.length - size + 1; i++) {
			for (int j = 2; j < a.length - size + 1; j++) {
				 cumSum = getWrongSquarely(size, i, j, lim , cumSum);
				if (cumSum <=lim) {
					return 0;
				}

			}

		}
		return -1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		for (int t = 0; t < test; t++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			int w = Integer.parseInt(stt.nextToken());
			int l = Integer.parseInt(stt.nextToken());
			a = new int[n+1][n+1];
			if (w == 0) {
				System.out.println(n * n);
			} else {
				for (int p = 0; p < w; p++) {
					stt = new StringTokenizer(br.readLine());
					int x = Integer.parseInt(stt.nextToken());
					int y = Integer.parseInt(stt.nextToken());
					a[x][y] = 1;
				}

				int s = 2;
				int wan = 1;
				for (; s < n; s++) {
					int ret = getTheMin(s, l);
					if (ret == 0) {
						wan = s;
					} else if (ret == -1) {
						break;
					}
				}
				System.out.println(wan * wan);
			}
		}
	}

}
