package Codeforces;

import java.util.Scanner;

public class A785_Anton_and_Polyhedrons {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int summ = 0 ; 
		while (n-- > 0) {
			String next = ss.next();
			switch (next) {
			case "Tetrahedron":
				summ+=4 ; 
				break;
			case "Cube":
				summ+=6 ; 
				break;
			case "Octahedron":
				summ+=8 ; 
				break;
			case "Dodecahedron":
				summ+=12 ; 
				break;
			case "Icosahedron":
				summ+=20 ; 
			}
		}
		System.out.println(summ);
	}

}
