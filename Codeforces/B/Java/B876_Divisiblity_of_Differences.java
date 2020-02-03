package Codeforces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B876_Divisiblity_of_Differences {

	static ArrayList<Integer>[] remainders;

	// static boolean hasIt(int start, int k, int m, long prev) {
	//
	// if (k == 0) {
	// return true;
	// }
	// if (numbers.length - start < k)
	// return false;
	//
	// for (int i = start; i < numbers.length; ++i) {
	// if (taken[i] == 0) {
	// if (prev != -1) {
	// if (Math.abs(numbers[i] - prev) % m == 0) {
	// taken[i] = 1;
	// if (hasIt(i + 1, k - 1, m, numbers[i]))
	// return true;
	// taken[i] = 0 ;
	//
	// }
	// } else {
	// taken[i] = 1;
	// if (hasIt(i + 1, k - 1, m, numbers[i]))
	// return true;
	// taken[i] = 0 ;
	//
	// }
	// }
	// }
	// return false;
	// }
	//
	static void processTheSolution(boolean boo, ArrayList<Integer> taken , int k ) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		if (boo) {
			bw.write("Yes\n");
			bw.flush();
			StringBuilder sbb = new StringBuilder();
			for (int i = 0; i < k; ++i) {

				sbb.append(taken.get(i) + " ");

			}
			bw.write(sbb.toString());
			bw.flush();

		} else {
			bw.write("No");
			bw.flush();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int k = Integer.parseInt(stt.nextToken());
		int m = Integer.parseInt(stt.nextToken());

		remainders = new ArrayList[m];
		stt = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(stt.nextToken());
			if (remainders[a % m] == null) {
				
				remainders[a % m] = new ArrayList<Integer>() {
					{
						add(a);
					}
				};
			} else {
				remainders[a % m].add(a);

			}
		}
		boolean isIt = false ;
		for (int i = 0; i < remainders.length; i++) {
			if (remainders[i] != null &&remainders[i].size()>=k) { 
				isIt = true ; 
				processTheSolution(true, remainders[i], k);
				break ;
			}
		}
		if (!isIt) { 
			processTheSolution(false , null , 0  ) ; 
		}
	}

}
