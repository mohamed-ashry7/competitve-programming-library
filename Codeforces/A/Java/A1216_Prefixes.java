package Codeforces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class A1216_Prefixes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out)) ; 
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int op = 0;
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i += 2) {
			if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'a' || str.charAt(i) == 'b' && str.charAt(i + 1) == 'b') {
				op += 1;
				result.append("ab");
			} else {
			
				result.append(str.subSequence(i, i+2));

			}
		}
		bw.write(op+"\n");
		bw.write(result.toString()+"\n");
		bw.flush();
		bw.close();
	}

}
