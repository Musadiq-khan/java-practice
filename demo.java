import java.util.*;
public class List_op {
}
public static void main(String []args){
    List<String> list= new ArrayList<>();
    list.add("Google");
    list.addFirst("Facebook");
    list.add(1,"Amazon");
    list.add("Netflix");
    System.out.println(list);
    list.add(2,"Javascript");
    System.out.println(list);
    list.remove("Google");
    System.out.println(list);
    list.remove(3);
    System.out.println(list);
    System.out.println(list.contains("Google"));
    System.out.println(list.contains("Facebook"));
    System.out.println(list.size());
    list.set(2,"Python");
    System.out.println(list.get(2));
    System.out.println(list.indexOf("Python"));
    System.out.println(list.isEmpty());
    list.clear();
    System.out.println(list);
    list.add("McDonalds");
    list.addFirst("KFC");
    list.add("TacoBell");
    list.add(1,"BurgerKing");
    System.out.println(list);
    System.out.println(list.lastIndexOf("BurgerKing"));
    List<String> img= new ArrayList<>();
    img.add("jpg");
    img.addFirst("png");
    img.addLast("jpeg");

    list.addAll(img);
    System.out.println(list);

    list.toArray();
    System.out.println(list);
    System.out.println(img);
}