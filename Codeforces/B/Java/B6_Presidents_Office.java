package CF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class B6_Presidents_Office {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine()) ;
		int h = Integer.parseInt(stt.nextToken()) ;
		int w =Integer.parseInt(stt.nextToken()) ;
		char c = stt.nextToken().charAt(0) ;
		char [][] arr= new char[h][w] ; 
		for (int i = 0 ; i < h ; i ++ ) {
			arr[i] = br.readLine().toCharArray() ; 
		}
		
		TreeSet<Character> set = new TreeSet<>() ; 
		for(int i = 0 ; i < h ; ++i ) { 
			int index = String.valueOf(arr[i]).indexOf(c) ; 
			if (index >=0 ) { 
				for (int j = index ; j < w ; ++j  ) { 
					if (arr[i][j] ==c) { 
						if (i>0) {
							set.add(arr[i-1][j]) ; 
						}
						if (i<h-1) { 
							set.add(arr[i+1][j]);
						}
						if (j>0) { 
							set.add(arr[i][j-1]);
						}
						if (j<w-1) { 
							set.add(arr[i][j+1]);
						}
						
						
					}
					else {
						break ; 
					}
				}
			}
		}
		set.remove('.');
		set.remove(c) ; 
		System.out.println(set.size()) ;


	}

}
