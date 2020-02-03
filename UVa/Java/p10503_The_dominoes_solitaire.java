import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10503_The_dominoes_solitaire {

	static Domino first;
	static Domino last;
	static Domino[] dominoes;
	static int[] chosen;
	static int n;

	static boolean backtrack(int put, int com) {
		
		if (put == n ) { 
			if (com == last.getLeftSide()) { 
				return true ; 
			}
			return false ;
		}
		for (int i = 0; i < dominoes.length; i++) {
			if (chosen[i] == 0) {

				if (com == dominoes[i].getLeftSide()) {
					chosen[i] = 1;
					if (backtrack(put + 1, dominoes[i].getRightSide())){
						return true; 
					}
					chosen[i] = 0;
				} 
				else if (com == dominoes[i].getRightSide()) {
					chosen[i] = 1;
					if (backtrack(put + 1, dominoes[i].getLeftSide())){
						return true; 
					}
					chosen[i] = 0;

				}

			}
		}
		return false; 
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			int m = Integer.parseInt(br.readLine());
			StringTokenizer stt = new StringTokenizer(br.readLine());
			first = new Domino(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()));
			stt = new StringTokenizer(br.readLine());
			last = new Domino(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()));

			dominoes = new Domino[m];
			for (int i = 0; i < m; i++) {
				stt = new StringTokenizer(br.readLine());
				dominoes[i] = new Domino(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()));
			}
			chosen = new int[m];
			if (backtrack(0, first.getRightSide())) { 
				System.out.println("YES");
			}
			else 
				System.out.println("NO");
		}
	}

	static class Domino {
		int left;
		int right;
		int locked;

		public Domino(int x, int y) {
			this.left = x;
			this.right = y;
		}

		boolean hasIt(int number) {
			return number == left || number == right;
		}

		int getLeftSide() {
			return left;
		}

		int getRightSide() {
			return right;
		}
		public String toString () { 
			return String.format("[ %d , %d ]" , left,right);
		}

	}

}
