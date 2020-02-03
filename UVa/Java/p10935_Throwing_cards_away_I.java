import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class p10935_Throwing_cards_away_I {

	public static void main(String[] args) throws  IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out ) ; 
		
		while (true )  {
			
			int n = Integer.parseInt(br.readLine()) ; 
		    if (n== 0 ) { 
		    	break ; 
		    }
		    if (n==1 ) { 
		    	 out.println("Discarded cards:" );
				 out.println("Remaining card: "+1);
				 out.flush();
		    }else {
		    Queue<Integer> qq = new LinkedList<>() ; 
		    for (int i = 1 ; i<=n ; i ++ ) { 
		    	qq.add(i) ; 
		    }
		    String wan = "" ; 

		    if (qq.size() > 1 )
		    	wan +=qq.poll() ; 
		    qq.add(qq.poll()) ; 
		    while (qq.size()>1 ) { 
		    	wan +=", "+ qq.poll() ; 
		    	qq.add(qq.poll()) ; 
		    }
		    out.println("Discarded cards: "+wan );
		    out.println("Remaining card: "+qq.poll());
			out.flush(); } 
		}
		out.close();
	}

}
