package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

public class D56_Changing_a_String {

	static char[] S;
	static char[] T;
	static int [][] memo  ; 
//	static String replaceWchar(String s, String t, int is, int it) {
//
//		return s.substring(0, is) + t.charAt(it) + s.substring(is + 1);
//	}
//
//	static String insert(String s, String t, int is, int it) {
//		return s.substring(0, is) + t.charAt(it) + s.substring(is);
//	}
//
//	static String delete(String s, int is) {
//		return s.substring(0, Math.max(0, is - 1)) + s.substring(is + 1);
//	}
//
//	public static int dp(String s, String t, int is, int it) {
//		if (s.equals(t)) {
//			return 0;
//		}
//		if (is>=s.length() && it>=t.length()) {
//			return (int) 1e6 ;
//		}
//
//		if (s.length() == t.length()) {
//			if (s.charAt(is) != t.charAt(it)) {
//				String replaced = replaceWchar(s, t, is, it);
//				return 1 + dp(replaced, t, is + 1, it + 1);
//			} else {
//				return dp(s, t, is + 1, it + 1);
//			}
//		} 
//		else if (s.length() < t.length()) {
//			String inserted = insert(s, t, is, it);
//			int insert = 1 + dp(inserted, t, is + 1, it + 1);
//			
//			if (is==s.length()) {
//				return insert ; 
//			}
//			if (s.charAt(is) != t.charAt(it)) {
////				Replace Or Insert 
//				String replaced = replaceWchar(s, t, is, it);
//				int replace = 1 + dp(replaced, t, is + 1, it + 1);
//
//				return Math.min(replace, insert);
//
//			} else {
////				Insert or untouch
//				return Math.min(insert, dp(s, t, is + 1, it + 1));
//			}
//
//		} else {
//
//			String deleted = delete(s, is);
//			int delete = 1 + dp(deleted, t, is + 1, it + 1);
//			if (it == t.length()) { 
//				return delete;
//			}
//			if (s.charAt(is) != t.charAt(it)) {
////				Replace Or delete 
//				String replaced = replaceWchar(s, t, is, it);
//				int replace = 1 + dp(replaced, t, is + 1, it + 1);
//
//				return Math.min(replace, delete);
//
//			} else {
////				Insert or untouch
//				return Math.min(delete, dp(s, t, is + 1, it + 1));
//			}
//
//		}
//	}

	static int dp(int is, int it) {
		
		if (memo[is][it] != -1) {
			return memo[is][it] ; 
		}
		if (is == S.length) {
			return memo[is][it] = T.length - it;
		}
		if (it == T.length) {
			return memo[is][it] =S.length - is;
		}
		if (S[is] == T[it]) {
			return memo[is][it] = dp(is + 1, it + 1);
		}
		return memo[is][it] = 1 + Math.min(dp(is, it + 1), Math.min(dp(is + 1, it), dp(is + 1, it + 1)));
	}
	static void print(int is, int it ) { 
		
		if (is == S.length) {
			while (it<T.length) {
				System.out.println("INSERT " + (it+1) + " "+T[it] );
				it++; 
			}
		}
		
		else if (it == T.length) {
			while (is<S.length) {
				System.out.println("DELETE " + (it+1) );
				is++; 
			}
		}
		else if (S[is] == T[it]) {
			print(is+1,it+1) ; 
		}
		else {
			int val = dp(is,it) ; 
			
			if (val == 1+dp(is+1,it+1)) {
				System.out.println("REPLACE "+ (it+1) + " " + T[it]);
				print(is+1,it+1) ; 
			}
			else if (val == 1+dp(is+1, it)) {
				System.out.println("DELETE "+ (it+1));
				print(is+1,it) ; 
			}
			else {
				System.out.println("INSERT "+ (it+1) + " " + T[it]);
				print(is,it+1) ; 
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = br.readLine().toCharArray();
		T = br.readLine().toCharArray();
		memo = new int [S.length+1] [T.length+1] ;  
		for (int [] row : memo) {
			Arrays.fill(row, -1) ; 
		}
		System.out.println(dp(0, 0));
		print(0,0) ;
	}
}
