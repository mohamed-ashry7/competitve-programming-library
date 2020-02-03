	package Codeforces;
	
	import java.util.Scanner;
	import java.util.StringTokenizer;
	
	public class A382_Ksenia_and_Pan_Scales {
	
		public static void main(String[] args) {
	
			Scanner ss =new Scanner (System.in) ; 
			String Line = ss.nextLine() ; 
			int index =Line.indexOf('|') ; 
			String first = Line.substring(0,index) ; 
			String second = Line.substring(index+1) ; 
			String adds = ss.nextLine() ; 
			if (first.length()==second.length()) { 
				if (adds.length()%2 ==0 ) { 
					first = first + adds.substring(0,(adds.length()+1)/2) ; 
					second = second + adds.substring((adds.length()+1)/2) ; 
					System.out.println(first+"|"+second);
				}
				else { 
					System.out.println("Impossible");
				}
			}
			else if (first.length()>second.length()+adds.length() || second.length()>first.length()+adds.length()) {
				System.out.println("Impossible");
			}
			else { 
				int wholeLength = (adds.length()+first.length()+second.length()) ; 
				if (wholeLength%2==0) {
					if (first.length()<second.length()) {
						int m = wholeLength/2 - first.length() ; 
						first += adds.substring(0,m) ;
						second += adds.substring(m) ; 
					}
					else {
						int m = wholeLength/2 - second.length() ; 
						second += adds.substring(0,m) ;
						first += adds.substring(m) ; 
					}
					System.out.println(first+"|"+second);
				}
				else { 
					System.out.println("Impossible");
				}
			}
		}
	
	}
