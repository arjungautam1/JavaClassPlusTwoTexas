package collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Arjun");
        stack.push("Ram");
        stack.push("Arjun");
        stack.push("Pooja");

        Iterator<String> iterator=stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
