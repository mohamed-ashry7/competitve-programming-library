package Codeforces;

import java.util.Scanner;

public class A1204_BowWow_and_the_Timetable {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		String trains = ss.next() ; 
		if (trains.length()== 1 ) { 
			System.out.println(0);
		}
		else { 
			trains = trains.substring(1) ; 
			int number = 0 ; 
			if (trains.length()%2 == 0 ) { 
				number = trains.length()/2 + (trains.contains("1") ? 1 : 0 ) ; 
			}
			else { 
				number = trains.length()/2 + 1 ; 
			}
			System.out.println(number );
		}
	}

}
