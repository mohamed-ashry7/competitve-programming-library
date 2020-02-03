import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p1203_Argus {

	public static void main(String[] args) throws IOException {

		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		PriorityQueue<Pair> queries = new PriorityQueue<>(new PairCom()); 

		while (true ) { 
			String line = br.readLine() ; 
			if (line.equals("#"))
				break ; 
			StringTokenizer stt = new StringTokenizer(line ) ; 
			stt.nextToken() ; 
			queries.add(new Pair(Integer.parseInt(stt.nextToken())  ,Integer.parseInt(stt.nextToken())  )) ; 
		}
		int n = Integer.parseInt(br.readLine()) ; 
		
		for (int i= 0 ; i < n ; i ++ ) { 
			Pair p = queries.poll() ; 
			System.out.println(p.ID);
			p.setValue(p.getValue() + p.getIncrease());
			queries.add(p) ; 
		}
	}
	
	
	static class Pair  {
		int ID  ; 
		int value ; 
		int increase ; 
		public Pair (int ID , int value ) { 
			this.ID = ID ; 
			this.value = value ; 
			this.increase = value ; 
		}
		public int getID() {
			return ID;
		}
		public int getIncrease () { 
			return increase ; 
		}
		public void setID(int iD) {
			ID = iD;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public String toString () { 
			return ID + " : " + value ;
		}
		
	}
	static class PairCom implements Comparator<Pair > {

		@Override
		public int compare(Pair o1, Pair o2) {
			if (o1.getValue() == o2.getValue()) {
				return o1.getID() - o2.getID() ; 
			}
			return o1.getValue() - o2.getValue();
		}
		
	}

}
