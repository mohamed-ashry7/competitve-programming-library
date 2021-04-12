package CF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B433_Kuriyama_Mirais_Stones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out) ; 
		int n = Integer.parseInt(br.readLine());
		long [] arr = new long [n] ; 
		long [] sortedArr = new long [n] ; 
		PriorityQueue<Long> pq = new PriorityQueue<>() ; 
		StringTokenizer stt = new StringTokenizer(br.readLine()) ;
		arr[0] = Long.parseLong(stt.nextToken()) ; 
		pq.add( arr[0]); 
		for (int i = 1 ; i < n ; ++i) { 
			arr[i]=Long.parseLong(stt.nextToken()) ;  
			pq.add( arr[i]);
			arr[i] +=arr[i-1] ; 
		}
		sortedArr[0] = pq.poll(); 
		for (int i =1; i <n;++i) { 
			sortedArr[i]+=pq.poll()+sortedArr[i-1] ; 
		}
		int tests = Integer.parseInt(br.readLine());
		
		while(tests-->0) {
			stt = new StringTokenizer(br.readLine()) ;
			int type = Integer.parseInt(stt.nextToken()) ; 
			int l = Integer.parseInt(stt.nextToken()) ; 
			int r = Integer.parseInt(stt.nextToken()) ; 
			long summ = 0 ; 
			if (type==1) { 
				summ  = arr[r-1] ; 
				if (l!=1)
					summ = arr[r-1] -arr[l-2] ; 
			}
			else {
				summ  = sortedArr[r-1] ; 
				if (l!=1)
					summ = sortedArr[r-1] -sortedArr[l-2] ; 
			}
			pw.println(summ);

		}
		pw.flush();

	}

}
