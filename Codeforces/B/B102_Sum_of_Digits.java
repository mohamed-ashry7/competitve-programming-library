package notAdded;

import java.util.Arrays;
import java.util.Scanner;

public class B102_Sum_of_Digits {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		char[] number = ss.next().toCharArray();
		long sum = 0;
		int counter = 0 ; 
		while (number.length > 1) {
			for (int i = 0; i < number.length; ++i) {
				sum += Integer.parseInt(number[i] + "");
			}
			number = (sum+"").toCharArray(); 
			sum= 0 ;
			++counter ; 
		}
		
		System.out.println(counter);

	}

}
