import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p11413_Fill_the_Containers {

	static int[] a;

	static int capacity(int container) {
		int con = 0;
		int cum = 0;
		boolean enter = false ;
		for (int i = 0; i < a.length;i++ ) {
			if (a[i] > container) {
				return (int) 1e7;
			} 
			if (cum < container) {
				cum += a[i];
			} 
			if (cum == container){
				con++;
				cum = 0;
			}
			if (cum> container) {
				con ++ ; 
				cum = 0 ;
				i-- ; 

			}

		}
		if (cum!=0 ) { 
			con ++ ; 
		}
		
		
		return con ; 
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {

			String readLine = br.readLine();
			if (readLine == null || readLine.length() == 0 ) { 
				break ; 
			}
			StringTokenizer stt = new StringTokenizer(readLine);
			int n = Integer.parseInt(stt.nextToken());
			int con = Integer.parseInt(stt.nextToken());
			a = new int[n];
			String readLine1 = br.readLine();
			stt = new StringTokenizer(readLine1);
			int sum = 0;
			int max = -1;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(stt.nextToken());
				sum += a[i];
				max = max > a[i] ? max : a[i];
			}
			
			int start = sum / con;
			int end = sum;
			int mid = (start + end) / 2;
			if (con == 1) {
				System.out.println(sum);
			} else {
				while (start<=end) {
					int flag = capacity(mid);
					if (mid == max && flag <= con) {
						break;
					}
					if (flag > con) {
						start = mid + 1;
						mid = (start + end) / 2;

					} else if (flag < con) {
						end = mid - 1;
						mid = (start + end) / 2;
					} else if (flag == con) {
						int ff = capacity(mid - 1) - con;
						if (ff == 0) {
							end = mid - 1;
							mid = (start + end) / 2;
						} else {
							break;
						}
					}
				}

				System.out.println(mid);
			}
		}
	}

}
