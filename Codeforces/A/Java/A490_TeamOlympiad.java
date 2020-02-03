package Codeforces;
import java.util.Scanner ; 
public class A490_TeamOlympiad {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int [] a = new int [n] ; 
		int [] on = new int [n/3] ; 
		int [] tw = new int [n/3] ; 
		int [] thre = new int [n/3] ; 
		int one  = 0 ; 
		int two = 0 ; 
		int three = 0 ; 
		int min = 0 ; 
		for (int i = 0 ; i < n ; i ++ )  {
			a[i] = ss.nextInt() ; 
			if (a[i] == 1 ){
				if (one <on.length)
					on[one] = i+1 ; 
				one ++ ; 
				}
			else if (a[i]==2){
				if (two <tw.length)
					tw[two] = i+1 ; 
				two ++ ; }
			else if (a[i] == 3 ){
				if (three <thre.length)
					thre[three] = i+1 ; 
				three ++ ; }
		}
		if (one <= two && one <= three  )
			min = one ; 
		else if (two <= one && two <= three )
			min = two ; 
		else 
			min = three  ; 
		if (min == 0 )
			System.out.println(0);
		else 
		{
			System.out.println(min);
			for (int i = 0 ; i < min ; i++ ){
				System.out.println(on[i]+" "+tw[i]+" "+ thre[i]);
			}
		}
		
		
		
		
		
		
	
	
	}

}
