package Codeforces;

import java.util.Scanner;

public class B831_KeyBoardLayouts {
	
	public static void convert(String s1 , String s2 , String s3 ) {
		String s11 = s1.toUpperCase() ; 
		String s22 = s2.toUpperCase() ; 
		String wan = "" ; 
		for (int i = 0 ; i <s3.length() ; i ++ ) { 
			int g= s1.indexOf(s3.charAt(i)) ; 
			int G = s11.indexOf(s3.charAt(i)) ; 
			if (g!= -1) { 
				wan+=s2.charAt(g) ; 
			}
			else if (G!=-1)
				wan+=s22.charAt(G) ;
			else 
				wan +=s3.charAt(i);
		}
		System.out.println(wan);
	}
	
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		convert (ss.next() , ss.next() , ss.next() ) ; 
	}

}
