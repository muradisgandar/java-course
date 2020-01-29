/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility2;

import java.util.Scanner;
import teacherstudent2.Student2;
import teacherstudent2.Teacher2;

/**
 *
 * @author murad_isgandar
 */
public class RegistrationUtility {

    public static Teacher2 registerTeacher() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter some information about teacher:");
        System.out.println("What is your name? ");
        String name = sc.nextLine();

        System.out.println("What is your surname? ");
        String surname = sc.nextLine();

        System.out.println("How old are you? ");
        int age = sc.nextInt();
        sc.nextLine();
        Teacher2 teacher = new Teacher2(name, surname, age);
        return teacher;
    }

    public static Student2 registerStudent2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is student name? ");
        String studentsName = sc.nextLine();

        System.out.println("What is student surname? ");
        String studentsSurname = sc.nextLine();

        System.out.println("How old are student? ");
        int studentsAge = sc.nextInt();
        sc.nextLine();
        Student2 student = new Student2(studentsName, studentsSurname, studentsAge);
        return student;
    }

    public static Student2[] searchForNames(Teacher2 teacher, String b, int f) {
        Student2[] name = teacher.getStudents();
        Student2[] arr = new Student2[name.length];

        for (int i = 0; i < name.length; i++) {

            if (b.equals(teacher.getStudents()[i].getName())) {
                
                arr[i] = teacher.getStudents()[i];
                //Student2 arr[] = {teacher.getStudents()[i]};
                
            }

        }
        return arr;
    }

    public static Student2[] searchForSurnames(Teacher2 teacher, String b, int g) {
        Student2[] name = teacher.getStudents();
        Student2[] arr = new Student2[name.length];

        for (int i = 0; i < name.length; i++) {

            if (b.equals(teacher.getStudents()[i].getSurname())) {
                arr[i] = teacher.getStudents()[i];

            }

        }
        return arr;
    }

    public static Student2[] searchForInt(Teacher2 teacher, int d) {
        Student2[] age = teacher.getStudents();
        Student2[] arr = new Student2[age.length];

        for (int i = 0; i < age.length; i++) {

            if (d == teacher.getStudents()[i].getAge()) {
                arr[i] = teacher.getStudents()[i];

            }
        }
        return arr;
    }

    public static void registerStudents(Teacher2 teacher) {
        System.out.println("Please enter some information about students:");
        System.out.println("How many students do you have?");
        Scanner sc = new Scanner(System.in);
        Student2[] arr = new Student2[sc.nextInt()];
        sc.nextLine();
        teacher.setStudents(arr);

        for (int i = 0; i < arr.length; i++) {

            arr[i] = registerStudent2();

        }
    }

    public static void printRegisteredTeacher(Teacher2 teacher) {
        System.out.println("Information about registration");
        System.out.println("You have successfully registered");
        System.out.println(teacher);

        System.out.println("Registered students: ");
        Student2[] registredStudents = teacher.getStudents();
        for (int i = 0; i < registredStudents.length; i++) {
            System.out.println((i + 1) + "." + registredStudents[i]);
        }
    }

}
