import java.util.*;
public class eachlist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Google");
        list.addFirst("Facebook");
        list.add(1, "Amazon");
        list.add("Netflix");
        for(String e:list)
        {
            System.out.println(e);
        }
    }
}