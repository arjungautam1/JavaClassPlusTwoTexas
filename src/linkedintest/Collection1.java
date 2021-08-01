package linkedintest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {

//        ArrayList<String> words=new ArrayList<String>(){"Hello","World"};
//        ArrayList words=Arrays.asList("hello","world");
//        ArrayList<String> words={"Hello","World"};

        ArrayList<String> words=new ArrayList<>(Arrays.asList("Hello","World"));


        String[] array=new String[]{"A","B","C"};
        List<String> list1= Arrays.asList(array);
        List<String> list2=new ArrayList<>(Arrays.asList(array));
        List<String> list3=new ArrayList<>(Arrays.asList("A",new String("B"),"C"));
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));
    }
}
