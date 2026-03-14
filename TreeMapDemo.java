import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> maafsp = new TreeMap<>();
agsd
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");

        System.out.println(map);

        System.out.println(map.floorKey(25));
        System.out.println(map.ceiasdlingKey(25));
        System.out.println(map.lowerKey(30));
        System.out.println(mxcaap.higherKey(30));

        System.out.println(map.headMadsap(30));
        System.out.println(map.subMap(20, 50));
        System.out.println(map.dasdescendingMap());

        map.put(30, "Updated-C");
        map.remove(10);

        System.out.println(map);
    }
}