package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class INVCNT_Inversion_Count {

	
	
	
	public static long merge(long [] a , int left, int mid, int right) { 
		
		
		int i = left ; 
		int j = mid+1; 
		long [] temp = new long [right-left+1]  ; 
		int c = 0 ; 
		long inv = 0 ; 
		while (i<=mid && j<=right) { 
			if (a[i]<=a[j]) {
				temp[c++] = a[i++]; 
			}
			else {
				inv += (mid-i+1) ;
				temp[c++] = a[j++];
				
			}
		}
		while (i<=mid) {
			temp[c++] = a[i++]; 

		}
		while(j<=right) {
			temp[c++] = a[j++]; 
		}
		c= 0 ; 
		while (left<=right) {
			a[left++] = temp[c++] ; 
		}
		return inv ; 
	}
	public static long mergeSort(long [] a,int left, int right) {
		
		if (left >= right) {
			return 0 ; 
		}
		int mid = (left+right)/2 ; 
		long inv = mergeSort(a,left,mid) +mergeSort(a,mid+1,right) ; 
		
		return merge(a,left,mid,right)+inv ; 
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
//		int [] b = new int [] {3,1,2} ;
//		System.out.println(mergeSort(b,0,2)) ;
//		System.out.println(Arrays.toString(b));
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in)) ; 
		
		int tests =Integer.parseInt(br.readLine()) ;  
		while(tests-->0) { 
			br.readLine(); 
			int n =Integer.parseInt(br.readLine())   ; 
			long [] a = new long [n] ; 
			int i = 0 ; 
			while (i<n) {
				a[i++]=Long.parseLong(br.readLine()) ; 
			}
			System.out.println(mergeSort(a, 0, n-1));
		}
	}
	
}
