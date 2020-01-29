/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference;

/**
 *
 * @author murad_isgandar
 */
public class MethodReferenceExample1 {

    public static void main(String[] args) {

//        Thread t = new Thread( ()-> printMessage());
        Thread t = new Thread(MethodReferenceExample1::printMessage);//method reference is used MethodReferenceExample1 ::printMessage === ()-> printMessage(). her 2 halda dogrudur

        t.start();

        
    }

    private static void printMessage() {
        System.out.println("Hello World");
    }

}
