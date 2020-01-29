/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.util.Scanner;

/**
 *
 * @author murad_isgandar
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void calculate() {
        // TODO code application logic here4
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        

        System.out.println("Input operation: ");
        char o = scanner.next().charAt(0);
        
        double c = 0;
        if (o == '+') {

            c = a + b;

        } else if (o == '-') {

            c = a - b;

        } else if (o == '*') {

            c = a * b;

        } else if (o == '/') {

            c = a / b;

        }
        System.out.println("Result: " +c);
        

    }

}
