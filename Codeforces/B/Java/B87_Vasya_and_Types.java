package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class B87_Vasya_and_Types {

	static TreeMap<String, String> map;

	public static String typeof(String old) {

//		System.out.println("old --------> " + old);

		int asterisk = old.indexOf('*');
		int ampersand = old.lastIndexOf('&');

		String ak = "";
		String ad = "";

		if (asterisk < 0)
			asterisk = old.length();
		else
			ak = old.substring(asterisk);
		if (ampersand < 0)
			ampersand = -1;
		else
			ad = old.substring(0, ampersand + 1) ; 
			
		String between = old.substring(ampersand + 1, asterisk);
//		System.out.println("astersiii --------> " + ak + "  " + asterisk);
//		System.out.println("ampersand --------> " + ad + "  " + ampersand);

		if (between.equals("void")) {
			if (ad.length() > ak.length()) {
				return "errtype";
			} else if (ad.length() == ak.length()) {
				return "void";
			} else {
				String v = "void" + ak.substring(0, ak.length() - ad.length());
				return v;

			}
		} else if (between.equals("errtype")) {
			return "errtype";

		} else {
			String wan = map.get(between);
			if (wan == null ) { 
				return "errtype" ; 
			}
			return typeof(ad + wan + ak);
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		map = new TreeMap<>();
		while (n-- > 0) {

			StringTokenizer stt = new StringTokenizer(br.readLine());
			String operator = stt.nextToken();
			if (operator.equals("typeof")) {
				out.println(typeof(stt.nextToken()));
				out.flush();
			} else {
				String old = stt.nextToken();
				String assignee = stt.nextToken();
				String tt = typeof(old);
				map.put(assignee, tt);
			}
		}

	}

}
