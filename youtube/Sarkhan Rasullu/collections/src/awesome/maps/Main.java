package awesome.maps;

import awesome.maps.bean.Student;
import awesome.maps.bean.Teacher;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Teacher, Student> students = new HashMap<>();
        Teacher teacher = new Teacher(1,"Sarkhan","Rasullu");
        Teacher teacher2 = new Teacher(2,"Sarkhan2","Rasullu2");

        students.put(teacher,new Student(1,"Murad","Isgandarli"));
        students.put(teacher2,new Student(2,"Azay","Jalil"));

        System.out.println("get is called");

        students.get(teacher2);

    }
}
