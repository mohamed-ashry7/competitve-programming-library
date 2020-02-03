import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10611_The_Playboy_Chimp {
	static int[] ladies;
	
	
	public static int getLower (int height ) { 
		
		
		if (height <= ladies[0]){
			return -1 ; 
		}
		if (height > ladies[ladies.length-1]) { 
			return ladies[ladies.length-1] ; 
		}
		int l = 0 , h = ladies.length , mid = (l+h)/2 ;
		while (true ) { 
			if (ladies[mid]<height && ladies[mid+1] >= height){
				return ladies[mid] ; 
			}
			else if (ladies [mid] <height && ladies[mid+1] < height ) { 
				l = mid ; 
				mid = (l+h)/2  ;
			}
			else if (ladies[mid] >= height && ladies[mid-1] < height) { 
				return ladies[mid-1] ; 
			}
			else if (ladies[mid] >= height ) { 
				h = mid ;
				mid = (l+h)/2  ;

			}
		}
		
	}
	public static int getHeigher (int height ) {
 
		
		
		if (height >= ladies[ladies.length-1]){
			return -1 ; 
		}
		if (height < ladies[0]) { 
			return ladies[0] ; 
		}
		int l = 0 , h = ladies.length , mid = (l+h)/2 ;
		while (true ) { 
			if (ladies[mid]>height && ladies[mid-1] <= height){
				return ladies[mid] ; 
			}
			else if (ladies [mid] >height && ladies[mid-1] > height ) { 
				h = mid ; 
				mid = (l+h)/2  ;
			}
			else if (ladies[mid] <= height && ladies[mid+1] > height) { 
				return ladies[mid+1] ; 
			}
			else if (ladies[mid] <= height ) { 
				l = mid ;
				mid = (l+h)/2  ;

			}
		}
		
	
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer stt = new StringTokenizer(br.readLine());
		ladies = new int[n];
		for (int k = 0; k < n; k++) {
			ladies[k] = Integer.parseInt(stt.nextToken());
		}
		int q = Integer.parseInt(br.readLine());
		stt = new StringTokenizer(br.readLine());
		for (int k = 0; k < q; k++) {
			int height =  Integer.parseInt(stt.nextToken());
			String l ; 
			String h ; 
			int lower =getLower(height) ; 
			int higher = getHeigher(height); 
			l = lower ==-1?"X":lower+"" ; 
			h = higher ==-1?"X":higher+"" ; 

			System.out.println(l+ " " + h );
		}
		
	}

}
