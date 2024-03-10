package uygulamaHafta5;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartin");
		words.add("kitap");
		
		System.out.println("siralanmadan once: "+words);
		System.out.println(words.get(0));
		Collections.sort(words);
		System.out.println("siralanmadan sonra: "+words);

	}

}
