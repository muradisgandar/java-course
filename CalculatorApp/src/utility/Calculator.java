/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Scanner;



/**
 *
 * @author murad_isgandar
 */
public class Calculator {
   
    public static void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number1: ");
        double num1 = sc.nextInt();
        System.out.println("Please enter number2: ");
        double num2 = sc.nextInt();
        System.out.println("Please Enter your operation: ");
        char ch  = sc.next().charAt(0);
        double result = 0;
        switch (ch) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = division(num1, num2);
                break;
            default:
                System.out.println("Invlalid operation!!!");
                break;
        }
        System.out.println("Result: "+result);
    }
    public static double add(double a,double b ){
        return a+b;
    }
    public static double subtract(double a,double b ){
        return a-b;
    }
    public static double multiply(double a,double b ){
        return a*b;
    }
    public static double division(double a,double b ){
        return a/b;
    }
    
    

}
