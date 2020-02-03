import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 public class p272_TEX_Quotes {

	public  static void main(String[] args) throws IOException {
		BufferedReader  ss = new BufferedReader (new InputStreamReader(System.in)); 
		String string  ; 
		int f = 0 ; 

		while ((string = ss.readLine())!=null ){
			int i = string.indexOf('\"') ;
		while (i != -1 ) { 
			if (f == 0 ) { 
				string = string.substring(0,i) +"``" + string.substring(i+1) ; 
				 i = string.indexOf('\"') ;
				f = 1 ; 
			}
			else {
				string = string.substring(0,i) +"''" + string.substring(i+1) ; 
				 i = string.indexOf('\"') ;
				f = 0; 
			}
		}
		System.out.println(string);

		}
	}
}
