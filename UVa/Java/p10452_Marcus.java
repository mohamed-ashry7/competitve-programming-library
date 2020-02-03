import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10452_Marcus {
	static String SAFE = "IEHOVA";
	static char[][] arr;

	static void discoverPath(int i, int j) {

		int index = 0;
		String Path = "";
		while (index < 6) {
			if (j - 1 >= 0 && arr[i][j - 1] == SAFE.charAt(index)) {

				Path += "left ";
				j--;

			} else if (j + 1 < arr[0].length && arr[i][j + 1] == SAFE.charAt(index)) {

				Path += "right ";
				j++;

			} else {
				Path += "forth ";
				i--;
			}
			index++;

		}
		if (i == 0) {
			if (j - 1 >= 0 && arr[i][j - 1] == '#') {

				Path += "left";
				j--;

			} else if (j + 1 < arr[0].length && arr[i][j + 1] =='#') {

				Path += "right";
				j++;

			}
		} else {
			Path += "forth";

		}
		System.out.println(Path);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		while (cases-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			int m = Integer.parseInt(stt.nextToken());
			arr = new char[n][m];
			for (int i = 0; i < n; ++i) {
				arr[i] = br.readLine().toCharArray();
			}
			int start = 0;
			for (int i = 0; i < m; ++i) {
				if (arr[n - 1][i] == '@') {
					start = i;
					break;
				}
			}
			discoverPath(n - 1, start);

		}

	}

}
