import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p12346_Water_Gate_Management {

	static int[] flood;
	static int[] cost;
	static double MAXTIME;
	static int Capacity ; 
	static int minCost ; 
	static int [] Gates ;
	static boolean change ; 
	static int calcCapacities  () { 
		int  cap = 0 ; 
		for (int i = 0 ; i < Gates.length ; i ++ ) { 
			if (Gates[i] == 1 ) { 
				cap += flood[i] ; 
			}
		}
		return cap ; 
	}
	static void backtracking (int start ,int curCost , double timeTaken , double left   ) { 
		
		
		if (left <= 1e-6 && timeTaken <= MAXTIME &&curCost < minCost){
				change = true ; 
				minCost = curCost ; 
				return ; 
		}
		for (int i = start ; i < flood.length ; i ++ ) { 
			if (curCost > minCost ) { 
				return ; 
			}
			else { 
				Gates[i] = 1 ;
				int sums = calcCapacities() ; 
				double time = (1.0*Capacity)/sums ; 
				backtracking(i+1, curCost+cost[i], time , 1.0*Capacity - sums*time );
				Gates[i] = 0 ; 
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		flood = new int[n];
		cost = new int[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			flood[i] = Integer.parseInt(stt.nextToken());
			cost[i] = Integer.parseInt(stt.nextToken());
		}
		int tests  = Integer.parseInt(br.readLine());
		for (int i = 1 ; i <= tests ; i ++ ){ 
			StringTokenizer stt = new StringTokenizer(br.readLine());
			Capacity = Integer.parseInt(stt.nextToken());
			MAXTIME = Integer.parseInt(stt.nextToken()); 
			minCost = Integer.MAX_VALUE ; 
			Gates = new int [n] ; 
			change = false ; 
			backtracking(0, 0, 0, Capacity*1.0); 
			System.out.println("Case "+i+": "+(change?minCost:"IMPOSSIBLE"));
		}


	}

}
