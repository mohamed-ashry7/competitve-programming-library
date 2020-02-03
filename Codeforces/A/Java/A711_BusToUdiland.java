package Codeforces;
import java.util.Scanner ; 
public class A711_BusToUdiland {
	public static void dis (String []a ){
		for (int i = 0 ; i <a.length ; i ++ ){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		String[] a = new String [n] ;
		for (int i = 0 ; i <n ; i ++ ){
			a[i] = ss.next() ; 
		}
		boolean flag = false ; 
		for (int i = 0 ; i <n ; i ++ ){ 
			if (a[i].substring(0,2).equals("OO"))
			{
				flag = true ; 
				a[i] = "++"+a[i].substring(2) ; 
				break ; 
			}
			else if (a[i].substring(3).equals("OO")){
				flag = true ; 
				a[i] = a[i].substring(0, 3)+"++"  ; 
				break ; 
			}
		}
		if (flag){
			System.out.println("YES");
			dis(a) ; 
		}
		else 
			System.out.println("NO");
	}

}
