package Codeforces;

import java.util.Scanner;

public class A287_IQ_Test {

	static boolean checkSquares(int a , int b , int c , int d) { 
		int countHash = 0 ; 
		if (a=='#')countHash ++ ; 
		if (b=='#')countHash ++ ; 
		if (c=='#')countHash ++ ; 
		if (d=='#')countHash ++ ;
		
		int countDot = 0 ; 
		if (a=='.')countDot ++ ; 
		if (b=='.')countDot ++ ; 
		if (c=='.')countDot ++ ; 
		if (d=='.')countDot ++ ;
		return countHash == 3 || countHash == 4 || countDot == 3 || countDot == 4 ; 
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in) ; 
		char [] [] squares = new char [4][4] ; 
		for (int i = 0 ; i < 4 ; ++i ) { 
			squares[i] = ss.nextLine().toCharArray() ; 
 		}
		
		for (int i = 0 ; i < 3 ;++i ) {
			for (int j = 0 ; j<3 ; ++ j ) { 
				if (checkSquares(squares[i][j] ,squares[i][j+1], squares[i+1][j] , squares[i+1][j+1] )) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}

}
