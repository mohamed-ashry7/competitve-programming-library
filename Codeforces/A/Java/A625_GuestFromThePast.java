package Codeforces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A625_GuestFromThePast {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long ruples = Long.parseLong(br.readLine());
		long plastic = Long.parseLong(br.readLine());
		long glass = Long.parseLong(br.readLine());
		long refund = Long.parseLong(br.readLine());

		long bottles = 0;
		while (ruples >= plastic || ruples >= glass) {
			long div = 0;
			if (glass > ruples ) {
				div = ruples / plastic;
				ruples -= div * plastic;

			} else if (plastic > ruples ) {
				div = ruples / glass;
				ruples = ruples - div * glass + div * refund;
			}
			else {
				long divp = ruples / plastic ;
				long costp = div * plastic ; 
				long divg =ruples / glass;
				long costg = div * glass + div * refund;
				
				
				
				
			}
			bottles += div ; 
		}

		bw.write(bottles+"");
		bw.flush();

	}

}
