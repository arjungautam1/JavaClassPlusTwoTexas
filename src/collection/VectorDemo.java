package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Arjun");
        vector.add("Arjun");
        vector.add("Pooja");

        Iterator<String> iterator=vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
