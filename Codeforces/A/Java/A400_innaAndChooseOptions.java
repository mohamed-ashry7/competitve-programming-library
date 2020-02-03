package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class A400_innaAndChooseOptions {
	public static String check (String c) { 
		if (!c.contains("X")) { 
			return "0" ; 
		}
		int cc = 1 ; 
		String wan = "1x12 " ;
		if (!c.contains("O")){
			wan += "12x1 " ; 
			cc++ ; } 
		for (int i = 0 ; i <6 ; i+=1) { 
			if (c.charAt(i) == 'X' && c.charAt(i+6) == 'X') { 
				wan += "2x6 " ; 
				cc++ ; 
				break ; 
			}
		}
		for (int i = 0 ; i <3 ; i+=1) { 
			if (c.charAt(i) == 'X' && c.charAt(i+3) == 'X' && c.charAt(i+6) == 'X' && c.charAt(i+9) == 'X') { 
				wan += "4x3 " ; 
				cc++ ; 
				break ; 
			}
		}	
		for (int i = 0 ; i <4 ; i+=1) { 
			if (c.charAt(i) == 'X' && c.charAt(i+4) == 'X' && c.charAt(i+8) == 'X' ) { 
				wan += "3x4 " ; 
				cc++ ; 
				break ; 
			}
		}
		for (int i = 0 ; i <2 ; i+=1) { 
			if (c.charAt(i) == 'X' && c.charAt(i+2) == 'X' && c.charAt(i+4) == 'X' && c.charAt(i+6) == 'X'&& c.charAt(i+8) == 'X' && c.charAt(i+10) == 'X') { 
				wan += "6x2 " ; 
				cc++ ; 
				break ; 
			}
		}
		return cc + " " +  wan ; 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ;
		PrintWriter oo = new PrintWriter(System.out) ; 
		int n = ss.nextInt() ; 
		String c ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			c = ss.next() ; 
			oo.println(check(c));;
		}
		oo.flush();
	}

}
