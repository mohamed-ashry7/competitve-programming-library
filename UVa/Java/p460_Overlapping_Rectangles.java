import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p460_Overlapping_Rectangles {
	
	
	
	static Rect gimmeRect(Rect rect1 , Rect rect2 ) { 
		if (rect1.doesContainRect(rect2))return rect2 ; 
		if (rect2.doesContainRect(rect1))return rect1 ; 
		if (rect1.shareEdge(rect2) ||rect1.notOverlapped(rect2))return null ; 
		 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.readLine();
		while (n-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			Rect rect1 = new Rect(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken())) ; 
			stt = new StringTokenizer(br.readLine());
			Rect rect2 = new Rect(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken())) ; 
			
		}
	}

	static class Rect {
		int xLow;
		int yHigh;
		int xHigh;
		int yLow;

		public Rect(int xLow, int yLow, int xHigh, int yHigh) {
			this.xLow = xLow;
			this.xHigh = xHigh;
			this.yHigh = yHigh;
			this.yLow = yLow;
		}
		
		boolean doesContainPoint(int x, int y) {
			return x >= xLow && x <= xHigh && y >= yLow && y <= yHigh;
		}
		int getXLow() { 
			return xLow ; 
		}
		int getXHigh() { 
			return xHigh ; 
		}
		int getYLow() { 
			return yLow ; 
		}
		int getYHigh() { 
			return yHigh ; 
		}
		
		boolean doesContainRect(Rect r) { 
			return this.doesContainPoint(r.getXLow(), r.getYLow()) && this.doesContainPoint(r.getXHigh(), r.getYHigh()) ; 
		}
		boolean shareEdge(Rect r) { 
			return this.getXHigh() ==r.getXLow() || this.xLow == r.getXHigh() || this.yLow ==r.getYHigh() || this.yHigh==r.getYLow() ; 
		}
		boolean notOverlapped(Rect r) { 
			return this.getXHigh()<r.getXLow() || this.getXLow()>r.getXHigh() || this.getYHigh()<r.getYLow() || this.getYLow()>r.getYHigh(); 
		}
		
		
	}

}
