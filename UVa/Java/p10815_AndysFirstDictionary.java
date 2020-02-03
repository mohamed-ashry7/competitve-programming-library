import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;

public class p10815_AndysFirstDictionary {

	
	
	
	public static void main(String[] args) throws IOException {

		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		
		
		String line ; 
		TreeSet<String > dictionary = new TreeSet<>() ; 
		while (true ) { 
			 line =br.readLine() ; 
			 if (line == null || line .equals("H33H"))
				 break ; 
			line = line.toLowerCase() ;
			line = line.replaceAll("[^a-z]", " ") ; 
			String [] words = line.split(" ");
			for (String word : words ) { 
				if (!word.equals(""))
					dictionary.add( word) ; 
				
			}
			
			
			
			
		}

		for (String x : dictionary) { 
			System.out.println(x.trim());
		}

		
		
	}

}
