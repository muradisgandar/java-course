/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideexample;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student s = new Student("Murad", "Isgandarli");
        Teacher t = new Teacher();
        s.birthPlace = "Baku";

        Person p = s;
        p.birthPlace = "Qazax";
        
        
        
        System.out.println(s.birthPlace);
        System.out.println(p.birthPlace);
//        printPerson(s);
//        printPerson(t);

        p.eatMeal();
        
        s.eatMeal();
        

    }

    public static void printPerson(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            s.specificToStudent();
            System.out.println("Student");
        } else if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            t.specificToTeacher();
            System.out.println("Teacher");
        }

    }

}
