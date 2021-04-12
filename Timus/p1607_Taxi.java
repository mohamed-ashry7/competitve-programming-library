package Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1607_Taxi {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stt = new StringTokenizer(br.readLine()) ;
		int a = Integer.parseInt(stt.nextToken());
		int b = Integer.parseInt(stt.nextToken()); 
		int c = Integer.parseInt(stt.nextToken()); 
		int d = Integer.parseInt(stt.nextToken());
		int alt = 0 ; 
		while (a<c) {
			if (alt%2==0)
				a+=b;
			else
				c-=d ; 
			alt+=1; 
		}
		System.out.println(alt%2==1?c:a);
		
	}

}
