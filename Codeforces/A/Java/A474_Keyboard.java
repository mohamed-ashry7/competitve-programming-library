package Codeforces;
import java.util.Scanner ; 
public class A474_Keyboard {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		String one = "qwertyuiop[" ; 
		String two = "asdfghjkl;" ; 
		String three  = "zxcvbnm,./" ; 
		char a = ss.next().charAt(0) ; 
		String in = ss.next() ; 
		String out ="" ; 
		int rkm = 0 ; 
		for (int i = 0 ; i <in.length() ; i ++ ) { 
			if (one.indexOf(in.charAt(i)) != -1)
				rkm = 1 ; 
			else if (two.indexOf(in.charAt(i)) != -1)
				rkm = 2 ; 
			else 
				rkm = 3 ; 
			if (a == 'R'){
				if (rkm == 1 )
					out+=one.charAt(one.indexOf(in.charAt(i))-1) ; 
				else if (rkm == 2 )
					out+=two.charAt(two.indexOf(in.charAt(i))-1) ;
				else 
					out+=three.charAt(three.indexOf(in.charAt(i))-1) ;  
				
			}
			else {
				if (rkm == 1 )
					out+=one.charAt(one.indexOf(in.charAt(i))+1) ; 
				else if (rkm == 2 )
					out+=two.charAt(two.indexOf(in.charAt(i))+1) ;
				else 
					out+=three.charAt(three.indexOf(in.charAt(i))+1) ;  
			}
		}
		System.out.println(out);
	}

}
