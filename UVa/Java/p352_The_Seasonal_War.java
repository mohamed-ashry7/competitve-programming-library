import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p352_The_Seasonal_War {

	
	
	static char [] [] image ; 
	static void flood (int i , int j ) { 
		if (i<0 || j<0 ||i>=image.length||j>=image.length||image[i][j]=='0')return ; 
		image[i][j]='0' ; 
		flood(i+1,j+1) ; 
		flood(i,j+1) ; 
		flood(i+1,j) ; 
		flood(i-1,j-1) ; 
		flood(i-1,j) ; 
		flood(i,j-1) ; 
		flood(i+1,j-1) ; 
		flood(i-1,j+1) ; 

	}
	static int warEagles () { 
		int eagles = 0 ; 
		for (int i = 0 ; i < image.length ; ++i ) { 
			for (int j = 0 ; j<image.length ;++j) {
				if (image[i][j]=='1') {
					flood(i,j) ;
					++eagles ; 
				}
			}
		}
		return eagles ; 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int imageN = 1 ; 
		
		while (true) { 
			String str = br.readLine(); 
			if (str==null || str.length() == 0 ) { 
				break ; 
			}
			int number = Integer.parseInt(str);
			image = new char[number][number];
			for (int i = 0 ; i < number ; ++i) { 
				image[i] = br.readLine().toCharArray() ; 
			}
			int eagles = warEagles() ; 
			System.out.printf("Image number %d contains %d war eagles.\n",imageN++,eagles);
			
			
		}
		
	}

}
