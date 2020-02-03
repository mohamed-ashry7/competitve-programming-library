import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class p11062_AndysSecondDictionary {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line, rem = "";
		TreeSet<String> dictionary = new TreeSet<>();
		while (true) {
			line = br.readLine();
			if (line == null || line.equals("0")) {
				break;
			}
			line = line.toLowerCase();
			line = line.replaceAll("[^a-z-]", " ").trim();
			String[] words = line.split(" ");
			for (String word : words) {

				if (word.length() != 0) {
					if (word.charAt(word.length() - 1) == '-')
						rem += word.substring(0, word.length() - 1);
					else if (word.charAt(0) == '-') { 
						rem += "-" ; 
						dictionary.add(rem) ;
						rem= "" ; 
						dictionary.add(word) ; 
					}
					else if (rem.length() != 0) {
						rem += word;
						dictionary.add(rem);
						rem = "";
					} else {
						dictionary.add(word);

					}
				}
			}

		}
		if (rem.length() != 0){
			dictionary.add(rem+"-") ; 
		}

		for (String x : dictionary) {
			if (!x.equals(""))
				System.out.println(x.trim());
		}
	}

}
