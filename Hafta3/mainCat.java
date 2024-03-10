package Helloe;

public class mainCat {

	public static void main(String[] args) {
		
		cat k1 = new cat();
		System.out.println(k1.name+" , "+k1.age+" , "+k1.color);
		
		cat k2 = new cat("jack",2,"beyaz");
		System.out.println(k2.name+" , "+k2.age+" , "+k2.color);
		
		cat k3 = new cat(2,"lona");
		System.out.println(k3.name+" , "+k3.age+" , "+k3.color);
		
		

	}

}
