package Codeforces;
import java.util.Scanner  ; 
public class A837_TextVolume {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ;
		String h = ss.nextLine() ; 
		int a = Integer.parseInt(h); 
		String b = ss.nextLine() ; 
		int c = 0 ; 
		int max = 0 ; 
		for (int i = 0 ; i <b.length() ; i ++ ){
			if (b.charAt(i)>='A' && b.charAt(i)<='Z') {
				c++ ; 
			}
			else if (b.charAt(i) ==' '){
				if (c>max){
					max = c ; 
				}
				c = 0 ; 
			}
			if (i == a-1){
				if (c>max)
					max = c ; 
				break ; 
			}
		}
		System.out.println(max );
	}

}
