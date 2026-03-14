import java.util.*;

public class sett {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Google");
        s.add("Amazon");
        s.add("Netflix");
        s.add("Google");
        System.out.println(s);
        System.out.println("Contains Google?"+s.contains("Google"));
        System.out.println("Contains Meta?"+s.contains("Meta"));
        System.out.println("Size of set: "+s.size());
        //s.remove("Amazon");
        //System.out.println("After removing Amazon: "+s);
        System.out.println("Is set empty?"+s.isEmpty());
    }
}a