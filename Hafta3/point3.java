package Helloe;

public class point3 {
 
	int x;
	int y;
	
	public double distFromOgj()
	{
	 return Math.sqrt(x*x+y*y);
}

	 public void trans(int dx, int dy) 
	 {
		 x =+ dx;
		 y =+ dy;
	 }
	 
}
