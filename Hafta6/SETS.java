import java.util.*;

public class SETS {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<String>();
        lists.add("Water");
        lists.add("Bread");
        lists.add("Fruit");
        lists.add(3,"Juice");
        lists.add("Book");
        lists.add("Pens");
        System.out.println(lists);
                
        Set<String> sets = new HashSet<String>();
        sets.add("Water");
        sets.add("Bread");
        sets.add("Juice");
        sets.add("Book");
        sets.add("Pens");
            System.out.println(sets);
            System.out.println(sets.size());
            System.out.println(sets.contains("Fruit"));
            
            sets.clear();
            System.out.println(sets);
            sets.addAll(lists);
            System.out.println(sets);
            System.out.println(lists.get(2));
    }
}
