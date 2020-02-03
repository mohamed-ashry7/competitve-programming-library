package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A483_Counterexample {
	
	static boolean areTheyCoprimes(long l , long r)  { 
		for (int i = 2 ; i <=50 ; ++i ) { 
			if (r%i==0 && l%i==0) { 
				return false ; 
			}
		}
		return true ;
	}
	static void getNumber (long l , long h ) {
		int diff = (int)(h-l) ; 
		for (int i = 0 ; i<=diff ; ++i) { 
			long number1 = i+l ; 
			for (int j = i+1 ; j <=diff; ++j) { 
				long number2 = j+l ; 
				boolean coPrimes = areTheyCoprimes(number1, number2) ;
				if (!coPrimes) { 
					long mid = number1+1 ; 
					while (mid<number2) { 
						if (areTheyCoprimes(number1,mid) && areTheyCoprimes(mid,number2)) { 
							System.out.printf(number1+" " + mid + " " + number2 );
							return ; 
						}
						mid ++ ; 
					}
				}
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
		long l = Long.parseLong(stt.nextToken());
		long h = Long.parseLong(stt.nextToken()) ; 
		getNumber(l, h);
	}

}
