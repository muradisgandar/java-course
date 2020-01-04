/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    public static void main(String[] args) {

        EMELIYYAT e = EMELIYYAT.TOPLA;
        double net = e.hesabla(10, 1);

        EMELIYYAT[] arr = EMELIYYAT.values();
        for (EMELIYYAT em : arr) {
            System.out.println(em);

        }
        EMELIYYAT a = EMELIYYAT.valueOf("TOPLA");
        System.out.println(a);


//        System.out.println(e.name());

//        System.out.println(net);
//
//        System.out.println(e.getOperatonSymbol());
    }

}
