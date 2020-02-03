import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p10360_Rat_Attack {

	static int[][] Rats;
	static int maxX, minX;
	static int maxY, minY;
	static int [][]window ; 
	static int d ; 
	static int howRats(int startX, int startY, int endX, int endY) {

		int rats = 0 ; 
		if (startX + startY == 0 ) { 
			for (int i = 0 ; i < endX ; i ++ ) { 
				for (int j = 0 ; j < endY ; j ++ ) { 
					rats += Rats[i][j] ; 
				}
			}
		}
		else if (startY == 0 ) { 
			rats = window[startX-1][startY] ; 
			for (int i = 0 ; i < endY ; i ++   ) { 
				rats = rats + Rats[endX-1][i] - Rats[startX-1][i] ; 
			}
		}
		else  { 
			rats = window [startX][startY-1]  ;
			for (int i = startX ; i<endX ; i ++ ) { 
				rats = rats +Rats[i][endY-1] - Rats[i][startY-1] ; 
			}
		}
		return rats ; 
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {
			d = Integer.parseInt(br.readLine())+1;
			int n = Integer.parseInt(br.readLine());
			Rats = new int[1025][1025];
			Triple [] coor = new Triple [n] ; 
			for (int i = 0; i < n; i++) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(stt.nextToken());
				int y = Integer.parseInt(stt.nextToken());
				int size = Integer.parseInt(stt.nextToken()) ; 
				Rats[x][y] = size ;
				coor[i] = new Triple (x,y , size ) ; 
			}
	

			int max = 0;
			int corX = 0;
			int corY = 0;
			window = new int [1025-d+1][1025-d+1] ; 
			for (int i = 0 ; i <1025-d + 1  ; i ++ ) { 
				int startX = i  ;
				int endX = i+d ;
				for (int j = 0 ; j < 1025-d+ 1 ; j ++ ) { 
					int startY = j ; 
					int endY = j+d ; 
					int gimme = howRats(startX, startY, endX, endY) ; 
					window[i][j] = gimme ; 
					if (gimme>max) { 
						max = gimme ; 
						corX = i ; 
						corY = j ; 
					}
				}
			}
			pw.println(corX + " " + corY + " " + max);
			pw.flush();
		}

		pw.close();
		br.close();

	}

	static class Triple {
		int x;
		int y;
		int size;

		public Triple(int x, int y, int size) {
			this.x = x;
			this.y = y;
			this.size = size;
		}

		int getX() {
			return x;
		}

		int getY() {
			return y;
		}

		int getSize() {
			return size;
		}
	}
}
