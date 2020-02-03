import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class p10264_theMostPotentCorner {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String n;
		while ((n = br.readLine()) != null) {
			int dimensions = Integer.parseInt(n);
			int corners[] = new int[(int) Math.pow(2, dimensions)];
			for (int i = 0; i < (int) Math.pow(2, dimensions); i++) {
				corners[i] = Integer.parseInt(br.readLine());
			}
			int weights[] = new int[corners.length];
			for (int c = 0; c < corners.length; c++) {
				for (int i = 0; i < dimensions; i++) {
					weights[c]+= corners[c^(1<<i)] ; 
					
				}

			}
			int max = -1 ; 
			for (int c = 0; c < corners.length; c++) {
				for (int i = 0; i < dimensions; i++) {
					if (weights[c]+weights[c^(1<<i)] > max) { 
						max = weights[c] + weights[c^(1<<i)] ; 
					}
					
				}

			}
			pw.println(max);
			pw.flush();
		}

	}

}
