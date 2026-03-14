import java.util.*;

public class vecc{
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("Google");
        v.add("Amazon");
        v.add("Netflix");
        Vector<String> v2 = new Vector<>();
        v2.add("Facebook");
        v2.add("Microsoft");
        v.addAll(v2);
        Iterator<String> e = v.iterator();
        while (e.hasNext()) {
            System.out.println(e.next());
        }
        v.add("Netflix");
        System.out.println(v.remove(1));
        System.out.println(v.contains("m"));
        System.out.println(v.remove("o"));
        System.out.println(v.size());
        System.out.println(v);
        System.out.println(v.get(1));
        System.out.println(v.set(2,"omo"));
        System.out.println(v.indexOf("Amazom"));
        System.out.println(v.lastIndexOf("Google"));
        System.out.println(v.lastIndexOf("Google"));
    
        System.out.println(v.toString());
    }
}