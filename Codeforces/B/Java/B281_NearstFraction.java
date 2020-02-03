package Codeforces;
import java.util.Scanner  ; 
public class B281_NearstFraction {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in)  ;
		int a = ss.nextInt() ; 
		int b = ss.nextInt() ; 
		int n = ss.nextInt() ; 
		double g = (double)a/b ; 
		double com = 0 ; 
		double min = 1 ; 
		 String wan = "" ; 
		 double fra = 0 ; 
		for (int i = 1 ; i<=n ; i ++ ){
			for(int j = 0 ; true ; j ++ ){
				fra  = (double)j/i  ; 
				com = Math.abs(((double)j/i ) - g) ; 
				//System.out.println(j +" " + i + " " + com );
				if( com > min && fra >g )
					break ; 
				if (com<min){
				wan = j+"/"	+i ; 
				min = com ; 
				}
			}
			
		}
		System.out.println(wan);
	}

}
