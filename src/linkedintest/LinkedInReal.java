package linkedintest;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedInReal {
    public static void main(String[] args) {

//        LinkedList<Integer> list=new LinkedList<>();
//        list.add(5);
//        list.add(1);
//        list.add(10);
//        System.out.println(list);
        String[] array={"abc","2","10","0"};
        List<String> list= Arrays.asList(array);
        Collections.sort(list);
        System.out.println(Arrays.toString(array));


//        System.out.println();

    }
}
