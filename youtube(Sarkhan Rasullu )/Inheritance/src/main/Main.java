/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Teacher t = new Teacher(18, "Murad", "Isgandarli");
        Person p2 = new Person(45, "fsdbfd<b", "fhfd<h");
        t.setParent(p2);

//        Student s = new Student(23, "asdf", "asdfgg");
//        System.out.println(s.getAge());
        //Person p = new Person(12, "ytrrrr", "ddhdhd");

        
        
//        Student[] arr = new Student[2];
//        arr[0] = new Student(20, "test", "Testov");
//        t.setStudents(arr);
//
//        Student[] studentsOfTeacher = t.getStudents();
//        Student index0 = studentsOfTeacher[0];
//        System.out.println(index0.getName());
        //System.out.println(t.getStudents()[0].getName()); achiqlamasi t nin studentslerinin sifirincisinin name ni getir
    }

}
