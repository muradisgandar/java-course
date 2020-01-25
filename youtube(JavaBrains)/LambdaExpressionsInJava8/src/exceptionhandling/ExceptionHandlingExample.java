/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.function.BiConsumer;
/*
different from Consumer,this interface accept(T t,K k) method have 2 arguments ,that's why
we can pass different arguments and operate different operations with BiConsumer
below example Biconsumer is applied in math operations with using lambda expressions
*/

/**
 *
 * @author murad_isgandar
 */
public class ExceptionHandlingExample {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int key = 0;

        process(arr, key, (v, k) -> {

            try {
                System.out.println(v / k);
            } catch (ArithmeticException ex) {
                System.out.println("Arithmetic exception happened");
            }
            
        });

    }

    private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : arr) {
            consumer.accept(i, key);//try-catch blokunun burada olmasi single responsibility prinsipine ziddir
            //process methodu ancaq accept() i chalishdirir ve onun her hansi exception u tutmaq kimi bir zerureti yoxdur
            //ona gorede try-catch, lambda expression process metoduna gonderilerken ishelyir(yuxarida yazilib)
        }

    }

}
