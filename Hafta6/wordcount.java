
import java.io.*;
import java.util.*;

public class wordcount {

    public static void main(String[] args) throws FileNotFoundException {
        countwords();

    }

    public static void countwords() throws FileNotFoundException {
        Scanner input = new Scanner(new File("word.txt"));
        Set<String> words = new HashSet<String>();
        
        while (input.hasNext()) {
            String word = input.next().toString();
            words.add(word);

        }
        System.out.println("Kelimeler: " + words);
        System.out.println("Kelime Sayisi: " + words.size());
        for (String word : words) 
            System.out.print(word+", ");  
        }
        
    }

