package Codeforces;

import java.util.Scanner;

public class A9_Die_Roll {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int Y = ss.nextInt();
		int W = ss.nextInt();
		int chances = 6 - Math.max(Y, W) + 1;
		String res = "";
		switch (chances) {
		case 1:
			res = "1/6";
			break;
		case 2:
			res = "1/3";
			break;
		case 3:
			res = "1/2";
			break;
		case 4:
			res = "2/3";
			break;
		case 5:
			res = "5/6";
			break;
		default:
			res = "1/1";
		}
		System.out.println(res);

	}

}
