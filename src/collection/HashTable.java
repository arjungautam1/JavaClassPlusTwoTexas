package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<>();

        hm.put(100, "Hello");
        hm.put(101, "Pooja");
        hm.put(102, "Arjun");
        hm.put(102, "Arjun");
        //contains unique elements and doesn't allow null key or value


        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
