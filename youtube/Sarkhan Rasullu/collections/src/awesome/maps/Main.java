package awesome.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> students = new HashMap<>();
        students.put(1,"Sarkhan");
        students.put(1,"Murad");

        String value = students.get(1);
        System.out.println(value);

    }
}
