import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

public class p11849_CD {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			BitSet jack = new BitSet();
			BitSet jill = new BitSet();
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int ack = Integer.parseInt(stt.nextToken());
			int ill = Integer.parseInt(stt.nextToken());
			if (ack == ill && ack==0 ){
				break ; 
			}
			for (int i = 0; i < ack; i++) {
				int pos = Integer.parseInt(br.readLine());
				jack.set(pos);
			}
			for (int i = 0; i < ill; i++) {
				int pos = Integer.parseInt(br.readLine());
				jill.set(pos);
			}
			jack.and(jill);
			System.out.println(jack.cardinality());
						
		}
	}

}
