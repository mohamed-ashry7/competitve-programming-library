package CF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B363_Fence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int k = Integer.parseInt(stt.nextToken());
		int[] arr = new int[n];
		stt = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE;
		int index = 1;
		for (int i = 0; i < n; ++i) {
			arr[i] = Integer.parseInt(stt.nextToken()) + (i==0?0:arr[i - 1]);
			if (i >= k - 1) {
				if (i == k - 1) {
					min = arr[i];
					index = 1;
				} 
				else {
					int can = arr[i] - arr[i - k];
					if (can < min) {
						min = can;
						index = i - k + 2;
					}
				}
			}

		}
//		int min = arr[k-1] ; 
//		int index =1 ; 
//		for (int i = 1 ; i <n-k ; ++i) { 
//			int can = arr[k+i-1]-arr[i-1] ; 
//			if (can<min)
//			{
//				min = can ; 
//				index = i + 1 ; 
//			}
//		}
		System.out.println(index);
	}

}
