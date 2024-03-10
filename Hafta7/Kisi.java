package uygulamaHafta5;

public class Kisi {
	private String isim;
	private int yas;
	
	public Kisi(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public String getIsim(String isim) {
		return this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	

}
