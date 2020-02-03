package Codeforces;

import java.util.Scanner;

public class B287_Pipeline {

	static long howMany(long low, long high, long k , long n ) 
	{
		
		long min = Long.MAX_VALUE ; 
		while (low <=high) { 
			long mid = (low + high) / 2 ; 
			long lowerBound = (mid *(mid+1)) / 2 +1; 
			long comp = k - mid - 1 ; 
			long upperBound =  0 ; 
			if (comp == 1 ) { 
				upperBound = k*(k-1) /2 ; 
			}
			else { 
				long summOfFirst = comp*(comp+1)/2 + 1 ; 
				upperBound = k*(k-1) / 2 + 1 - (summOfFirst)+1 ; 
			}
			if (n<lowerBound) { 
				high = mid - 1 ; 
			}
			else if (n>upperBound) {
				low = mid + 1 ; 
			}
			else  { 
				min = Math.min(mid, min) ; 
				high = mid - 1 ; 
			}
			
		}
		return min ; 
	}

	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		long n = ss.nextLong();
		long k = ss.nextLong();
		long lower = 2;
		long upper = (k * (k - 1)) / 2 + 1l;
		if (n < lower || n > upper) {
			System.out.println(n==1?0:-1);
		} else {
			if (n <= k) {
				System.out.println(1);
			}
			else if (n==upper) {
				System.out.println(k-1);
			}
			else {
				System.out.println(howMany(2, k-1, k, n));
			}
		}
	}

}
