package Codeforces;
import java.util.Scanner ;
public class B266_QueueAttheSchool {

	public static void main(String[] args) {
		
		Scanner ss =new Scanner (System.in)  ;
		int c = ss.nextInt() ; 
		int t = ss.nextInt() ; 
		String w = ss.next() ; 
		String g = w  ;
		int  j  ; 
		for (int i = 0 ; i <t ; i ++ ){
			if (w.lastIndexOf('G')<w.indexOf('B'))
				break; 
			g = w ; 
			j = g.indexOf('B') ; 
			while ( j != -1 && j !=w.length() - 1 ){
					if (w.charAt(j+1) == 'G' ){
						w  = w.substring(0,j)+"GB"+w.substring(j+2) ; 
					}
					g = g.substring(0,j)+"k"+g.substring(j+1);
					j = g.indexOf('B') ; 
			
			}

		}
		System.out.println(w);
	}

}
