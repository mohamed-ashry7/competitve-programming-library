import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11953_Battleships {

	
	
	static char [][] board ; 
	static int N ; 
	static void flood (int i , int j ) { 
		if (i<0 || i >= N || j<0 || j>=N || board[i][j]=='.')
			return ;
		board[i][j] = '.' ; 
		flood (i,j+1) ; 
		flood (i,j-1) ; 
		flood (i+1,j) ; 
		flood (i-1,j) ; 

		
	}
	static int numberOfShips () { 
		int ships = 0 ; 
		for (int i = 0 ; i < N; ++ i ) { 
			for (int  j = 0 ; j <N ; ++ j ) {
				if (board[i][j] == 'x') { 
					ships ++ ; 
					flood (i , j ) ; 
				}
			}
		}
		return ships ; 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		int cc = 0;
		while (cc++ < cases) {
			N= Integer.parseInt(br.readLine());
			board = new char [N][N] ; 
			for (int i = 0; i < N; ++i) {
				board [i] = br.readLine().toCharArray() ; 
			}
			System.out.printf("Case %d: %d\n",cc,numberOfShips());

		}
	}

}
