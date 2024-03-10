package Helloe;

public class pointMain2 {

	public static void main(String[] args) {
		
		point3 pnt = new point3();
		pnt.x=3;
		pnt.y=7;
		
		System.out.println("point= ("+pnt.x+","+pnt.y+")");
		System.out.println("distance from orijin="+ pnt.distFromOgj());
	}

}
