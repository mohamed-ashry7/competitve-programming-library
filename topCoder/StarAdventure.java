package topcoder;

public class StarAdventure {

	static int[][][] memo; // the state represents the pass, i, j ;

	static char grid[][];

	
	public static int mostStars(String []  arr ) {
		grid = new char[arr.length][];
		int i = 0;
		for (String s : arr) {
			grid[i++] = s.toCharArray();
		}
		memo = new int[3][grid.length][grid[0].length];
		return dp(0, 0, 1, "(0,0)");
	}
	public static int dp(int i, int j, int pass, String path) {
		if (pass == 3 && i == grid.length - 1 && j == grid[0].length - 1) {
			return 0;
		}

		String sq = "(" + i + "," + j + ")";
		int addVal = 0;

		if (memo[pass % 2][i][j] != 0) {
			return memo[pass % 2][i][j];
		}

		if (!path.contains(sq)) {
			addVal = grid[i][j] - '0';
		}
		String newPath = path + "(" + (i) + "," + (j) + ")";
		if (pass % 2 == 1) {

			if (i == grid.length - 1 && j == grid[0].length - 1) {
				return memo[pass % 2][i][j] = addVal
						+ Math.max(dp(i - 1, j, pass + 1, newPath), dp(i, j - 1, pass + 1, newPath));
			} else if (i == grid.length - 1) {
				return memo[pass % 2][i][j] = addVal + dp(i, j + 1, pass, newPath);
			} else if (j == grid[0].length - 1) {
				return memo[pass % 2][i][j] = addVal + dp(i + 1, j, pass, newPath);
			} else {
				return memo[pass % 2][i][j] = addVal
						+ Math.max(dp(i + 1, j, pass, newPath), dp(i, j + 1, pass, newPath));
			}
		} else {
			if (i == 0 && j == 0) {
				return memo[pass % 2][i][j] = addVal
						+ Math.max(dp(i + 1, j, pass + 1, newPath), dp(i, j + 1, pass + 1, newPath));
			} else if (i == 0) {
				return memo[pass % 2][i][j] = addVal + dp(i, j - 1, pass, newPath);
			} else if (j == 0) {
				return memo[pass % 2][i][j] = addVal + dp(i - 1, j, pass, newPath);
			} else {
				return memo[pass % 2][i][j] = addVal
						+ Math.max(dp(i - 1, j, pass, newPath), dp(i, j - 1, pass, newPath));
			}

		}
	}

	public static void main(String[] args) {

		String[] arr = new String[] { "0999999999", "9999999999", "9999999999", "9999999999", "9999999999",
				"9999999999", "9999999999", "9999999999", "9999999999", "9999999999" }

		;
		System.out.println(mostStars(arr));
		
	}

}
