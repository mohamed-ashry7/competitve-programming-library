package Codeforces;
import java.util.Scanner  ; 
public class A11_IncreasingSequence {

	public static void main(String[] args) {
		Scanner ss = new Scanner  (System.in)  ;
		int  n = ss.nextInt() ; 
		int d = ss.nextInt() ; 
		int c = 0 ; 
	    int [] a = new int [n] ; 
	    int u = 0 ; 
	    int t = 0 ; 
	    a[0] = ss.nextInt() ; 
	    for (int i = 1 ; i<n ; i++ ){
	    	a[i] = ss.nextInt() ; 
	    	if (a[i]<a[i-1]){
	    		t = a[i-1]-a[i] ; 
	    		c+=(t/d ); 
	    		u = t/d ; 
	    		a[i]+=(d*(u)) ; 
	    		if (a[i]<=a[i-1]){
	    			c++ ; 
	    			a[i]+=d ; 
	    		}
	    	}
	    	else if (a[i]==a[i-1]){
	    		c++ ; 
	    		a[i]+=d ; 
	    	}
	    }
	    System.out.println(c);
	}

}
