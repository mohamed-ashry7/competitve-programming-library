package Codeforces;

import java.util.Scanner;

public class A118_String_Task {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		String x = ss.next();
		x = x.toLowerCase();
		String y = "";
		String vowels = "aieou" ;
		for (int i = 0; i < x.length(); i++) {
			if (vowels.contains(x.charAt(i)+"")) {

			} else {
				y = y + "." + x.charAt(i);
			}
		}
		System.out.println(y);
	}
}
