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
public class Teacher extends Person {

    private Student[] students;

    public Teacher(int age, String name, String surname) {
        super(age, name, surname);
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
}
