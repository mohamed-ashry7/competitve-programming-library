package Codeforces;
import java.util.Scanner ;
public class A818_DiplomasAndCertificates {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		long n =(long) ss.nextLong() ; 
		long k =(long) ss.nextLong() ; 
		int i = 2 ; 
		if (n== 1 )
			System.out.println(0+" "+0+" "+1);
		else {
		//for (; i<=n; i++){
		//	if(n%i==0&&((n/i)%(k) == 0 || (n/i)%(k+1) == 0)){
		//		break ; 
		//	}
		//}
			
		long dip = (long)(n/2)/(k+1) ; 
		long cer = (long)(dip*k)  ; 
		long no =(long) (n-dip-cer) ;
		/*for (; dip<n/2 ; ){
			
		}*/
		System.out.println(dip+" "+ cer +" "+no);
	}
	}
}
