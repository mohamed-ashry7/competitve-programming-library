import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class p12504_UpdatingaDictionary {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String oldD = br.readLine();
			String newD = br.readLine();
			oldD = oldD.substring(1, oldD.length() - 1);
			newD = newD.substring(1, newD.length() - 1);
			StringTokenizer oldy = new StringTokenizer(oldD, ",");
			StringTokenizer newy = new StringTokenizer(newD, ",");
			PriorityQueue<String> changed = new PriorityQueue<>();
			TreeMap<String, String> oldTree = new TreeMap<>();
			TreeMap<String, String> newTree = new TreeMap<>();
			while (oldy.hasMoreTokens()) {
				StringTokenizer entry = new StringTokenizer(oldy.nextToken(), ":");
				oldTree.put(entry.nextToken(), entry.nextToken());
			}
			while (newy.hasMoreTokens()) {
				StringTokenizer entry = new StringTokenizer(newy.nextToken(), ":");
				newTree.put(entry.nextToken(), entry.nextToken());
			}
			ArrayList<String> toBeRemoved = new ArrayList<>();
			if (oldTree.size() < newTree.size()) {
				java.util.Iterator it = oldTree.keySet().iterator();
				while (it.hasNext()) {
					String e = it.next().toString();
					if (newTree.containsKey(e)) {
						if (!newTree.get(e).equals(oldTree.get(e))) {
							changed.add(e);
						}
						toBeRemoved.add(e);
					}
				}

			} else {
				java.util.Iterator it = newTree.keySet().iterator();
				while (it.hasNext()) {

					String e = it.next().toString();
					if (oldTree.containsKey(e)) {
						if (!oldTree.get(e).equals(newTree.get(e))) {
							changed.add(e);
						}
						toBeRemoved.add(e);

					}
				}

			}
			for (int ii = 0; ii < toBeRemoved.size(); ii++) {
				newTree.remove(toBeRemoved.get(ii));
				oldTree.remove(toBeRemoved.get(ii));

			}
			if (newTree.size() == 0 && oldTree.size() == 0 && changed.size() == 0) {
				System.out.println("No changes");
				System.out.println();
			} else {
				if (newTree.size() > 0) {
					System.out.print("+");

					while (!newTree.isEmpty()) {

						System.out.print(newTree.pollFirstEntry().getKey());
						if (!newTree.isEmpty())
							System.out.print(",");

					}
					System.out.println();
				}
				if (oldTree.size() > 0) {
					System.out.print("-");

					while (!oldTree.isEmpty()) {
						System.out.print(oldTree.pollFirstEntry().getKey());
						if (!oldTree.isEmpty())
							System.out.print(",");
					}
					System.out.println();
				}
				if (changed.size() > 0) {
					System.out.print("*");

					while (!changed.isEmpty()) {
						System.out.print(changed.poll());
						if (!changed.isEmpty())
							System.out.print(",");
					}
					System.out.println();

				}
				System.out.println();

			}
		}
	}

}
