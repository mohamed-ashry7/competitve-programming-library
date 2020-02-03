package Codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A782_AndryushaAndSocks {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
//		ArrayList<Integer> socks = new ArrayList<Integer>();
		Map<Integer, Integer> sock = new HashMap<Integer, Integer>();
		int f = ss.nextInt();
		int s;
		int max = 1;
//		socks.add(f);
		sock.put(f, f);
		for (int i = 0; i < 2*n - 1; i++) {
			s = ss.nextInt();
			boolean found = false;

			if (sock.get(s)!= null && s == sock.get(s)) {
				sock.remove(s);
				found = true;
			}
			if (!found) {
				sock.put(s,s);
				max = max > sock.size() ? max : sock.size();
			}
		}
		System.out.println(max);
	}

}
