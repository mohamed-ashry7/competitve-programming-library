import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11495_Bubbles_and_Buckets {
	public static long merge(int[] a, int s, int mid, int e) {
		int s2 = mid + 1;
		int p = s;
		int[] temp = new int[e - s + 1];
		int k = 0;
		long n = 0;
		while (k < temp.length) {
			if (s > mid) {
				temp[k++] = a[s2++];
			} else if (s2 > e) {
				temp[k++] = a[s++];
				// n++ ;
			}

			else if (a[s] <= a[s2]) {
				temp[k++] = a[s++];
			} else if (a[s] > a[s2]) {
				temp[k++] = a[s2++];
				n += mid - s + 1;

			}

		}
		for (int i = 0; i < temp.length; i++) {
			a[p++] = temp[i];
		}
		return n;

	}

	public static long merge_sort(int[] a, int s, int e) {
		long inversions = 0;
		if (s < e) {
			int mid = (s + e) / 2;

			inversions += merge_sort(a, s, mid);
			inversions += merge_sort(a, mid + 1, e);
			inversions += merge(a, s, mid, e);
		}
		return inversions;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while  (true ) {
			int j = 0;
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stt.nextToken());
			if (n==0)
				break ; 
			int[] a = new int[n];

			while (stt.hasMoreTokens()) {
				a[j++] = Integer.parseInt(stt.nextToken());
			}
			
			System.out.println((merge_sort(a, 0, n - 1)%2==1?"Marcelo" :"Carlos"));
		}
	}
}
