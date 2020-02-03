package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_Spreadsheets {

	
	public static String convert (String str ) { 
		String check = str.replaceAll("[0-9]", " ") ; 
		StringTokenizer stt  =new StringTokenizer(check) ;
		if (stt.countTokens() == 1 ) 
			return convert1(str) ; 
		return convert2(str ); 
			
		
	}
	public static String convert1 (String str ) { 
		String col = "" ; 
		int i = 0 ; 
		for ( ;  i < str.length() ; i ++ ) { 
			if (str.charAt(i) >= 'A' && str.charAt(i) <='Z') { 
				col+=str.charAt(i) ; 
			}
			else {
				break ; 
			}
		}
	 
		int row = Integer.parseInt(str.substring(i) ) ;
		int val = 0 ; 
		for ( i = 0 ; i <col.length() ; i ++ ) { 
			int k = col.length()-i-1 ; 
			int c = col.charAt(k)-'A' + 1;
			val += (int ) Math.pow(26, i) * c ; 
		}
		String wan  = "R" +row + "C"+val ; 
		
		
		return wan ; 
				
	}
	public static String convert2 (String str ) { 
		String r = "" ; 
		int i = 1   ; 
		for ( ; i < str.length() ; i ++ ) { 
			char c = str.charAt(i) ; 
			if (c>='0' && c<='9'){
				r +=c ; 
			}
			else {
				break ; 
			}
		}
		int col = Integer.parseInt(str.substring(i+1)) ; 
		String cc = "" ; 
		while (col > 0 ) { 
			int rem = col%26 ; 
			if (rem == 0 ) { 
				cc ='Z' +cc  ; 
				col -= 26 ; 
			}
			else { 
				char added =(char) ('A' + rem - 1) ; 
				cc = added + cc  ; 
				col-=rem ; 
			}
			col/= 26 ; 
			
		}
		return cc+r ; 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		int n = Integer.parseInt(br.readLine()) ; 
		
		for (int i = 0 ; i < n ; i ++ ) { 
			String casee  = br.readLine(); 
			System.out.println(convert(casee ));
		}
	}

}
