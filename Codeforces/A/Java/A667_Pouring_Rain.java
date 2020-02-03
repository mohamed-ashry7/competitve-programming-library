package Codeforces;

import java.util.Scanner;

public class A667_Pouring_Rain {

	public static void main(String[] args) {
		
		
		Scanner ss = new Scanner (System.in) ; 
		double radius = ss.nextDouble()/2.0 ; 
		int height = ss.nextInt() ; 
		double rateOfChangeOfDrinking =ss.nextDouble() ; 
		int rateOfChangeOfHeight = ss.nextInt() ; 
		double rateOfChangeOfPouring = Math.PI *radius*radius*rateOfChangeOfHeight  ; 
		if (rateOfChangeOfDrinking<rateOfChangeOfPouring) { 
			System.out.println("NO");
		}
		else if(rateOfChangeOfDrinking==rateOfChangeOfPouring) { 
			if (height!=0) { 
				System.out.println("NO");
			}
			else { 
				System.out.println("YES");
				System.out.printf("%0.12f\n",0);
			}
		}
		else { 
			double time = (height*Math.PI*radius*radius)/(rateOfChangeOfDrinking-rateOfChangeOfPouring) ; 
			System.out.println("YES");
			System.out.printf("%.12f\n",time);
		}
	}

}
