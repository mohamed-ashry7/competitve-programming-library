import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import javax.swing.text.Position;

public class p12321_Gas_Stations {

	public static void main(String[] args) throws IOException {


		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)) ; 
		while (true ) { 
			StringTokenizer stt = new StringTokenizer( br.readLine() ) ; 
			int len = Integer.parseInt(stt.nextToken()) ; 
			int numberStations  =  Integer.parseInt(stt.nextToken()) ; 
			if (len+numberStations == 0 )  {
				break ; 
			}
			point [] stations = new point [numberStations] ; 
			for (int i= 0 ; i < numberStations ; i ++ ) { 
				stt =new StringTokenizer(br.readLine()) ; 
				stations[i] = new point(Integer.parseInt(stt.nextToken()) , Integer.parseInt(stt.nextToken()) , len ) ; 
			}
			Arrays.sort(stations, new Comparator<point>() {

				@Override
				public int compare(point o1, point o2) {
					
					int def = o1.getLeft() - o2.getLeft() ; 
					return def != 0 ?def : o2.getRight() - o1.getRight() ; 
				}
				
			});

			point curPoint = stations[0] ; 
			point max = null ; 
			
			int taken = 1 ;
			boolean flag = true ; 
			if (curPoint.getLeft() > 0) { 
				flag = false ; 
			}
			int start = 0 ; 
			for (int i = 1 ; i < stations.length && flag  ; i ++ ) { 
				if (curPoint.getRight()>= stations[i].getLeft()) { 
					if (max == null || max.getRight() < stations[i].getRight()) { 
						max = stations[i] ; 
						start = i  ; 
					}
				}
				else {
					if (max == null ) { 
						flag = false ; 
						break ; 
					}
					curPoint = max ; 
					max = null ; 
					taken ++ ; 
					i = start ; 
				}
			}

			if (flag ) {
			if (curPoint.getRight()>= len ) { 
				System.out.println(numberStations-taken);
			}
			else if (curPoint.getRight() < len && max != null && max.getRight()>= len) { 
				taken ++ ; 
				System.out.println(numberStations-taken);

			}
			else {
				System.out.println(-1);
			}
			}
			else { 
				System.out.println(-1);
			}
			
		}
	}
	static class point {
		int x ; 
		int r ; 
		int lim ;  
		public point (int x , int r , int lim  ) { 
			this.x = x ; 
			this.r =r ; 
			this.lim = lim ; 
		}
		public int getCenter () {
			return x ; 
		}
		public int getLeft () { 
			return x-r<0 ? 0 :x-r ; 
		}
		public int getRight () { 
			return x +r >lim ? lim : x+r  ; 
		}
	}
	

}
