import java.util.*;
public class iteratee {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Google");
        list.addFirst("Facebook");
        list.add(1, "Amazon");
        list.add("Netflix");
        Iterator<String> e=list.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}