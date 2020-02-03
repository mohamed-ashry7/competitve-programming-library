import java.util.ArrayList;
import java.util.Scanner;

public class p467_Points_in_Figures_Rectangles {

	public static void main(String[] args) {

		ArrayList<Figure> figures = new ArrayList<>();

		Scanner ss = new Scanner(System.in);
		while (true) {
			String symbol = ss.next();
			if (symbol.equals("*"))
				break;
			figures.add(new Figure(ss.nextDouble(), ss.nextDouble(), ss.nextDouble(), ss.nextDouble())) ;  
		}
		int p = 0 ; 
		while (true ) { 
			p++ ; 
			double x = ss.nextDouble() ; 
			double y =ss.nextDouble() ; 
			if(x==9999.9 && y==9999.9)break ; 
			boolean f = false ; 
			for (int i = 0 ; i <figures.size() ; ++i ) { 
				if(figures.get(i).doesContain(x, y)) {
					System.out.printf("Point %d is contained in figure %d\n",p ,i+1);
					f = true ; 
				}
			}
			if (!f) { 
				System.out.printf("Point %d is not contained in any figure\n",p);
			}
		}
	}

	static class Figure {
		double xLow;
		double yHigh;
		double xHigh;
		double yLow;

		public Figure(double xLow, double yHigh, double xHigh, double yLow) {
			this.xLow = xLow;
			this.xHigh = xHigh;
			this.yHigh = yHigh;
			this.yLow = yLow;
		}

		boolean doesContain(double x, double y) {
			return x > xLow && x < xHigh && y > yLow && y < yHigh;
		}
	}

}
