import java.util.*;

public class LinkedListFunctions {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
      
        list.offer("Google");
        list.offer("Amazon");
        list.offer("Netflix");

    
        list.addFirst("Facebook");
     
        list.addLast("Apple");

        System.out.println("List: " + list);
       
        System.out.println("First element: " + list.peekFirst());
       
        System.out.println("Last element: " + list.peekLast());
        
        System.out.println("Popped element: " + list.pop());
        System.out.println("After pop: " + list);
     
        list.removeLast();
        System.out.println("After removeLast: " + list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        System.out.println("After removing first" + list);

        System.out.println(list.peekLast());

        list.push("Airbnb");
        System.out.println(list);


    }
}