package Codeforces;
import java.util.Scanner ; 
public class A363_soroban {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		String  zero  = "O-|-OOOO" ; 
		String one =  "O-|O-OOO" ;
		String two = "O-|OO-OO" ;
		String three = "O-|OOO-O" ;
		String four = "O-|OOOO-" ;
		String five = "-O|-OOOO" ;
		String six = "-O|O-OOO" ;
		String seven = "-O|OO-OO" ;
		String eight = "-O|OOO-O" ;
		String nine  = "-O|OOOO-" ;
		int n = ss.nextInt() ; 
		String wan = ""  ;
		int ahoh = 0 ; 
		if (n== 0 )
			System.out.println(zero);
		while (n> 0 ){
			ahoh = n%10 ;
			n/=10 ;
			if (n!=0){
			switch (ahoh ){
			case 0 : wan +=zero+"\n" ; break  ; 
			case 1 : wan +=one+"\n" ; break  ; 
			case 2 : wan +=two+"\n" ; break  ; 
			case 3 : wan +=three+"\n" ; break  ; 
			case 4 : wan +=four+"\n" ; break  ; 
			case 5 : wan +=five+"\n" ; break  ; 
			case 6 : wan +=six+"\n" ; break  ; 
			case 7 : wan +=seven+"\n" ; break  ; 
			case 8 : wan +=eight+"\n" ; break  ; 
			case 9 : wan +=nine+"\n" ; break  ; 
			
			}
			}
			else {
				
					switch (ahoh ){
					case 0 : wan +=zero; break  ; 
					case 1 : wan +=one ; break  ; 
					case 2 : wan +=two ; break  ; 
					case 3 : wan +=three ; break  ; 
					case 4 : wan +=four; break  ; 
					case 5 : wan +=five ; break  ; 
					case 6 : wan +=six ; break  ; 
					case 7 : wan +=seven; break  ; 
					case 8 : wan +=eight; break  ; 
					case 9 : wan +=nine; break  ; 
					
					}
			}
		}
			System.out.println(wan);
	}

}
