package Codeforces;
import java.util.Scanner ; 
import java.io.PrintWriter ; 

public class A510_FoxAndSnake {

	public static void main(String[] args) {
		Scanner  ss =new Scanner (System.in)  ; 
		PrintWriter pp = new PrintWriter(System.out) ; 
		int n = ss.nextInt() ; 
		int m = ss.nextInt() ; 
		boolean rl = true  ;
		String h= "" ; 
		String right = "" ; 
		String left= "" ; 
		for (int i = 0 ; i <m ; i ++ ) { 
			h+="#"  ; 
			right+="." ; 
		}
		left =  "#" + right.substring(0,m-1) ; 
		right = right.substring(0,m-1) +"#"; 
		String k = "" ; 
		for (int i = 0 ; i <n ; i ++){
			if (i%2 == 0 ){
				pp.println(h);
				pp.flush();
			}
			else{
				if (rl){
					pp.println(right);
					pp.flush();
					rl = false ; 
				}
				else {
					pp.println(left);
					pp.flush();
					rl = true ; 
				}
			}
		}
	}

}
