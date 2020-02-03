import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class p10036_Divisibility {

	static int[] numbers;
	static int divider;
	static boolean Flag = false;
	static int [][] mem ; 
	
	static boolean calcItUp(int index, int sum ) {
		 if (index == numbers.length) { 
			 if (sum%divider == 0 ) { 
				 return true ; 
			 }
			 return false ;
		 }
		 if (mem[index][sum] != -1)

	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {

			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			divider = Integer.parseInt(stt.nextToken());
			numbers = new int[n];
			stt = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {

				numbers[i] = Integer.parseInt(stt.nextToken());
			}
			if (hasIt()) {
				System.out.println("Divisible");
			} else {
				System.out.println("Not divisible");

			}
		}
	}

}
