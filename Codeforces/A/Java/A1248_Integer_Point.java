package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


	
public class A1248_Integer_Point {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		PrintWriter pw = new PrintWriter(System.out) ; 
	
		Scanner ss = new Scanner(System.in) ; 
		int tests = ss.nextInt();
		while (tests-- > 0) {
			int n = ss.nextInt();
			long evenP = 0;
			long oddP = 0;
			for (int i = 0 ; i < n ; ++ i ) {
			
				int num = ss.nextInt();
				if (num % 2 == 0) {
					evenP++;
				} else {
					oddP++;
				}
			}
			int m = ss.nextInt();
			long evenQ = 0;
			long oddQ = 0;
			for (int i = 0 ; i < m ; ++ i ) {
		
				int num = ss.nextInt(); 
				if (num % 2 == 0) {
					evenQ++;
				} else {
					oddQ++;
				}
			}
			
			long many = oddP * oddQ + evenQ *evenP;
			pw.println(many);
			pw.flush();
		}
		pw.close();
	}
	static class Scanner
    {
        StringTokenizer st;
        BufferedReader br;
 
        public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}
 
        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
 
        public int nextInt() throws IOException {return Integer.parseInt(next());}
 
        public long nextLong() throws IOException {return Long.parseLong(next());}
 
        public String nextLine() throws IOException {return br.readLine();}
 
        public boolean ready() throws IOException {return br.ready();}
 
 
    }

}
