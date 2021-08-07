package collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    public enum Days {
        Sunday, Tuesday, Wednesday, Thursday
    }
    ;
    //K : It is the type of keys maintained by this map
    //V : It is type of mapped values

    public static void main(String[] args) {
        //create and populate enum map
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.Sunday, "1");
        map.put(Days.Tuesday, "2");
        map.put(Days.Wednesday, "3");

        //print the map
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
