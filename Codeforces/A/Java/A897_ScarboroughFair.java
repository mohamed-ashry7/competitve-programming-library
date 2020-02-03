package Codeforces;
import java.util.Scanner ; 
import java.io.* ; 
public class A897_ScarboroughFair {

	public static void main(String[] args) {
		Scanner ss  = new Scanner (new  BufferedReader(new InputStreamReader(System.in))) ; 
		int n = ss.nextInt() ; 
		int m = ss.nextInt() ; 
		String s = ss.next() ; 
		int l ,r ; char c1 ,c2 ; 
		for (int i = 0 ; i < m ; i ++  ) { 
			l = ss.nextInt()- 1 ; 
			r = ss.nextInt() -1 ; 
			c1 = ss.next().charAt(0) ; 
			c2 = ss.next().charAt(0) ; 
			String s1 = s.substring(0,l) ; 
			String s2 = s.substring(l,r+1) ; 
			String s3 = s.substring(r+1) ;
			int c = s2.indexOf(c1) ; 
			s2 = s2.replaceAll(c1+"", c2+"") ; 
			s = s1 + s2 + s3 ; 
		}
		System.out.println(s);
	}

}
