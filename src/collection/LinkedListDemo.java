package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Ram");
        list.add("Hari");
        list.add("Pooja");
        list.add("Pooja");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
