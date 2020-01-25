/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;//Predicate is a standart function in function library

/**
 *
 * @author murad_isgandar
 */
public class StandartFunctionExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 18),
                new Person("Lewis", "Carroll", 27),
                new Person("Thomas", "Carl", 18),
                new Person("Charlotte", "Bront", 23),
                new Person("Mattew", "Arnold", 23)
        );

        //Step1: SORT By last name
        Collections.sort(people, (p1, p2) -> p1.getSurname().compareTo(p2.getSurname()));

        //Step2: create method prints all elements
        System.out.println("Printing all persons");
        printAll(people);
        //Step3: create method that prints all people that have surname begining with c

        System.out.println("Printing all persons with surname begining C");
        printConditionally(people, (p) -> p.getSurname().startsWith("C"), p -> System.out.println(p));

        System.out.println("Printing all persons with name begining C");
        printConditionally(people, (p) -> p.getName().startsWith("C"), p -> System.out.println(p.getName()));

        //by Consumer interface we can pass different operations to method 
        //example : printconditionally method pass 3 rd argument in differently for name and surname
    }

    private static void printAll(List<Person> people) {

        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printConditionally(List<Person> people, Predicate<Person> c, Consumer<Person> consumer) {
        for (Person t : people) {
            if (c.test(t)) {
                consumer.accept(t);//accept() method can execute any different operation which is passed as argument to methods

            }
        }
    }

}
