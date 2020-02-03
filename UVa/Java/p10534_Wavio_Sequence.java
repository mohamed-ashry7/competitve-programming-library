import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class p10534_Wavio_Sequence {

	static int wavioSeq(int[] numbers) {

		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();
		ArrayList<Integer> leftInd = new ArrayList<>();
		ArrayList<Integer> rightInd = new ArrayList<>();

		left.add(numbers[0]);
		leftInd.add(0) ; 
		for (int i = 1; i < numbers.length; ++i) {
			if (numbers[i] > left.get(left.size() - 1)) {
				leftInd.add(left.size()) ; 
				left.add(numbers[i]);

			} else {
				int index = Collections.binarySearch(left, numbers[i]);
				if (index < 0) {
					index = -(index + 1);
					left.set(index, numbers[i]);

				}
				leftInd.add(index);
			}
		}
		int len = numbers.length;
		right.add(numbers[len - 1]);
		rightInd.add(0) ; 
		for (int i = len - 2; i >= 0; --i) {
			if (numbers[i] > right.get(right.size() - 1)) {
				rightInd.add(right.size()) ; 
				right.add(numbers[i]);
			} else {
				int index = Collections.binarySearch(right, numbers[i]);
				if (index < 0) {
					index = -(index + 1);
					right.set(index, numbers[i]);
				}
				rightInd.add(index) ; 
			}
		}
		int seq = 1;

		for (int i = 0; i < leftInd.size(); ++i) {
		
				seq = Math.max(seq, 1+Math.min(leftInd.get(i), rightInd.get(rightInd.size()-i -1)));
			
		}
		return 2*seq-1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt  ; 
		
		
		while (true ) { 
			String line = br.readLine() ; 
			if (line == null || line.length() == 0 ) { 
				break ; 
			}
			int n = Integer.parseInt(line ) ; 
			stt = new StringTokenizer(br.readLine()) ; 
			int [] numbers = new int [n] ; 
			for (int i= 0 ; i < n ; ++ i ) { 
				if (stt.countTokens() == 0 )  { 
					stt = new StringTokenizer(br.readLine()) ;  
				}
				numbers [i] = Integer.parseInt(stt.nextToken()) ; 
			}
			System.out.println(wavioSeq(numbers));
		}
	}

}
