import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Currency;
import java.util.StringTokenizer;

public class p10344_23_out_of_5 {

	static int[] op = new int[] { 1, 2, 0 }; // 0 = minus ; 1 = plus ; 2 = mul ;
	static int[] numbers;
	static int howMany;
	static int[] permutation;
	static int[] chosen;

	static boolean permute(int index) {

		if (index == 5) {
			if (backtracking(permutation[0], 1, ""))
				return true;
			return false;
		}
		for (int i = 0; i < 5; i++) {
			if (chosen[i] == 0) {
				chosen[i] = 1;
				permutation[index] = numbers[i];
				if (permute(index + 1))
					return true;
				chosen[i] = 0;
			}
		}
		return false;
	}

	static boolean backtracking(int currentCalc, int index, String exp) {
		if (index == 4) {

			if (currentCalc + permutation[index] == 23 || currentCalc - permutation[index] == 23
					|| currentCalc * permutation[index] == 23)
				return true;
			return false;
		}
		for (int i = 0; i < 3; i++) {
			String oop = "";
			if (op[i] == 1) {

				if (backtracking(currentCalc + permutation[index], index + 1, exp + oop + permutation[index])) {
					return true;
				}
			} else if (op[i] == 2) {

				if (backtracking(currentCalc * permutation[index], index + 1, exp + oop + permutation[index])) {
					return true;
				}

			} else {
				oop = "-";

				if (backtracking(currentCalc - permutation[index], index + 1, exp + oop + permutation[index])) {
					return true;
				}

			}

		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		numbers = new int[5];
		while (true) {
			int sum = 0;
			StringTokenizer stt = new StringTokenizer(br.readLine());

			for (int i = 0; i < 5; i++) {
				numbers[i] = Integer.parseInt(stt.nextToken());
				sum += numbers[i];
			}
			permutation = new int[5];
			chosen = new int[5];
			if (sum == 0)
				break;
			if (permute(0)) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
		}
	}

}
