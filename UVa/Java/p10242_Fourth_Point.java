import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p10242_Fourth_Point {

	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		while (true) {
			String line = ss.nextLine();
			if (line == null || line.length() == 0) {
				break;
			}
			StringTokenizer stt = new StringTokenizer(line);
			Point p1 = new Point(Double.parseDouble(stt.nextToken()), Double.parseDouble(stt.nextToken()));
			Point p2 = new Point(Double.parseDouble(stt.nextToken()), Double.parseDouble(stt.nextToken()));
			Point p3 = new Point(Double.parseDouble(stt.nextToken()), Double.parseDouble(stt.nextToken()));
			Point p4 = new Point(Double.parseDouble(stt.nextToken()), Double.parseDouble(stt.nextToken()));
			Point fourth ; 
			if (p1.equals(p3)) { 
				fourth = p4.add(p1.getVector(p2)) ;  
			}
			else if (p1.equals(p4)) { 
				fourth = p3.add(p1.getVector(p2)) ;  

			}
			else if (p2.equals(p3)) { 
				fourth = p4.add(p2.getVector(p1)) ;  
			}
			else {
				fourth = p3.add(p2.getVector(p1)) ;  
			}
			
			System.out.printf("%.3f %.3f\n" , fourth.x, fourth.y);

		}

	}

	static class Point implements Comparable<Point> {
		double x;
		double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point a) {
			if (this.x == a.x && this.y == a.y)
				return 0;
			return 1;
		}
		
		public boolean equals(Object obj){
			Point a = (Point)obj ; 
			return this.compareTo(a)==0 ; 
		}
		public Point getVector(Point a ) { 
			return new Point (a.x-this.x , a.y-this.y) ; 
		}
		public Point add(Point a ) { 
			return new Point (this.x+a.x , this.y+a.y) ; 
		}
	}
}
