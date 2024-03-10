package Helloe;

public class cat {

	int age;
	String name;
	String color;
	
	public cat() {
		this.age=0;
		this.color="renk girilmedi";
		this.name="isim girilmedi";
	}

	public cat(String name, int age) {
		this.name = name;
		this.age= age;
        
	}
	
	public cat(String name,  String color) {
		this.name = name;
        this.color= color;
	}
	
	
	public cat(int age, String color) {
		this.age= age;
        this.color= color;
	}
	
	public cat(String name, int age, String color) {
		this.name = name;
		this.age= age;
        this.color= color;
	}

}
