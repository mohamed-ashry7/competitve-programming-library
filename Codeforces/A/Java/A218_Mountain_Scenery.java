package Codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class A218_Mountain_Scenery {

	public static void main(String[] args) {
		Scanner ss =new Scanner (System.in) ; 
		int n = ss.nextInt() ; 
		int k = ss.nextInt() ; 
		int [] arr =new int [2*n+1] ; 
		for (int i =0 ; i < 2*n+1 ; ++ i ) { 
			arr[i] = ss.nextInt() ; 
		}
		for (int i = 1 ; i <arr.length &&k>0; i+=2) { 
			if(arr[i]-1>arr[i-1] &&arr[i]-1>arr[i+1])
			{
				arr[i]-- ;k--; 
				
			}
		}
		System.out.println(Arrays.toString(arr).replaceAll("[\\[\\]\\,]", ""));
	}

}
