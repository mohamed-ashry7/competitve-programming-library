package Codeforces;
import java.util.Scanner  ; 

import java.io.PrintWriter ; 
public class A384_coder {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		PrintWriter pp = new PrintWriter(System.out) ; 
		int n  = ss.nextInt() ;  
		String wan1  = ""  ;
		String wan2 = "" ; 
		for (int j = 0 ; j < n/2 ; j ++   ) { 
				wan1+= "C." ; 
			}
			
		if (n%2==0)
		{
			wan2+="."+wan1.substring(0,n-1) ; 
			
		}
		else {
			wan1+="C" ; 
			wan2=wan1.substring(1)+"." ; 
		}
		String kk = wan1+"\n" +wan2 ; 
		
		
		int y = 0 ; 
		if (n%2 == 0 )
			y = (n*n) / 2 ; 
		else 
			y = (n*n + 1 ) / 2 ; 
		
		System.out.println(y);
		for (int i = 0 ; i <n/2 ; i ++ ) { 
			pp.println(kk);
			pp.flush();
		}
		if (n%2 == 1){
			pp.println(wan1);
			pp.flush();
			pp.close();
		}
		
		
		
	}

}
