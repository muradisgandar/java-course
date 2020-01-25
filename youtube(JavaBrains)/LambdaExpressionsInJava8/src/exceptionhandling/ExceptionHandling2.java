/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.function.BiConsumer;

/**
 *
 * @author murad_isgandar
 */
public class ExceptionHandling2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int key = 0;

        process(arr, key, wrapperLambda((v, k) -> System.out.println(v / k)));

    }

    private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : arr) {
            consumer.accept(i, key);
        }

    }

    //wrapper lambda using 
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);

            } catch (Exception e) {
                System.out.println("Arithmetic exception happened");
            }
        };
    }

}
