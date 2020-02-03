import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p299_Train_Swapping {
	public static int  merge(int[] a, int s, int mid, int e) {
		int s2 = mid + 1;
		int p = s;
		int[] temp = new int[e - s + 1];
		int k = 0;
		int n = 0 ; 
		while (k < temp.length) {
			if (s > mid) {
				temp[k++] = a[s2++];
			} else if (s2 > e) {
				temp[k++] = a[s++];
//				n++ ; 
			}

			else if (a[s] <= a[s2]) {
				temp[k++] = a[s++];
			} else if (a[s] > a[s2]) {
				temp[k++] = a[s2++];
				n+= mid- s+1 ; 

			}

		}
		for (int i = 0; i < temp.length; i++) {
			a[p++] = temp[i];
		}
		return n ; 

	}

	public static int  merge_sort(int[] a, int s, int e  ) {
		int inversions = 0 ; 
		if (s < e) {
			int mid = (s + e) / 2;

			inversions += merge_sort(a, s, mid);
			 inversions += merge_sort(a, mid + 1, e);
			 inversions += merge(a, s, mid, e);
		}
		return inversions ; 
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ; 
		int n = Integer.parseInt(br.readLine()) ; 
		for (int i = 0 ; i < n ; i ++ ) { 
			int len = Integer.parseInt(br.readLine()) ; 
			int [] a = new int [len] ; 
			int j = 0 ; 
			StringTokenizer stt = new StringTokenizer(br.readLine()) ; 
			while (stt.hasMoreTokens()) { 
				a[j++] = Integer.parseInt(stt.nextToken()) ;
			}
			System.out.println("Optimal train swapping takes "+ merge_sort(a, 0, len-1) +" swaps.");
		}
	}

}
