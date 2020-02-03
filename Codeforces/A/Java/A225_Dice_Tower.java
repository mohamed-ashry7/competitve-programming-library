package Codeforces;

import java.util.Scanner;

public class A225_Dice_Tower {

	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int head = ss.nextInt();
		ss.nextInt(); ss.nextInt() ; 
		int complement = 7-head ; 
		boolean flag = true ; 
		n--;
		while (n-- > 0 && flag ) {
			int left = ss.nextInt();
			int right = ss.nextInt();
			if (complement == left || complement == 7-left || complement == right || complement == 7-right )
				flag = false ;
					}
		System.out.println(flag?"YES":"NO");

	}

}
