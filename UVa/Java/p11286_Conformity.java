import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class p11286_Conformity {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			if (line.equals("0")) {
				break;
			}
			TreeMap<String, Integer > theMap = new TreeMap<>() ; 
			for (int i = 0; i < Integer.parseInt(line); i++) {
				String courses = br.readLine();
				String[] a = courses.split(" ");
				Arrays.sort(a);
				courses = Arrays.toString(a);
				if (theMap.containsKey(courses)) {
					theMap.put(courses, theMap.get(courses)+1) ; 
				}
				else {
					theMap.put(courses, 1) ; 
				}
				
				
			}
			int max  = Integer.MIN_VALUE ; 
			int winners = 1 ;
			for (String x : theMap.keySet()) { 
				if (max < theMap.get(x)){
					winners = 1 ; 
					max = theMap.get(x) ; 
				}
				else if (max == theMap.get(x)) {
					winners ++ ; 
				}
			
			}
			System.out.println(winners*max);
		}

	}
}
