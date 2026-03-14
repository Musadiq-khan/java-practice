import java.util.*;

public class ts {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(50);
        s.add(20);
        s.add(10);
        s.add(34);
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.floor(25));
        System.out.println(s.ceiling(30));
        System.out.println(s.lower(15));
        System.out.println(s.higher(15));
        System.out.println(s.headSet(30));
        System.out.println(s.tailSet(30));

        
    }
}
