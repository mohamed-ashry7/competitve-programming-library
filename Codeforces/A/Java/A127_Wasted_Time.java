package Codeforces;

import java.util.Scanner;

public class A127_Wasted_Time {
	static double getDistance(int x1 , int y1 , int x2 , int y2) { 
		return Math.sqrt(
				Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)
				); 
				
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int k = ss.nextInt();
		int x1 = ss.nextInt();
		int y1 = ss.nextInt();
		double cumDis = 0 ; 
		for (int i = 1; i < n; ++i) {
			int x2 = ss.nextInt();
			int y2 = ss.nextInt();
			cumDis += getDistance (x1,y1,x2,y2) ; 
			x1 = x2 ; y1=y2 ; 
		}
		double time = (cumDis)/50 *k ; 
		System.out.printf("%.9f",time);

	}

}
