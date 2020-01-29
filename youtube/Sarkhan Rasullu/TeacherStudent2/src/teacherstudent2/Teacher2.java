/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacherstudent2;


/**
 *
 * @author murad_isgandar
 */
public class Teacher2 extends Human {

    private Student2[] students;

    public Teacher2() {

    }

    public Teacher2(String name, String surname, int age) {
        super(name, surname, age);
        
    }

    public Teacher2(String name, String surname, int age, Student2[] students) {
        super(name, surname, age);
        this.students = students;
    }

    public Student2[] getStudents() {
        return students;
    }

    public void setStudents(Student2[] students) {
        this.students = students;
    }

}
