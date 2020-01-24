/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public class SolutionsInJava7 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 18),
                new Person("Lewis", "Carroll", 27),
                new Person("Thomas", "Carl", 18),
                new Person("Charlotte", "Bront", 23),
                new Person("Mattew", "Arnold", 23)
        );

        //Step1: SORT By last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getSurname().compareTo(o2.getSurname());//ascending(artan) sira
//                return o2.getSurname().compareTo(o1.getSurname());//descending(azalan) sira
            }

        });

        //Step2: create method prints all elements
        System.out.println("Printing all persons");
        printAll(people);
        //Step3: create method that prints all people that have surname begining with c

        System.out.println("Printing all persons with surname begining C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getSurname().startsWith("C");
            }
        });
        
        System.out.println("Printing all persons with name begining C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getName().startsWith("C");
            }
        });
    }

    private static void printAll(List<Person> people) {

        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printConditionally(List<Person> people, Condition c) {
//        for(Person p :people){
//            if(p.getSurname().startsWith("C")){
//                System.out.println(p);
//            }
//        }
        for (Person p : people) {
            if (c.test(p)) {
                System.out.println(p);
            }
        }
    }

}

interface Condition {

    boolean test(Person p);
}
