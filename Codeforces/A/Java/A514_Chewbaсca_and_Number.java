package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A514_Chewbaсca_and_Number {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		char num []  = ss.next().toCharArray() ; 
		for (int i = 0 ; i < num.length ; ++i ) { 
			if (i==0 && num[0] !='9' && num[i]>='5' || num[i]>='5'&& i!=0 ) {
				num[i] = (9-Integer.parseInt(num[i]+"")+"").charAt(0); 
			}
		}
		System.out.println(Arrays.toString(num).replaceAll("[\\[\\], ]",""));
	}

}
