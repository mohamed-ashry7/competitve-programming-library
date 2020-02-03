package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A583_AsphaltingRoads {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		int n = Integer.parseInt(br.readLine()) ; 
		String [] intersections = new String [n*n] ;
		for (int i = 0 ; i < intersections.length ; i ++ ) { 
			intersections[i] = br.readLine() ; 
		}
		ArrayList<String > picked = new ArrayList<>() ; 
		for (int i = 0 ; i< intersections.length ; i ++ ) { 
			StringTokenizer stt = new StringTokenizer(intersections[i]) ; 
			int h = Integer.parseInt(stt.nextToken()) ; 
			int v = Integer.parseInt(stt.nextToken()) ; 

			boolean yes = true ; 
			for (int j = 0 ; j < picked.size() ; j ++ ) { 
				 stt = new StringTokenizer(picked.get(j)) ; 
				int h1 = Integer.parseInt(stt.nextToken()) ; 
				int v1 = Integer.parseInt(stt.nextToken()) ;
				if (h1 == h || v1 == v) {
					yes = false ; 
					break; 
				}
			}
			if (yes ){
				System.out.print(i+1 + " ");
				picked.add(intersections[i]) ; 
			}
		}
	}

}
