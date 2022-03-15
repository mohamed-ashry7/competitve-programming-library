package UVa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class p11201_The_problem_of_the_crazy_linguist {

	static String odd = "bcdfghjklmnpqrstvwxyz";
	static String even = "aeiou";
	static int occ[] = new int['z' - 'a' + 1];
	static ArrayList<Double> calcs;
	static double prob[] = new double[] { 12.53, 1.42, 4.68, 5.86, 13.68, 0.69, 1.01, 0.70, 6.25, 0.44, 0.00, 4.97,
			3.15, 6.71, 8.68, 2.51, 0.88, 6.87, 7.98, 4.63, 3.93, 0.90, 0.02, 0.22, 0.90, 0.52 };

	public static double getProp(char c) {
		return prob[c - 'a'];
	}

	public static boolean isValid(char c) {
		return occ[c - 'a'] < 2;
	}

	public static void compute(int index, String w, double loader) {
		if (index == 0) {
			compute(index + 1, w, loader + (index + 1) * getProp(w.charAt(0)));

		} else if (index == w.length()) {
			calcs.add(loader);
		} else {
			String str = (index + 1) % 2 == 0 ? even : odd;
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (isValid(c)) {
					occ[c - 'a'] += 1;
					compute(index + 1, w, loader + (index + 1) * getProp(c));
					occ[c - 'a'] -= 1;
				}

			}

		}

	}

	public static double getTheAverage() {
		double a = 0;
		for (int i = 0; i < calcs.size(); i++) {
			a += calcs.get(i);
		}
		return a / calcs.size();
	}

	public static double weight(String w) {
		double a = 0;
		for (int i = 0; i < w.length(); i++) {
			a += (i + 1) * getProp(w.charAt(i));
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		PrintWriter pw = new PrintWriter(System.out) ; 
		while (tests-- > 0) {
			String w = br.readLine(); 
			calcs = new ArrayList<>() ; 
			compute(0, w, 0);
			pw.println(weight(w) < getTheAverage()?"below":"above or equal");
		}
		pw.close(); 
		br.close();
	}

}
