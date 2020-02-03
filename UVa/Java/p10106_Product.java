import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p10106_Product {

	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while (true ) { 
			String num1 = br.readLine();
			if (num1 == null || num1.length() == 0) { 
				break ; 
			}
			String num2 = br.readLine() ; 
			System.out.println(new BigInteger(num1).multiply(new BigInteger(num2)).toString());
		}
	}

}
