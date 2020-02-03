import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p624_CD {

	static int n;
	static int[] a;
	static int MAX;
	static int[] chosen;
	static int maxDuration;
	static int ChosenNumber;
	static int[] wantedSongs;

	static int sum() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (chosen[i] == 1) {
				sum += a[i];
			}
		}
		return sum;
	}

	/*
	 * 
	 * there are two ways to solve this 1) iteratively and this by generating
	 * all possible subsets which can be 2[pow(n)] and that is fine that the max
	 * n is 20; 2)recursively and that is by backtacking that we will also try
	 * all the solutions if it is one song or they are two songs or whatever
	 * 
	 */
	static void iteratively() {
		for (int i = 1; i < Math.pow(2, n); i++) {
			int j = 0;
			int k = i;
			int sum = 0;
			chosen = new int[n];
			boolean f = true;
			int s = 0;
			while (k > 0) {
				if ((k & 1) == 1) {
					sum += a[j];
					if (sum > MAX) {
						f = false;
						break;
					} else {
						chosen[j] = 1;
						s++;
					}
				}
				k >>= 1;
				j++;
			}

			if (f) {
				if (sum > maxDuration) {
					maxDuration = sum;
					
					wantedSongs = chosen.clone();
					ChosenNumber = s;
				} else if (sum == maxDuration && s > ChosenNumber) {
					wantedSongs = chosen.clone();
					ChosenNumber = s;

				}
			}
		}
	}

	static boolean backtrack(int start , int currentIndex) {
		return true;
	}

	static void recursively() {
		for(int i = 0 ; i < n ; i ++ ) { 
			backtrack(i,i) ; 
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String readLine = br.readLine();
			if (readLine == null)
				break;
			StringTokenizer stt = new StringTokenizer(readLine);
			MAX = Integer.parseInt(stt.nextToken());
			n = Integer.parseInt(stt.nextToken());
			a = new int[n];
			ChosenNumber = 0 ; 
			maxDuration = 0 ;
			boolean isThere = false;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(stt.nextToken());
				if (a[i] <= MAX) {
					isThere = true;
				}
			}
			if (isThere) {
				String songs = "" ; 
				iteratively();
				for (int i = 0; i < chosen.length; i++) {
					if (wantedSongs[i] == 1) {
						songs = songs +a[i]+" " ; 
					}
				}
				System.out.println(songs +"sum:"+maxDuration);
			} else {
				System.out.println("sum:0");
			}
		}
	}

}
