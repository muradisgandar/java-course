package awesome.maps;

import awesome.maps.bean.Person;
import awesome.maps.bean.Student;
import awesome.maps.bean.Teacher;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Student s = new Student(25,"Azay","Jalil");
        Teacher t = new Teacher(25,"Azay","Jalil");

        System.out.println(s.hashCode());
        System.out.println(t.hashCode());

        Map<Person,Integer> map = new HashMap<>();
        map.put(s,1);
        map.put(t,2);



    }
}
