package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class B637_ChatOrder {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		int n = Integer.parseInt(br.readLine()) ; 
		String [] a = new String [n] ;
		for (int i = n-1 ; i>=0 ; i -- ) { 
			a[i] = br.readLine() ; 
		}
		LinkedHashSet<String> set = new LinkedHashSet<>() ; 
		for (int i= 0 ; i < a.length ; i ++ ) { 
			set.add(a[i]) ; 
		}
		Iterator<String> it = set.iterator() ; 
		while (it.hasNext()) { 
			System.out.println(it.next());
		}
		
	}

}
