/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public class StreamsExample2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);

        }

        list.stream().forEach(i -> System.out.println("printed " + i));//normal sira ile chap olunacaq ,1 thread ishleyir
        list.parallelStream().forEach(i -> System.out.println("printed " + i));//normal sira olmayacaq multi thread ishleyir(arxada ozu source u bolur , xususi tool vasitesile threadler yaranir ve ishleyirler)
        //umumiyyetle parallelStream() istifadesi uzun source u(stream in uzerinde ishlediyi dataya source deyilir) hisselere parchalamaqla multi thread ,multi core veziyyet yaratmaq uchundur

        //bunlar arasinda ferq e aid diger classda example var
        
        
        
        /*
        In parallel stream, Fork and Join framework is used in the background to create multiple threads.
        Parallel streams create ForkJoinPool instance via static ForkJoinPool.commonPool() method.
        */
    }

}
