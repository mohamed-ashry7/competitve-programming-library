package Codeforces;
import java.util.Scanner  ; 
public class A540_CombinationLock {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		int k = ss.nextInt() ; 
		String a = ss.next() ; 
		String b = ss.next() ; 
		int aa  = 0 ; 
		int bb = 0 ; 
		int mo = 0 ; 
		for (int i = 0 ; i <k ; i ++ ){
			aa = Integer.parseInt(a.charAt(i)+"") ; 
			bb = Integer.parseInt(b.charAt(i)+"")  ;
			if (Math.abs(aa-bb) > 5){
				if (aa>bb)
					bb+=10 ; 
				else 
					aa+=10; 
			}
			mo+=Math.abs(aa-bb) ; 
		}
		mo = (int)mo ; 
		System.out.println(mo);
	}

}
