/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacherstudent;

import java.util.Scanner;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher t = new Teacher();
        System.out.println("Please enter some information about teacher:");
        System.out.println("Age: ");
        t.setAge(sc.nextInt());
        System.out.println("Name: ");
        t.setName(sc.next());
        System.out.println("Surname: ");
        t.setSurname(sc.next());

        System.out.println("Teacher's age, name, surname: " + t.getAge() + " " + t.getName() + " " + t.getSurname());
        System.out.println();
        System.out.println("How many students do you have?");
        Student[] arr = new Student[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            Student s = new Student();
            System.out.println(i + ".Student : What is his/her name?");
            s.setName(sc.next());

            System.out.println(i + ".Student : What is his/her surname?");
            s.setSurname(sc.next());

            System.out.println(i + ".Student : What is his/her age?");
            s.setAge(sc.nextInt());

            arr[i] = s;
            t.setStudents(arr);

        }

        for (int i = 0; i < arr.length; i++) {
            Student[] studentsOfTeacher = t.getStudents();
            Student index = studentsOfTeacher[i];
            System.out.println("Student: " + i + " " + index.getAge() + " " + index.getName() + " " + index.getSurname());

        }

    }

}
