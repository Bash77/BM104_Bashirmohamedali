package Helloe;

public class pointMAIN {

	public static void main(String[] args) {
	
		Point p1 = new Point();
		p1.x=5;
		p1.y=4;
		
		Point p2 = new Point();
		p2.x=3;
	    p2.y=-1;
	    
	    System.out.println("point1=("+p1.x+","+p1.y+")");
	    double dist = Math.sqrt(p1.x*p1.x+p1.y*p1.y);
	    System.out.println("distance from orijin="+ dist);
	    
	    
		System.out.println("point2=("+p2.x+","+p2.y+")");
		double dist2 = Math.sqrt(p2.x*p2.x+p2.y*p2.y);
		System.out.println("distance from orijin="+ dist2);
		
		p1.x += 1;
		p1.y += 3;
		p2.x += -3;
		p2.y += 9;
		
		System.out.println("point1=("+p1.x+","+p1.y+")");
		System.out.println("point2=("+p2.x+","+p2.y+")");
	}

}
