import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p10026_ShoemakersProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		int n = Integer.parseInt( br.readLine()) ; 
		for (int i = 0 ; i < n  ; i ++ ) { 
			br.readLine() ; 
			int jobs = Integer.parseInt( br.readLine()) ; 
			Shoes [] a = new Shoes[jobs ] ; 
			for (int k = 0 ; k < jobs ; k ++ ) { 
				StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
				a[k] = new Shoes(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()), k+1) ; 
			}
			Arrays.sort(a , new Comparator<Shoes>() {
				@Override
				public int compare(Shoes o1, Shoes o2) {
					int com = 0 ; 
					if (o1.getRatio() > o2.getRatio()) { 
						com = -1 ; 
					}
					else if (o1.getRatio()< o2.getRatio()) {
						com = 1 ; 
					}
					return com ;
				}
			});
			for (int j = 0 ; j < jobs ; j ++ ) { 
				if (jobs - j > 1)
				System.out.print(a[j].getNumber() + " ");
				else {
					System.out.println(a[j].getNumber() );

				}
			}
			if ( n-i >  1 )
			System.out.println();
		}
		
		
	}
	
	
	static class Shoes {
		int days ; 
		int fine ;
		int number ; 
		public Shoes (int days , int fine , int number ) { 
			this.days = days ; 
			this.fine = fine ; 
			this.number = number ; 
		}
		public double getRatio () { 
			return (double )fine/days ; 
		}
		public int getNumber () { 
			return number ; 
		}
		
	}


}
