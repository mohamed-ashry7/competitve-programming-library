import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p460_Overlapping_Rectangles {

	static Rect onePoint(Rect rect1, Rect rect2) {
		Point p1 = new Point(rect1.xLow , rect1.yLow);
		Point p2 = new Point(rect1.xLow , rect1.yHigh); 
		Point p3 = new Point(rect1.xHigh , rect1.yLow); 
		Point p4 = new Point(rect1.xHigh , rect1.yHigh); 
		if ( rect2.ContainsPoint(p1) && !rect2.ContainsPoint(p2) && !rect2.ContainsPoint(p3) && !rect2.ContainsPoint(p4) ) {
			return new Rect (p1.x,p1.y ,rect2.xHigh ,rect2.yHigh ) ; 
		}
		else if (!rect2.ContainsPoint(p1) && rect2.ContainsPoint(p2) && !rect2.ContainsPoint(p3) && !rect2.ContainsPoint(p4) ) { 
			return new Rect (p2.x , rect2.yLow ,rect2.xHigh ,p2.y ) ; 
		}
		else if (!rect2.ContainsPoint(p1) && !rect2.ContainsPoint(p2) && rect2.ContainsPoint(p3) && !rect2.ContainsPoint(p4) ) {
			return new Rect (rect2.xLow , p3.y , p3.x, rect2.yHigh) ; 
		}
		else if (!rect2.ContainsPoint(p1) && !rect2.ContainsPoint(p2) && !rect2.ContainsPoint(p3) && rect2.ContainsPoint(p4)){ 
			return new Rect (rect2.xLow ,rect2.yLow , p4.x,p4.y ) ; 
		}
		return null ; 
				
				  

	}
	static Rect twoPoints (Rect rect1 , Rect rect2 ) { 
		if (rect1.ContainsPoint(rect2.xLow , rect2.yLow) || rect1.ContainsPoint(rect2.xHigh,rect2.yHigh)) { 
			return new Rect (Math.max(rect1.xLow, rect2.xLow) , Math.max(rect2.yLow, rect1.yLow),Math.min(rect1.xHigh, rect2.xHigh) ,Math.min(rect1.yHigh, rect2.yHigh) ) ; 
		}
		return null ; 
	}

	static Rect gimmeRect(Rect rect1 , Rect rect2 ) { 
		if (rect1.ContainsRect(rect2))return rect2 ; 
		if (rect2.ContainsRect(rect1))return rect1 ; 
		if (!rect1.Overlapped(rect2) || rect1.shareEdge(rect2))return null ; 
		// ZERO POINTS FROm EACH RECT IS IN ANY OTHER RECT  . 
		if (!rect1.ContainsPoint(rect2.getXLow(), rect2.getYLow()) && 
				!rect1.ContainsPoint(rect2.getXHigh(), rect2.getYHigh())&&
				!rect2.ContainsPoint(rect1.getXLow(), rect1.getYLow()) && 
				!rect2.ContainsPoint(rect1.getXHigh(), rect1.getYHigh())) {
			int xl = rect1.xLow>rect2.xLow?rect1.xLow:rect2.xLow ; 
			int yl = rect1.yLow>rect2.yLow?rect1.yLow:rect2.yLow ; 
			int xh = rect1.xHigh<rect2.xHigh?rect1.xHigh:rect2.xHigh ; 
			int yh = rect1.yHigh<rect2.yHigh?rect1.yHigh:rect2.yHigh ; 

			return new Rect (xl,yl,xh,yh) ; 
		} // ONE POINT OF A THE RECT 
		else if (onePoint(rect1, rect2) != null) { 
			return onePoint(rect1,rect2) ; 
		}
		else { 
			return twoPoints(rect1,rect2) ==null ? twoPoints(rect2,rect1) : twoPoints(rect1,rect2) ; 
		}
		 
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			br.readLine();
			StringTokenizer stt = new StringTokenizer(br.readLine());
			while (stt.countTokens()==0) {
				stt = new StringTokenizer(br.readLine());
			}
			Rect rect1 = new Rect(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()),
					Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()));
			stt = new StringTokenizer(br.readLine());
			while (stt.countTokens()==0) {
				stt = new StringTokenizer(br.readLine());
			}
			Rect rect2 = new Rect(Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()),
					Integer.parseInt(stt.nextToken()), Integer.parseInt(stt.nextToken()));
			Rect res = gimmeRect(rect1, rect2) ; 
		
			System.out.println(res == null ? "No Overlap" : res);
			if (n!=0)
			System.out.println();
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

		boolean ContainsPoint(int x, int y) {
			return x >= xLow && x <= xHigh && y >= yLow && y <= yHigh;
		}
		boolean ContainsPoint(Point p) {
			return p.x >= xLow && p.x <= xHigh && p.y >= yLow && p.y <= yHigh;
		}

		int getXLow() {
			return xLow;
		}

		int getXHigh() {
			return xHigh;
		}

		int getYLow() {
			return yLow;
		}

		int getYHigh() {
			return yHigh;
		}

		boolean ContainsRect(Rect r) {
			return this.ContainsPoint(r.getXLow(), r.getYLow()) && this.ContainsPoint(r.getXHigh(), r.getYHigh());
		}

		boolean shareEdge(Rect r) {
			return this.getXHigh() == r.getXLow() || this.xLow == r.getXHigh() || this.yLow == r.getYHigh()
					|| this.yHigh == r.getYLow();
		}

		boolean Overlapped(Rect r) {
			return !(this.getXHigh() < r.getXLow() || this.getXLow() > r.getXHigh() || this.getYHigh() < r.getYLow()
					|| this.getYLow() > r.getYHigh());
		}

		public String toString() {
			return String.format("%d %d %d %d", xLow, yLow, xHigh, yHigh);
		}

	}

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
