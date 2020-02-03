package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1244_Rooms_and_Staircases {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		while (tests-->0) { 
			int n = Integer.parseInt(br.readLine());
			String rooms = br.readLine() ; 
			int firstIndex = rooms.indexOf("1") ; 
			int lastIndex = rooms.lastIndexOf("1") ; 
			if (firstIndex <0 && lastIndex <0) { 
				System.out.println(n) ;
			}
			else {
				int dis = Math.max(n-firstIndex, lastIndex+1) ; 
				System.out.println(Math.max(2*dis, n));
			}
			
		}
	}

}
