/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodscalculatorapp;

import java.util.Scanner;

/**
 *
 * @author murad_isgandar
 */
public class MethodsCalculatorApp {

    
    public static double addition(double a, double b) {

        double c = a + b;
        return c;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner.nextDouble();

        System.out.println("Input b: ");
        double b = scanner.nextDouble();

        System.out.println("Which operation do you want? + , - ,* ,/");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = addition(a, b);
                
                break;
            case '-':
                result = subtraction(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = division(a, b);
                break;
            default:
                System.out.println("Invalid Input!!!");
                break;
        }
        System.out.println("Result: " + result);

    }

    

    public static double subtraction(double a, double b) {

        double c = a - b;
        return c;
    }

    public static double multiply(double a, double b) {

        double c = a * b;
        return c;
    }

    public static double division(double a, double b) {

        double c = a / b;
        return c;
    }

}
