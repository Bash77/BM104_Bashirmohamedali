package Helloe;

public class point4 {

	int x;
	int y;
	
	public point4(int x, int y) {
		this.x =x;
		this.y=y;
	}
	
	public double distFromOrij() {
		return Math.sqrt(x*x+y*y);
	}
	public void translate(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	}


