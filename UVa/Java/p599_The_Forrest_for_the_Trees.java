import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class p599_The_Forrest_for_the_Trees {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		while (tests-- > 0) {

			String edge = br.readLine();
			TreeSet<String> seenNodes = new TreeSet<>();
			ArrayList<TreeSet> trees = new ArrayList<>();
			while (!edge.contains("*")) {
				String charone = edge.charAt(1) + "";
				String chartwo = edge.charAt(3) + "";
				seenNodes.add(charone) ; 
				seenNodes.add(chartwo) ; 
				boolean found = false;
				int f = -1 ; 
				int size = trees.size() ; 
				for (int i = 0; i < size ; i++) {
					if (trees.get(i).contains(charone) || trees.get(i).contains(chartwo)) {
						if (found ) { 
							trees.get(f).addAll(trees.get(i)) ; 
							trees.remove(i) ; 
							i-- ;
							size-- ; 
						}
						else {
						trees.get(i).add(charone);
						trees.get(i).add(chartwo);
						f = i ; 
						found = true;
						}

					}
				}

				if (!found) {
					trees.add(new TreeSet() {
						{
							add(charone);
							add(chartwo);
						}
					});
				}

				edge = br.readLine();
			}
			int allNodes = new StringTokenizer(br.readLine(),",").countTokens();
			int acorns = allNodes - seenNodes.size();
			int treesNumber = trees.size() ;
			System.out.printf("There are %d tree(s) and %d acorn(s).\n", treesNumber, acorns);
		}
	}

}
