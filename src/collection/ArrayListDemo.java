package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Arjun");
        list.add("Pooja");
        list.add("Ram");
        list.add("Arjun");

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
