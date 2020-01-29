/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference;

import exercises.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author murad_isgandar
 */
public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 18),
                new Person("Lewis", "Carroll", 27),
                new Person("Thomas", "Carl", 18),
                new Person("Charlotte", "Bront", 23),
                new Person("Mattew", "Arnold", 23)
        );

        System.out.println("Printing all persons");
//        printConditionally(people, p -> true, p -> System.out.println(p));

        printConditionally(people, p -> true, System.out::println);// method reference is used
        
    }

    private static void printConditionally(List<Person> people, Predicate<Person> c, Consumer<Person> consumer) {
        for (Person t : people) {
            if (c.test(t)) {
                consumer.accept(t);

            }
        }
    }
}
