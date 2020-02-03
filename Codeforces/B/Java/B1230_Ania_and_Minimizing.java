package Codeforces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1230_Ania_and_Minimizing {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int k = Integer.parseInt(stt.nextToken());
		char[] a = br.readLine().toCharArray();
		int changed = 0;
		if (n == 1) {
			if (k != 0)
				bw.write("0");
			else
				bw.write(new String(a));
			bw.flush();
		} else {
			for (int i = 0; i < n && changed < k; i++) {
				if (i == 0) {
					if (a[i] != '1') {
						a[i] = '1';
						changed++;
					}
				} else {
					if (a[i] != '0') {
						a[i] = '0';
						changed++;
					}
				}
			}
			bw.write(new String(a));
			bw.flush();
			bw.close();
		}
	}
}
