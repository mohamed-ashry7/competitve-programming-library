package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A404_Valera_and_X {

	
	static boolean checkit() throws IOException { 

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ;
		int n = Integer.parseInt(br.readLine()) ; 
		 
		char diagonal ='0' ; 
		char other ='0' ; 
		for (int i = 0 ; i< n ; ++i ) { 
			char [] line = br.readLine().toCharArray() ; 
			if (i ==  0) { 
				diagonal= line[0]; 
				other = line[1] ; 
				if (diagonal==other)return false ;
				
			}
			for(int j = 0 ; j<=n/2 ; ++j) { 
				if (j==i || j==n-i-1) { 
					if (line[j]!=diagonal || line[n-j-1]!=diagonal) {
						return false; 
					}
				}
				else { 
					if (line[j]!=other ||line[n-j-1]!=other) { 
						return false ; 
					}
				}
			}
		}
		return true ; 
		
	
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println(checkit()?"YES":"NO");
	}

}
