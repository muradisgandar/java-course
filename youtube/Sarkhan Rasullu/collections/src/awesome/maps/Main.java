package awesome.maps;

import awesome.maps.bean.Student;
import awesome.maps.bean.Teacher;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<Teacher, Student> students = new TreeMap<>();
        Teacher teacher = new Teacher(1, "Sarkhan", "Rasullu");
        Teacher teacher2 = new Teacher(2, "Sarkhan2", "Rasullu2");
        Teacher teacher3 = new Teacher(3, "Sarkhan3", "Rasullu3");

        students.put(teacher, new Student(1, "Murad", "Isgandarli"));
        students.put(teacher2, new Student(2, "Azay", "Jalil"));
        students.put(teacher3, new Student(3, "Nergiz", "Yusifli"));

        System.out.println(students.keySet());
        System.out.println(students.values());

    }
}
