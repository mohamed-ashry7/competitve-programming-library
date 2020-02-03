package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B279_Books {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine()) ; 

		int n = Integer.parseInt(stt.nextToken()) ; 
		int t = Integer.parseInt(stt.nextToken()) ; 
		 stt = new StringTokenizer(br.readLine()) ; 
		int [] books = new int [n] ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			books[i] = Integer.parseInt(stt.nextToken()) ; 
		}
		int max = -1 ; 
		int read = 0 ; 
		int takenBooks = 0 ; 
		int i = 0 ; 
		int j = 0 ; 
		for ( ; i <n && j <n ; ) { 
			read += books[j] ; 
			if (t>=read) { 
				j++ ;
				takenBooks++ ; 
				
			}
			else {
				max = takenBooks > max ? takenBooks : max ; 
				read= read -books[i] - books[j] ; 
				i++ ; 
				takenBooks-- ; 
			}
		}
		
		max = takenBooks > max ? takenBooks : max ; 
		System.out.println(max);
	}

}
