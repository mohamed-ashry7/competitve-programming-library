package UVa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p713_Adding_Reversed_Numbers {
	
	
	static String filterFromLeadingZeroes(String str) { 
		
		Pattern pattern = Pattern.compile("[1-9]");
	    Matcher matcher = pattern.matcher(str);
	    matcher.find();
		return str.substring(matcher.start()); 
	}
	static String reverseNumber(char [] arr) {
		
		
		for (int i =0, j =arr.length-1 ; i<j ;i++,j--) {
			char t = arr[i] ; 
			arr[i] = arr[j] ;
			arr[j] = t ; 
		}
		return String.valueOf(arr); 
	}
	
	static String revFilter(char [] arr) { 
		return filterFromLeadingZeroes(reverseNumber(arr));
	}
	
	static String add(String str1 , String str2 ) { 
		
		str1 = reverseNumber(str1.toCharArray()) ; 
		str2 = reverseNumber(str2.toCharArray()) ; 

		String res = "" ;
		int carry = 0 ; 
		for (int i =0 ; i < Math.max(str1.length(), str2.length()) ; ++i ) { 
			int num1 = 0 ; 
			int num2 = 0 ; 
			if (i<str1.length()) { 
				num1 = Integer.parseInt(str1.charAt(i)+"");
			}
			if (i< str2.length()) {
				num2 = Integer.parseInt(str2.charAt(i)+"") ; 
			}
			int sum  = num1+num2+carry ; 
			carry = sum/10 ; 
			res += (sum%10) ; 
		}
		if (carry != 0 )
			res += carry ; 
		return filterFromLeadingZeroes(res) ; 
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		while (tests-- > 0) {
			
			StringTokenizer stt = new StringTokenizer(br.readLine()) ;
			String num1 = revFilter(stt.nextToken().toCharArray()) ;
			String num2 = revFilter(stt.nextToken().toCharArray()) ;
			System.out.println(add(num1,num2));
			
			
		}
	}
}
