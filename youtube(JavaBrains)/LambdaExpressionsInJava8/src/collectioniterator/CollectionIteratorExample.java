/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectioniterator;

import exercises.Person;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public class CollectionIteratorExample {
    
    public static void main(String[] args) {
        
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 18),
                new Person("Lewis", "Carroll", 27),
                new Person("Thomas", "Carl", 18),
                new Person("Charlotte", "Bront", 23),
                new Person("Mattew", "Arnold", 23)
        );
        
        
        System.out.println("Using for loop");
        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }
        
        
        System.out.println("Using foreach");
//        for(Person p:people){
//            System.out.println(p);
//        }
        

        //below ones is equavialent of for each iteration which is writen above
        people.forEach(p ->System.out.println(p));
//        people.forEach(System.out::println);//metod reference ile de etmek olar
        
    }
}
