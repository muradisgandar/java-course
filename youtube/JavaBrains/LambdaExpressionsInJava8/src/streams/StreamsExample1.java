/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import exercises.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 18),
                new Person("Lewis", "Carroll", 27),
                new Person("Thomas", "Carl", 18),
                new Person("Charlotte", "Bront", 23),
                new Person("Mattew", "Arnold", 23),
                new Person("Mattew", "Arnold", 23)
        );

        //Examples of stream using
        people.stream()
                .filter(p -> p.getSurname().startsWith("C"))
                .forEach(p -> System.out.println(p.getSurname()));
        
        
        /*
        Burada people source adlanir,yeni stream in ishlediyi data
        operationlarin oldugu cerge assembly line adlanir
        .forEach - en axirinci operation butun operationlari bitiren, terminal operation adlanir 
        */
    }

}
