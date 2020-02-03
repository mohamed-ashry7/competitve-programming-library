import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Deque;
import java.util.LinkedList;

public class p11988_BrokenKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String line = "";
		while (true) {
			line = br.readLine() ; 
			if (line == null )
				break; 
			char[] arra = line.toCharArray();
			String curString = "";
			Deque<String> collected = new LinkedList<>();
			boolean open = false;
			for (char chara : arra) {
				if (chara == '[') {
					if (!open) {

						collected.addLast(curString);
					} else {

						collected.addFirst(curString);
					}
					open = true;
					curString = "";

				} else if (chara == ']') {
					if (open)
						collected.addFirst(curString);
					else
						collected.addLast(curString);

					open = false;
					curString = "";

				} else
					curString += chara;

			}
			if (open)
				collected.addFirst(curString);
			else
				collected.addLast(curString);

			while (!collected.isEmpty()) {
				out.print(collected.pollFirst());
			}
			out.flush();
			out.println();
		}
		out.close();

	}

}
