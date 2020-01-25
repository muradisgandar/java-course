/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closures;

/**
 *
 * @author murad_isgandar
 */
public class ClosuresExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 40;
        doProcess(a, i -> System.out.println(a + b));
        

    }

    private static void doProcess(int i, Process p) {
        p.process(i);
        //process metodu ishleyerken b nide neze alir(sout operationda) .bes nece olur ki, process ozu birbasha b(varable olaraq) ni qebul etmeden bu bash verir?
        //yuxarida lambda exp. procese oturerken onun qiymeti(value si) frozen halda oturulur(variable yox value oturulur),(jvm basha dushur ki burada b ist oluancaq)
        //burada b ye closure deyilir
        
    }

}

interface Process {

    void process(int i);
}
