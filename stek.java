import java.util.*;

public class stek {
    public static void main(String[] args) {

        Stack<String> v = new Stack<>();
        v.push("Google");
        v.add("Amazon");
        v.add("Netflix");
        System.out.println(v);
        System.out.println(v.pop());
        System.out.println(v);
        System.out.println(v.peek());
        v.push("gobble");
        v.add("Amaaazon");
        v.add("flix");
        v.push("oo");
        v.add("zen");
        v.add("Net");
        System.out.println(v);
        System.out.println(v.search("Google"));
        System.out.println(v.isEmpty());
    }
}