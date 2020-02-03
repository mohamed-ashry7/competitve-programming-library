import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p524_Prime_Ring_Problem {

	static int n;
	static int[] numbers;
	static boolean[] primes;
	static int[] candidates;
	static int[] chosen;

	static boolean isPrime(int x) {
		if (primes[x])
			return true;
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0)
				return false;
		}
		primes[x] = true;
		return true;
	}

	static void backtrack(int index) {

		if (index >= n) {

			if (isPrime(1 + candidates[n - 1])) {
				System.out.println(Arrays.toString(candidates).replaceAll("[\\[,\\]]", ""));
			}
			return;
		}
		for (int i = 1; i < n; i++) {
			if (chosen[i] == 0) {
				if (!isPrime(numbers[i] + candidates[index - 1])) {
					continue;
				}
				chosen[i] = 1;
				candidates[index] = numbers[i];
				backtrack(index + 1);
				chosen[i] = 0;
				candidates[index] = 0;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		primes = new boolean[32];
		int t= 0 ; 
		while (t++ >= 0 ){
			String line = br.readLine();
			if (line == null || line.length() == 0) {
				break;
			}
			if(t>1) { 
				System.out.println();
			}
			n = Integer.parseInt(line);
			numbers = new int[n];
			for (int i = 0; i < n; i++) {
				numbers[i] = i + 1;
			}
			candidates = new int[n];
			chosen = new int[n];
			chosen[0] = 1;
			candidates[0] = 1;
			System.out.println("Case "+t+":");
			backtrack(1);
		}
	}

}
