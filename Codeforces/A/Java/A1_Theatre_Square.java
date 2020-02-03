package Codeforces;

import java.util.Scanner;

public class A1_Theatre_Square {
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in)  ;
		long w  =ss.nextInt() ; 
		int l = ss.nextInt() ; 
		int a = ss.nextInt() ; 
		long c = 1 ; long  t;
		long k=1; 
		if(a==1)
			t= w*l ; 
		else{
		for (;c*a<w ;c++ ){}
		if(a<l){
		for(;k*a<l ; k++){}}
		  t = (long)(k * c) ; }
		System.out.println(t);
	}
}
